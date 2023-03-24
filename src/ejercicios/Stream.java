package ejercicios;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
// 8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

public class Stream {
    public static void main(String[] args) {

        try {
            InputStream fileIn = new FileInputStream("/etc/arch");  // fichero de origen
            byte[] datos = fileIn.readAllBytes();
            fileIn.close();

            PrintStream fileOut = new PrintStream("arc.txt");  // fichero destino
            fileOut.write(datos);
            fileOut.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Fichero copiado de todas maneras.");
        }
    }
}
