import java.util.Scanner;

public class EjerciicosSwitchAvanzado {

    public void ejercicio01() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué nota obtuviste?");
        double calificacion = sc.nextDouble();

        // Convertimos el double a int según el rango indicado (truncar hacia abajo)
        int nota = (int) Math.floor(calificacion);

        char letra = switch (nota) {
            case 0,1,2,3 -> 'F';
            case 4 -> 'D';
            case 5,6 -> 'C';
            case 7,8 -> 'B';
            case 9,10 -> 'A';
            default -> '?';
        };

        System.out.printf("Obtuviste una nota de %.2f, con una calificación de %c%n", calificacion, letra);

        sc.close();
    }
}
