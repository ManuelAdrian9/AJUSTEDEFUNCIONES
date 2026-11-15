package Ajuste_de_Funciones;

public class Main {
    public static void main(String[] args) {
        // 1. Definir el conjunto de datos de prueba
        double[] x = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] y = {2.1, 3.9, 6.2, 7.8, 10.1};

        // 2. Ejecutar el calculo de minimos cuadrados
        double[] resultados = RegresionLineal.calcularMinimosCuadrados(x, y);

        // 3. Extraer beta0 y beta1 para hacer una prediccion de prueba
        double beta0 = resultados[0];
        double beta1 = resultados[1];
        double valorX = 6.0;

        double prediccion = RegresionLineal.predecir(beta0, beta1, valorX);

        System.out.println("\n--- PRUEBA DE PREDICCION ---");
        System.out.printf("Para X = %.1f, el valor estimado de Y es: %.4f%n", valorX, prediccion);
    }
}
