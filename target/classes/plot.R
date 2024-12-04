
library(lattice)
data <<- numeric(100)

function(dataHolder) {
    svg()
    data <<- c(data[2:100], dataHolder$value)

    plot <- xyplot(randomData~time,
       data=data.frame(randomData = data, time = -99:0),
       main='Column 5 Datas',
       ylab="Datas", type = c('l', 'g'), col.line='dark orange')
    print(plot)
    svg.off()
}
