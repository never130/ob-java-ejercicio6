package ejercicios;

public class Reverse {
    public static String reverse(String mensaje)  {
        return new StringBuilder(mensaje).reverse().toString();
    }
    public static void main(String[] args)
    {
        String mensaje = "Te amo Manu";
        mensaje = reverse(mensaje);

        System.out.println("La cadena de mensaje al reves es: " + mensaje);
    }
}
