import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int Stp = 0, CA = 0, SI = 0, CI = 0, cantidadEntradas = 7, num, contador = 0;

        System.out.println("Ingresa hasta " + cantidadEntradas + " números:");
        do {
            System.out.print("Número " + (contador + 1) + ": ");
            num = Integer.parseInt(reader.readLine());


            if (num > 0) {
                Stp += num;
            }

            if (num % 2 == 0) {
                CA++;
            } else {
                CI++;
                SI += num;
            }

            contador++;
        } while (contador < cantidadEntradas);


        double promedioImpares = (CI > 0) ? (double) SI / CI : 0;

        System.out.println("Suma de números positivos: " + Stp);
        System.out.println("Cantidad de números pares: " + CA);
        System.out.println("Promedio de números impares: " + promedioImpares);
    }
}