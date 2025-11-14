import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Crea un programa para jugar una partida virtual de dardos entre dos
        //jugadores. El objetivo es que uno de los jugadores llegue exactamente a 0 puntos
        //partiendo desde 301.
        //Reglas:
        // ✅ Nada más empezar pide el nombre de cada jugador
        // ✅ Cada jugador comienza con 301 puntos.
        // ✅ En cada turno, un jugador lanza 3 dardos.
        // ✅ Cada dardo genera un número aleatorio entre 0 y 60 (simulando puntuación en dardos).
        // ✅ La puntuación del turno es la suma de los 3 dardos.
        // ✅➡️ Resta la puntuación del turno al total de puntos del jugador.
        // ✅➡️ Si la puntuación restante es menor que 0, se considera que el jugador "se pasa" y su total no cambia ese turno.
        // ✅➡️ El primer jugador que llegue exactamente a 0 gana la partida.
        // ✅➡️ Después de cada turno, muestra las puntuaciones actuales y quién va ganando (el que tiene menos puntos).
        // ✅➡️ Al finalizar, muestra el ganador y cuántos turnos tomó la partida.

        System.out.println("Nombre jugador 1:");
        String nombre1 = sc.next();
        System.out.println("Nombre jugador 2:");
        String nombre2 = sc.next();

        int puntos1 = 301;
        int puntos2 = 301;
        int turnoActual = 1;


        while (puntos1 > 0 && puntos2 > 0) {

            // --- TURNO JUGADOR 1 (completo con 3 dardos) ---
            int sumaTurno = 0;
            System.out.println("Turno de: " + nombre1);

            for (int i = 0; i < 3; i++) {  // Los 3 dardos
                int dardo = (int) (Math.random() * 61);
                sumaTurno += dardo; // Esta es la suma de los puntos adquiridos en cada ronda de 3 tiros
                System.out.printf("Dardo %d: %d\n", (i + 1), dardo);
            }

            System.out.println("Puntuación del turno: " + sumaTurno);
            System.out.println();

            if (puntos1 - sumaTurno >= 0) {
                puntos1 -= sumaTurno;
            } else {
                System.out.println("¡Te pasaste! No se restan puntos este turno.");
                System.out.println();
            }

            // --- TURNO JUGADOR 2 (completo con 3 dardos) ---
            sumaTurno = 0; // Resetea para el jugador 2
            System.out.println("Turno de: " + nombre2);

            for (int i = 0; i < 3; i++) {
                int dardo = (int) (Math.random() * 61);
                sumaTurno += dardo;
                System.out.printf("Dardo %d: %d\n", (i + 1), dardo);
            }

            System.out.println("Puntuación del turno: " + sumaTurno);
            System.out.println();

            if (puntos2 - sumaTurno >= 0) {  // ¿Quedaría en 0 o positivo?
                puntos2 -= sumaTurno;
            } else {
                System.out.println("¡Te pasaste! No se restan puntos este turno.");
                System.out.println();
            }

            turnoActual++; // Sumamamos 1 turno, despues de cada ronda de 3 tiros

            System.out.printf("%s tiene %d puntos y  %s tiene %d puntos.\n", nombre1, puntos1, nombre2, puntos2);
            System.out.println();

            if (puntos1 < puntos2){
                System.out.printf("Va ganando %s.", nombre1);
                System.out.println();
                System.out.println();
            }else{
                System.out.printf("Va ganando %s.", nombre2);
                System.out.println();
                System.out.println();
            }
        }
        if (puntos1 == 0) {
            System.out.printf("¡EL GANADOR ES: %s!\n", nombre1);
        } else {
            System.out.printf("¡EL GANADOR ES: %s!\n", nombre2);
        }
        System.out.printf("La partida duro %d turnos.", turnoActual);

        sc.close();
        sc = null;
    }
}
