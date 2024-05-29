public class Moneda {

    private String base_code;
    private String target_code;
    private Double conversion_result;

    public String getBase() {
        return base_code;
    }

    public String getTarget() {
        return target_code;
    }

    public Double getConversion() {
        return conversion_result;
    }

/*
    public static double convertir(String base, String target,double ratio, double cantidad) {

        double resultado = cantidad*ratio;
        return resultado;
    }
*/

}
