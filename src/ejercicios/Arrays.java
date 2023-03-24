package ejercicios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Arrays {
    public static void main(String[] args) {

        //1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String[] nombres = {"Manu ", "Rocio ", "Ever"};
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        //2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        int[][] arrayDoble = {{1, 2, 3, 4}, {10, 20, 30, 40}};
        for (int i = 0; i < arrayDoble.length; i++) {
            for (int j = 0; j < arrayDoble[i].length; j++) {
                System.out.println("Posicion del arrayDoble: [" + i + "][" + j + "] y valor: " + arrayDoble[i][j]);
            }
        }

        //3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        Vector<String> vector = new Vector<>();
        vector.add("Ever");
        vector.add("Rocio");
        vector.add("Manuela");
        vector.add("Love");
        vector.add("forever");
        vector.remove(2);
        vector.remove(3);
        System.out.println("Datos del vector: " + vector);

        //4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        vector.add("9");
        System.out.println("Tamaño: " + vector.size() + " - Capacidad: " + vector.capacity());

        //5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ever");
        arrayList.add("Rocio");
        arrayList.add("Manuela");
        arrayList.add("Love");

        for (String nombre : arrayList) {
            System.out.println(nombre);
        }

        LinkedList<String> listaEnlazada = new LinkedList<>();
        listaEnlazada.add("Ever");
        listaEnlazada.add("Rocio");
        listaEnlazada.add("Manuela");
        listaEnlazada.add("Love");
        for (String elemento : listaEnlazada) {
            System.out.println("Elementos de la lista enlazada: " + elemento);
        }

        //6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        ArrayList<Integer> arrayListInt = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arrayListInt.add(i);
        }
        for (int i = 0; i < arrayListInt.size(); i++) {
            if (arrayListInt.get(i) % 2 != 0) {
                arrayListInt.remove(i);
                i--;
            }
        }
        System.out.println("Arraylist con numeros pares: " + arrayListInt);

    }
}
