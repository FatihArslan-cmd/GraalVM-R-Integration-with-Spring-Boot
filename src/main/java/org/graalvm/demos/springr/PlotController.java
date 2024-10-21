package org.graalvm.demos.springr;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

@Controller
public class PlotController {

    @Value(value = "classpath:plot.R")
    private Resource rSource;

    @Autowired
    private Function<DataHolder, String> plotFunction;

    private double[] col5Data = new double[100]; // CSV verisini saklamak için

    public PlotController() throws IOException, CsvValidationException {
        loadCsvData();
    }

    private void loadCsvData() throws IOException, CsvValidationException {
        // CSV dosyasını ClassPathResource ile yükle
        CSVReader reader = new CSVReader(new FileReader(new ClassPathResource("swe307_pro1.csv").getFile()));
        String[] line;
        int rowIndex = 0;
        reader.readNext(); // Başlık satırını atla

        while ((line = reader.readNext()) != null && rowIndex < 100) {
            col5Data[rowIndex] = Double.parseDouble(line[4]); // 5. kolon verisini al (index 4)
            rowIndex++;
        }
        reader.close();
    }

    @Bean
    Function<DataHolder, String> getPlotFunction(@Autowired Context ctx)
            throws IOException {
        Source source = Source.newBuilder("R", rSource.getURL()).build();
        return ctx.eval(source).as(Function.class);
    }

    private int currentIndex = 0;

    @RequestMapping(value = "/plot", produces = "image/svg+xml")
    public ResponseEntity<String> load() {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Refresh", "1");

        String svg = "";
        synchronized (plotFunction) {
            double currentValue = col5Data[currentIndex];
            svg = plotFunction.apply(new DataHolder(currentValue));
            currentIndex = (currentIndex + 1) % col5Data.length; // Sıradaki veriye geç
        }

        return new ResponseEntity<>(
                svg,
                responseHeaders,
                HttpStatus.OK);
    }

    @Bean
    public Context getGraalVMContext() {
        return Context.newBuilder().allowAllAccess(true).build();
    }
}
