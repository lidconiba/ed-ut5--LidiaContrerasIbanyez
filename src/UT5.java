import java.util.Scanner;

/*
    Programa que lee 4 calificaciones de tipo real y calcula la suma y su promedio
 */
public class UT5 {
    public static void main(String[] args) {
        double C1, C2, C3, C4, S, P;
        Scanner sc = new Scanner(System.in);

        // Lectura por teclado de las calificaciones
        System.out.print("Introduce la 1ª calificación: ");
        C1 = sc.nextDouble();
        System.out.print("Introduce la 2ª calificación: ");
        C2 = sc.nextDouble();
        System.out.print("Introduce la 3ª calificación: ");
        C3 = sc.nextDouble();
        System.out.print("Introduce la 4ª calificación: ");
        C4 = sc.nextDouble();

        // Operaciones
        S = C1 + C2 + C3 + C4;
        P = S / 4;

        // Salida por pantalla de los resultados
        System.out.println("Suma: " + S);
        System.out.println("Promedio: " + P);

        sc.close();
    }
}