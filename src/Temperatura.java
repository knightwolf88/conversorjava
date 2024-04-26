public class Temperatura {


    public static double ACelsius(double valor) {

        double resultado = ((valor - 32) * 5)/9;
        return resultado;
    }

    public static double AFarenheit(double valor) {

        double resultado = ((valor * 9)/5) +32;
        return resultado;
    }
}
