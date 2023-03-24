package ejercicios;

import java.util.Scanner;

public class Divide {
    // 7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
    public static void main(String[] args) {
        DividePorCero();
    }

    public static void DividePorCero() {
        Scanner consola = new Scanner(System.in); // iteracion con la consola.
        System.out.println("Introduce dos numeros: ");

        int num1 = consola.nextInt();
        int num2 = consola.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }

}
