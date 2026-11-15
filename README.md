# Regresión Lineal Simple en Java

Implementación en Java del método de *Mínimos Cuadrados* para el ajuste de funciones lineales. El programa calcula la pendiente (β₁), la ordenada al origen (β₀), el coeficiente de correlación de Pearson (r), el coeficiente de determinación (r²) y realiza estimaciones a partir del modelo obtenido.

## Estructura del Proyecto

El código fuente está organizado dentro del paquete Ajuste_de_Funciones:

* RegresionLineal.java: Contiene los métodos matemáticos para calcular las sumatorias, los coeficientes de regresión, los indicadores estadísticos (r y r²) y las predicciones.
* Main.java: Clase principal que contiene el conjunto de datos de prueba, invoca los cálculos e imprime los resultados en consola.

## Requisitos Previos

Para ejecutar este proyecto localmente necesitas tener instalado:
* *Java Development Kit (JDK)* versión 8 o superior.
* *Git* para clonar el repositorio.

## Instrucciones de Uso

1. *Clonar el repositorio:*
   Abre una terminal y descarga el proyecto en tu computadora:
   bash
   git clone <URL-DEL-REPOSITORIO>
   cd <NOMBRE-DE-LA-CARPETA>
   

2. *Compilar el código fuente:*
   Desde la carpeta raíz del proyecto (donde se ubica el directorio Ajuste_de_Funciones), compila ambos archivos .java:
   bash
   javac Ajuste_de_Funciones/*.java
   

3. *Ejecutar el programa:*
   Inicia la ejecución llamando a la clase Main junto con el nombre de su paquete:
   bash
   java Ajuste_de_Funciones.Main
   

## Ejemplo de Salida en Consola

Al ejecutar el programa con los datos de prueba incluidos en Main.java, se mostrará una salida similar a la siguiente:

text
--- RESULTADOS DE MINIMOS CUADRADOS Y CORRELACION ---
Sumatorias: n=5, X= 15.0, Y= 30.1, X2= 55.0, Y2= 220.7, XY= 110.2
Pendiente (beta1): 1.9900
Ordenada al origen (beta0): 0.0500
Modelo obtenido: Y = 0.0500 + 1.9900X
Coeficiente de Pearson (r): 0.9994
Coeficiente de Determinacion (r2): 0.9988

--- PRUEBA DE PREDICCION ---
Para X = 6.0, el valor estimado de Y es: 11.9900
