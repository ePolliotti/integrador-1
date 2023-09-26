import java.util.Scanner;

public class ContarCifras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entre 0 y 9,999: ");
        int numero = scanner.nextInt();

        // Verificamos si el número está en el rango permitido.
        if (numero >= 0 && numero <= 9999) {
            // Convertimos el número a una cadena para contar las cifras.
            String numeroStr = Integer.toString(numero);
            int cantidadCifras = numeroStr.length();

            System.out.println("El número " + numero + " tiene " + cantidadCifras + " cifras.");
        } else {
            System.out.println("El número ingresado no pertenece al rango solicitado.");
        }

        scanner.close();
    }
}
