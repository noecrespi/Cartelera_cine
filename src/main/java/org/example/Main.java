package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        // En todas las opciones se debe solicitar al usuario la ruta del fichero de entrada y de salida.
        //
        //Además de controlar las excepciones (checked) que son obligatorias, debemos crear una excepción nueva para el
        // caso en que la ruta del fichero de entrada/salida sea inválida (no esté informada) y generando una nueva
        // excepción, llamada RutaInvalida. Esta excepción se capturará en el main, y una vez capturada llamaremos al
        // método imprimirError e imprimiremos el mensaje de la excepción por consola. Este método se caracteriza por:
        //
        //Tener un constructor que recibe un mensaje que se utilizará para informar y personalizar que a posteriori se
        // escribirá.
        //
        //Tener un método que permitirá escribir en un fichero de errores el mensaje con la siguiente información
        // mensaje personalizado + timestamp +getStackTrace().
        //
        //Si hubiera más información en el fichero de errores, esta se debe mantener.

        Scanner sc = new Scanner(in);

        System.out.println("""
                Cartelera de CineCIFFBMOLL
                            
                1. Lectura y escritura del fichero de cartelera byte a byte (byte Streams).
                2. Lectura y escritura de fichero de cartelera carácter a carácter (character Streams).
                3. Lectura y escritura de fichero línea a línea con buffers (character Streams).
                """);

        System.out.print("Introduce una opción: ");
        //String ruta = sc.nextLine();

        /*try {
            FileInputStream in = new FileInputStream(ruta);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (c == in.read() != -1) {

        } Finally {
            if (in != null) {
                in.close();
            }
        }*/

        //bite a bite
        int i = 0;
       ArrayList <String> lista1 = new ArrayList<>();
        lista1.add("------\n \n");
        lista1.add("Año: ");
        lista1.add("\n \n");
        lista1.add("Director: ");
        lista1.add("\n \n");
        lista1.add("Duración: ");
        lista1.add("\n \n");
        lista1.add("Sinopsis: ");
        lista1.add("\n \n");
        lista1.add("Reparto: ");
        lista1.add("\n \n");
        lista1.add("Sesión: ");
        lista1.add("  horas");
        lista1.add("\n \n");


        String msm;

        ArrayList <String> lista2 = new ArrayList<>();
        String titulo = "";
        String age = "";
        String director = "";
        String duracion = "";
        String sinopsis = "";
        String reparto = "";
        String sesion = "";





        try(FileInputStream fin = new FileInputStream("/Users/noecrespi/workspace/2DAW/programación/Cartelera_cine/src/main/java/org/example/texto/fichero_inicial")) {
            FileOutputStream fout = new FileOutputStream("/Users/noecrespi/workspace/2DAW/programación/Cartelera_cine/src/main/java/org/example/texto/fichero_destino.txt");
            fout.write("Cartelera de CineCIFFBMOLL \n \n ----".getBytes());


            do{
                i = fin.read();
                String texto = "";
                int j = 0;

                // para cada elemento de la lista se le asigna un valor hasta que encuentre un # lo asigne a la variable
                if(i == '#' && i != -1){
                    fout.write('\n');
                }else if(i == '{' && i != -1){
                    fout.write("\n \n".getBytes());
                    j = 0;
                }else {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Error al abrir el fichero");
            System.out.println(exc.getMessage());
        }
    }
}