public class paisesDeAmerica {
    public static void main(String[] args) {
        String[] paisesAmerica = {
            "Argentina", "Bahamas", "Barbados", "Belice", "Bolivia",
            "Brasil", "Canadá", "Chile", "Colombia", "Costa Rica",
            "Cuba", "Dominica", "Ecuador", "El Salvador", "Estados Unidos",
            "Granada", "Guatemala", "Guyana", "Haití", "Honduras",
            "Jamaica", "México", "Nicaragua", "Panamá", "Paraguay",
            "Perú", "República Dominicana", "San Cristóbal y Nieves",
            "Santa Lucía", "San Vicente y las Granadinas", "Surinam",
            "Trinidad y Tobago", "Uruguay", "Venezuela"
        };

        imprimirPaises(paisesAmerica);

        int numLetras = 4;
        int count = contarPaisesPorLongitud(paisesAmerica, numLetras);
        System.out.println("Número de países que tienen " + numLetras + " letras son: " + count);
    }

    public static void imprimirPaises(String[] paises) {
        System.out.println("Lista de países de América:");
        for (String pais : paises) {
            System.out.println("- " + pais);
        }
    }

    public static int contarPaisesPorLongitud(String[] paises, int numLetras) {
        int contador = 0;
        for (String pais : paises) {
            if (pais.replaceAll(" ", "").length() == numLetras) {
                contador++;
            }
        }
        return contador;
    }
}
