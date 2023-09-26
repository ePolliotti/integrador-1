import java.util.Scanner;

public class ClasificacionNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la nota: ");
        int nota = scanner.nextInt();

        // Utilizamos una estructura switch para determinar la clasificación de la nota.
        String detalle = "";

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
                detalle = "Insuficiente";
                break;
            case 4:
                detalle = "Suficiente";
                break;
            case 5:
            case 6:
                detalle = "Bien";
                break;
            case 7:
            case 8:
                detalle = "Notable";
                break;
            case 9:
            case 10:
                detalle = "Sobresaliente";
                break;
            default:
                System.out.println("La nota ingresada no es válida. Debe estar en el rango de 0 a 10.");
                return; // Termina el programa si la nota no es válida.
        }

        System.out.println("Nota: " + nota);
        System.out.println("Detalle: " + detalle);

        scanner.close();
    }
}
