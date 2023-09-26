import java.util.Scanner;

public class ValoresPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número de 3 dígitos: ");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 999) {
            System.out.println("Valores pares desde 0 hasta " + numero + ":");
            for (int i = 0; i <= numero; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println(); // Salto de línea para separar la salida.
        } else {
            System.out.println("El número ingresado no es válido. Debe ser de 3 dígitos.");
        }

        scanner.close();
    }
}
