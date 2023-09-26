import java.util.Scanner;
import java.util.Arrays;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Solicitar al usuario ingresar 5 números.
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenar de mayor a menor.
        Arrays.sort(numeros);
        System.out.println("Números ordenados de menor a mayor: " + Arrays.toString(numeros));

        // Ordenar de menor a mayor.
        int[] numerosInverso = new int[5];
        for (int i = 0; i < 5; i++) {
            numerosInverso[i] = numeros[4 - i];
        }
        System.out.println("Números ordenados de mayor a menor: " + Arrays.toString(numerosInverso));

        scanner.close();
    }
}
