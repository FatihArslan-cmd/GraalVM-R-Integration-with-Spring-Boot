<p align="center">
  <h3 align="center">GraalVM + R Integration with Spring Boot for Real-Time Plotting</h3>
  <p align="center">
  A project that integrates GraalVM, R, and Spring Boot to visualize real-time data from a CSV file using dynamically generated plots. <br/><br/>
    <a href="https://github.com/FatihArslan-cmd/SWE307-2024-Data-visualization"><strong>🌟 Explore the docs »</strong></a>
    <br/><br/>
    <a href="https://github.com/FatihArslan-cmd/SWE307-2024-Data-visualization/issues">🐛 Report Bug</a>
    .
    <a href="https://github.com/FatihArslan-cmd/SWE307-2024-Data-visualization/issues">✨ Request Feature</a>
  </p>
</p>

## 📖 Table of Contents

1. [📘 About The Project](#about-the-project)
2. [🚀 Getting Started](#getting-started)
    - [📋 Prerequisites](#prerequisites)
    - [⚙️ Installation](#installation)
    - [🛠️ Usage](#usage)
3. [📦 Dependencies](#dependencies)
4. [Screenshots](#Screenshots)
5. [🤝 Contributing](#contributing)
6. [📞 Contact](#contact)

## <a id="about-the-project"></a>📘 About The Project

Key Features:<br/>
- 🛠️ **CSV Data Loading**: Loads and processes data from a CSV file for plotting.<br/>
- 📊 **GraalVM + R Integration**: Uses GraalVM to execute R scripts from Java, generating dynamic plots.<br/>
- 📈 **Real-Time Plot Updates**: The plot refreshes every second with new data values.<br/>
- 📄 **SVG Plot Output**: The R script generates plots in SVG format for easy web rendering.<br/>

<hr>
## <a id="Screenshots"></a>Screenshots
![Ekran görüntüsü 2024-10-21 152814](https://github.com/user-attachments/assets/7b384666-655e-4098-8c03-c2015c82a5de)
<p align="center"> 
<img src="https://github.com/user-attachments/assets/7b384666-655e-4098-8c03-c2015c82a5de" width="500" alt="Screenshot 4"/>  </p> 

## <a id="getting-started"></a>🚀 Getting Started

To get a local copy up and running, follow these simple steps.

### <a id="prerequisites"></a>📋 Prerequisites

Ensure you have the following software installed:
- [GraalVM](https://www.graalvm.org/docs/getting-started/)
- R (with `lattice` library)
- [Maven](https://maven.apache.org/install.html)

### <a id="installation"></a>⚙️ Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/FatihArslan-cmd/SWE307-2024-Data-visualization.git
    ```
2. Navigate to the project directory:
    ```bash
    cd SWE307-2024-Data-visualization
    ```
3. Install dependencies:
    ```bash
    mvn clean install
    ```
4. Run the project:
    ```bash
    mvn spring-boot:run
    ```

<hr>

### <a id="usage"></a>🛠️ Usage

Once the project is running:
- Open your browser and navigate to `http://localhost:8080/plot` to view the real-time plot.
- The plot will refresh every second with the next value from the CSV data.

<hr>

## <a id="dependencies"></a>📦 Dependencies

- Java 17+
- GraalVM (for polyglot R execution)
- Spring Boot
- OpenCSV (for CSV file processing)
- Maven (for build management)
-R over and native-image GraalVM
<hr>

## <a id="contributing"></a>🤝 Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

To contribute:

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request
<br/>

<hr>

## <a id="contact"></a>📞 Contact

**Your Name** - *Software Developer* - [Your GitHub](https://github.com/FatihArslan-cmd)

