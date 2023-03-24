package programa;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream,
// excepciones, un HashMap y un ArrayList, LinkedList o array.

public class PlantaDeAlegriaNuclear {
    public static void main(String[] args) {

        ArrayList<String> listaOperarios = new ArrayList<>();
        listaOperarios.add("Ever");
        listaOperarios.add("Manuela");
        listaOperarios.add("Barbara");
        listaOperarios.add("Ayelen");
        listaOperarios.add("Milagros");
        listaOperarios.add("Pedro");
        listaOperarios.add("Tomas");
        listaOperarios.add("Jose");

        System.out.println("Lista de todos los operarios: ");
        for (String lista : listaOperarios){
            System.out.println("Nombre: " + lista);
        }

        HashMap<Integer, String> legajoOperarios = new HashMap<>();
        legajoOperarios.put(314, "Ruiz");
        legajoOperarios.put(432, "Sanches");
        legajoOperarios.put(231, "Hernandez");
        legajoOperarios.put(345, "Soto");
        legajoOperarios.put(543, "Lopez");
        legajoOperarios.put(542, "Sanchez");
        legajoOperarios.put(431, "Gonzales");
        legajoOperarios.put(333, "Segundo");

        System.out.println("Legajos: ");
        for (Map.Entry<Integer, String> elemento : legajoOperarios.entrySet()){
            System.out.println("Numero: " + elemento.getKey());
            System.out.println("Apellido: " + elemento.getValue());
        }
        int[] lineaProduccion = {1, 2, 3};
        for( int linea : lineaProduccion){
            System.out.println("Lineas de produccion habilitadas: "+ linea);
        }


        try {
            InputStream fileIn = new FileInputStream("/operarios/reparador");  // fichero de origen
            byte[] datos = fileIn.readAllBytes();
            fileIn.close();

            PrintStream fileOut = new PrintStream("newReparador.txt");  // fichero destino
            fileOut.write(datos);
            fileOut.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }


    }
}
