import java.util.Scanner;

public class AnalisisSueldos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de sueldos a analizar: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Debe ingresar al menos un sueldo.");
            scanner.close();
            return;
        }

        double sueldo;
        double sueldoMaximo = Double.MIN_VALUE; // Inicializamos con el valor mínimo posible.
        double sueldoMinimo = Double.MAX_VALUE; // Inicializamos con el valor máximo posible.
        double sumaSueldos = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el sueldo " + i + ": ");
            sueldo = scanner.nextDouble();

            sumaSueldos += sueldo;

            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }

            if (sueldo < sueldoMinimo) {
                sueldoMinimo = sueldo;
            }
        }

        double promedioSueldos = sumaSueldos / n;

        System.out.println("Sueldo más alto: " + sueldoMaximo);
        System.out.println("Sueldo más bajo: " + sueldoMinimo);
        System.out.println("Promedio de sueldos: " + promedioSueldos);

        scanner.close();
    }
}
