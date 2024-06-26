import com.google.gson.Gson;
import javax.swing.JOptionPane;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.URI;
import java.net.http.HttpResponse;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
       // System.out.println("Hello world!");
       // JOptionPane.showMessageDialog(null,"hola mundo");

        Object[] opcionesPrincipal = {"Convertir Monedas", "Convertir Temperatura"};

        // Mostrar el primer cuadro de diálogo
        Object seleccionPrincipal = JOptionPane.showInputDialog(null, "Selecciona una opción:",
                "Convertidor", JOptionPane.QUESTION_MESSAGE, null, opcionesPrincipal, opcionesPrincipal[0]);

        if (seleccionPrincipal != null) {
            // Dependiendo de la opción seleccionada, mostrar el cuadro de diálogo correspondiente
            if (seleccionPrincipal.equals("Convertir Monedas")) {
                convertirMonedas();
            } else if (seleccionPrincipal.equals("Convertir Temperatura")) {
                convertirTemperatura();
            }
        }
    }



    // Método para convertir monedas
    public static void convertirMonedas() {
        // Opciones para la conversión de monedas
        String json="";

        Object[] opcionesMonedas = {"Sol a Euros", "Sol a Dolar", "Sol a Libras esterlinas", "Sol a Yen Japones", "Sol a Won", "Euros a Sol", "Dolar a Sol", "Yen Japones a Sol", "Won a Sol"};

        // Mostrar el cuadro de diálogo para la conversión de monedas
        Object seleccionMonedas = JOptionPane.showInputDialog(null, "Selecciona una opción de conversión:",
                "Convertir Monedas", JOptionPane.QUESTION_MESSAGE, null, opcionesMonedas, opcionesMonedas[0]);

        // Aquí iría el código para realizar la conversión de monedas según la selección
        if (seleccionMonedas != null) {

            // Solicitar al usuario que ingrese la cantidad a convertir (validando que sea un número)
            double cantidad = obtenerNumero("Ingrese la cantidad a convertir:");

            // Realizar la conversión según la opción seleccionada
            double resultado = 0;
            HttpClient client=HttpClient.newHttpClient();
            if (seleccionMonedas.equals("Sol a Euros")) {

                HttpRequest request= HttpRequest.newBuilder()
                        .uri(URI.create("https://v6.exchangerate-api.com/v6/128723ceb019820b7dd67fcb/pair/PEN/EUR/"+cantidad))
                        .build();
                try {
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    json=response.body();
                    //  System.out.println(json);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (seleccionMonedas.equals("Sol a Dolar")) {
                HttpRequest request= HttpRequest.newBuilder()
                        .uri(URI.create("https://v6.exchangerate-api.com/v6/128723ceb019820b7dd67fcb/pair/PEN/USD/"+cantidad))
                        .build();
                try {
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    json=response.body();
                    //  System.out.println(json);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (seleccionMonedas.equals("Sol a Libras esterlinas")) {
                HttpRequest request= HttpRequest.newBuilder()
                        .uri(URI.create("https://v6.exchangerate-api.com/v6/128723ceb019820b7dd67fcb/pair/PEN/GBP/"+cantidad))
                        .build();
                try {
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    json=response.body();
                    //  System.out.println(json);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (seleccionMonedas.equals("Sol a Yen Japones")) {
                HttpRequest request= HttpRequest.newBuilder()
                        .uri(URI.create("https://v6.exchangerate-api.com/v6/128723ceb019820b7dd67fcb/pair/PEN/JPY/"+cantidad))
                        .build();
                try {
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    json=response.body();
                    //  System.out.println(json);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (seleccionMonedas.equals("Sol a Won")) {
                HttpRequest request= HttpRequest.newBuilder()
                        .uri(URI.create("https://v6.exchangerate-api.com/v6/128723ceb019820b7dd67fcb/pair/PEN/KRW/"+cantidad))
                        .build();
                try {
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    json=response.body();
                    //  System.out.println(json);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (seleccionMonedas.equals("Euros a Sol")) {
                HttpRequest request= HttpRequest.newBuilder()
                        .uri(URI.create("https://v6.exchangerate-api.com/v6/128723ceb019820b7dd67fcb/pair/EUR/PEN/"+cantidad))
                        .build();
                try {
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    json=response.body();
                    //  System.out.println(json);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (seleccionMonedas.equals("Dolar a Sol")) {
                HttpRequest request= HttpRequest.newBuilder()
                        .uri(URI.create("https://v6.exchangerate-api.com/v6/128723ceb019820b7dd67fcb/pair/USD/PEN/"+cantidad))
                        .build();
                try {
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    json=response.body();
                    //  System.out.println(json);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (seleccionMonedas.equals("Yen Japones a Sol")) {
                HttpRequest request= HttpRequest.newBuilder()
                        .uri(URI.create("https://v6.exchangerate-api.com/v6/128723ceb019820b7dd67fcb/pair/JPY/PEN/"+cantidad))
                        .build();
                try {
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    json=response.body();
                    //  System.out.println(json);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (seleccionMonedas.equals("Won a Sol")) {
                HttpRequest request= HttpRequest.newBuilder()
                        .uri(URI.create("https://v6.exchangerate-api.com/v6/128723ceb019820b7dd67fcb/pair/KRW/PEN/"+cantidad))
                        .build();
                try {
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    json=response.body();
                    //  System.out.println(json);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }

            Gson gson=new Gson();
            Moneda ratio= gson.fromJson(json,Moneda.class);
            resultado=ratio.getConversion();

            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

            // Preguntar al usuario si desea continuar usando el programa
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Continuar", JOptionPane.YES_NO_CANCEL_OPTION);

            // Manejar la opción seleccionada por el usuario
            if (opcion == JOptionPane.YES_OPTION) {
                // Si elige "Yes", volver al menú principal
                convertirMonedas(); // Llamada recursiva al método para volver al menú principal
            } else {
                // Si elige "No" o "Cancel", mostrar un mensaje de programa finalizado
                JOptionPane.showMessageDialog(null, "Programa Finalizado", "Adiós", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }


    // Método para convertir temperatura
    public static void convertirTemperatura() {
        // Opciones para la conversión de temperatura
        Object[] opcionesTemperatura = {"Celsius a Fahrenheit", "Fahrenheit a Celsius"};

        // Mostrar el cuadro de diálogo para la conversión de temperatura
        Object seleccionTemperatura = JOptionPane.showInputDialog(null, "Selecciona una opción de conversión:",
                "Convertir Temperatura", JOptionPane.QUESTION_MESSAGE, null, opcionesTemperatura, opcionesTemperatura[0]);

        // Realizar la conversión de temperatura según la opción seleccionada
        if (seleccionTemperatura != null) {
            if (seleccionTemperatura.equals("Celsius a Fahrenheit")) {
                // Realizar la conversión de Celsius a Fahrenheit
                double celsius = obtenerNumero("Ingrese la temperatura en grados Celsius:");
                double resultado = Temperatura.AFarenheit(celsius);
                JOptionPane.showMessageDialog(null, "La temperatura en Fahrenheit es: " + resultado);
            } else if (seleccionTemperatura.equals("Fahrenheit a Celsius")) {
                // Realizar la conversión de Fahrenheit a Celsius
                double fahrenheit = obtenerNumero("Ingrese la temperatura en grados Fahrenheit:");
                double resultado = Temperatura.ACelsius(fahrenheit);
                JOptionPane.showMessageDialog(null, "La temperatura en Celsius es: " + resultado);
            }
        }

        // Preguntar al usuario si desea continuar usando el programa
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Continuar", JOptionPane.YES_NO_CANCEL_OPTION);

        // Manejar la opción seleccionada por el usuario
        if (opcion == JOptionPane.YES_OPTION) {
            // Si elige "Yes", volver al menú principal
            convertirTemperatura(); // Llamada recursiva al método para volver al menú principal
        } else {
            // Si elige "No" o "Cancel", mostrar un mensaje de programa finalizado
            JOptionPane.showMessageDialog(null, "Programa Finalizado", "Adiós", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Método para obtener un número válido del usuario
    public static double obtenerNumero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                return Double.parseDouble(input); // Intenta convertir el input a double
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


}