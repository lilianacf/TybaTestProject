# TybaTestProject

Este proyecto corresponde a la automatización del módulo de calculadora-credito-hipotecario-vivienda en la página [metrocuadrado](https://www.metrocuadrado.com), su construcción fue implementada con el patrón Screenplay y el framework framework Serenity BDD y Cucumber con Java, al momento de descargar este proyecto se deben tener en cuenta los siguientes ítems para su ejecución.

## Necesario para la ejecución.
- Una versión de Gradle instalada igual o superior a la 6.5 
- Una versión de Java igual o superior a 1.8
- El Chromedriver del sistema operativo, se puede descargar de la página [chromedriver]( https://chromedriver.chromium.org)
- Se recomienda Intellij IDEA como IDE pero también es posible ejecutarlo en otros.

## Instalación

```bash
git clone https://github.com/lilianacf/TybaTestProject
```
- Abrir proyecto desde el IDE
- Importante dependiendo el S.O. se debe actualizar en el archivo serenity.properties que está en la raíz del proyecto el nombre del webdriver.chrome.driver ya que dependiendo del S.O. es la extensión del driver

```bash
webdriver.chrome.driver= chromedriver.exe   
webdriver.chrome.driver= chromedriver_linux64.exe
webdriver.chrome.driver= chromedriver_mac64.exe
```

## Ejecución
Se recomienda ejecutar por consola con el siguiente comando gradle.

```bash
gradle clean assemble test
```

## Reporte
El reporte se podrá visualizar en la carpeta llamada target en la raíz del proyecto allí se encuentra el  el archivo index.html en la ruta:

```bash
target/site/serenity/index.html
```