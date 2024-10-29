import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class laboratorio {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cantidadEstudiantes;

            // PASO 1: INGRESA LA CANTIDAD DE ESTUDIANTES
            System.out.print("Ingrese la cantidad de estudiantes: ");
            cantidadEstudiantes = Integer.parseInt(reader.readLine());

            // Arreglos para almacenar nombres y notas
            String[] nombres = new String[cantidadEstudiantes];
            double[] notas = new double[cantidadEstudiantes];

            // PASO 2: INGRESA LAS NOTAS DEL ESTUDIANTE
            for (int i = 0; i < cantidadEstudiantes; i++) {
                System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
                String nombre = reader.readLine();
                System.out.print("Ingrese el apellido del estudiante " + (i + 1) + ": ");
                String apellido = reader.readLine();

                // Validar nombre y apellido
                if (nombre.length() == 0 || apellido.length() == 0) {
                    System.out.println("El nombre y el apellido son obligatorios.");
                    i--; // Decrementar i para repetir la entrada
                    continue;
                }

                nombres[i] = nombre + " " + apellido;

                double nota;
                do {
                    System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
                    nota = Double.parseDouble(reader.readLine());
                    if (nota < 0 || nota > 20) {
                        System.out.println("La nota debe estar entre 0 a 20.");
                    }
                } while (nota < 0 || nota > 20);

                notas[i] = nota;
            }

            // PASO 3: CALCULA EL PROMEDIO, NOTA MÁS ALTA Y MÁS BAJA
            double sumaNotas = 0;
            double notaMasAlta = notas[0];
            double notaMasBaja = notas[0];

            for (double nota : notas) {
                sumaNotas += nota;
                if (nota > notaMasAlta) {
                    notaMasAlta = nota;
                }
                if (nota < notaMasBaja) {
                    notaMasBaja = nota;
                }
            }

            double promedio = sumaNotas / cantidadEstudiantes;

            // Imprimir resultados
            System.out.println("Promedio de notas:" + promedio);
            System.out.println("Nota más alta:" + notaMasAlta);
            System.out.println("Nota más baja:" + notaMasBaja);

        }
    }
