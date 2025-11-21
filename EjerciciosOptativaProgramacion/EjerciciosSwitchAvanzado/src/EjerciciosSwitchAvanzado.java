import java.util.Scanner;

public class EjerciciosSwitchAvanzado {

    public void ejercicio01() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué nota obtuviste?");
        double calificacion = sc.nextDouble();

        // Convertimos el double a int según el rango indicado (truncar hacia abajo)
        int nota = (int) calificacion;

        char letra = switch (nota) {
            case 0, 1, 2, 3 -> 'F';
            case 4 -> 'D';
            case 5, 6 -> 'C';
            case 7, 8 -> 'B';
            case 9, 10 -> 'A';
            default -> '?';
        };

        System.out.printf("Obtuviste una nota de %.2f, con una calificación de %c%n", calificacion, letra);

        sc.close();
    }

    public enum Moneda {
        DOLAR,
        LIBRA,
        YEN,
        PESO
    }

    public void ejercicio02() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que cantidad de EUROS quieres convertir?");
        double euros = sc.nextDouble();

        System.out.printf("Eligue la moneda de destino.%nDOLAR, LIBRA, YEN o PESO.%n");
        String monedaDestino = sc.next().toUpperCase();

        Moneda monedadestino = Moneda.valueOf(monedaDestino);

        switch (monedadestino) {
            case DOLAR -> System.out.printf("La conversion de %.2f euros, son %.2f dolares.%n", euros, euros * 1.1);
            case LIBRA -> System.out.printf("La conversion de %.2f euros, son %.2f libras.%n", euros, euros * 0.85);
            case YEN -> System.out.printf("La conversion de %.2f euros, son %.2f yens.%n", euros, euros * 160);
            case PESO -> System.out.printf("La conversion de %.2f euros, son %.2f pesos.%n", euros, euros * 21);
        }

        sc.close();

    }

    public void ejercicio03() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que tempareatura hace?");
        int temperatura = sc.nextInt();

        int rango =
                (temperatura < 0) ? 1 :
                        (temperatura <= 15) ? 2 :
                                (temperatura <= 25) ? 3 :
                                        (temperatura <= 35) ? 4 :
                                                5;

        switch (rango) {
            case 1 -> System.out.println("NOS CONGELAMOS! Hace menos de 0 grados, hay que abrigrase mucho");
            case 2 -> System.out.println("Hace bastante frio, hay que abrigarse bien");
            case 3 -> System.out.println("Hace templado, ya no hay que abrigarse tanto");
            case 4 -> System.out.println("Hace calor, con poquita ropa nos vale");
            case 5 -> System.out.println("Hace muchisima calor, bañador y a la piscina");
            default -> System.out.println("Temperatura no valida");
        }

        sc.close();
    }
}
