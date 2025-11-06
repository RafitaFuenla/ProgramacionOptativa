import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio {
    private Scanner lecturaTeclado; // null

    public void ejercicio1() {
         /*
    Hágase una aplicación que permita introducir el número de bebidas y bocadillos
    comprados (valores entre 0 y 20). Además se podrá introducir el precio de cada
    bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00)
    €). También se podrá introducir el número de alumnos que realizaron la compra
    (valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las
    bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno
    redondeada a 2 decimales. (CosteBar)
     */

        // 1. Introducir valores
        // 2. Guardar en variables
        lecturaTeclado = new Scanner(System.in);
        System.out.println("Cuantos bocatas vais a pedir");
        int numeroBocatas = lecturaTeclado.nextInt();
        System.out.println("Cuantos bebidas vais a pedir");
        int numeroBebidas = lecturaTeclado.nextInt();
        System.out.println("Cuanto cuesta cada bocatas");
        double precioBocata = lecturaTeclado.nextDouble();
        System.out.println("Cuanto cuesta cada bebida");
        double precioBebida = lecturaTeclado.nextDouble();
        System.out.println("Cuantas personas entran en la cuenta");
        int personas = lecturaTeclado.nextInt();
        // 3. Realizar calculos
        double precioBocatas = numeroBocatas * precioBocata;
        double precioBebidas = numeroBebidas * precioBebida;
        double costeTotal = precioBocatas + precioBebidas;
        // int/int -> int
        double precioPersona = costeTotal / personas;
        // 4. Mostrar datos
        System.out.printf("El precio de los bocatas es %.2f%n", precioBocatas);
        System.out.printf("El precio de los bebidas es %.2f%n", precioBebidas);
        System.out.printf("El precio total es %.2f%n", costeTotal);
        System.out.printf("El precio por persona es %.2f%n", precioPersona);
        lecturaTeclado.close(); // Hay que cerrar el flujo de datos para evitar errores y evitar que no se guarden los datos
        lecturaTeclado = null; // Para dejarlo "limpio"

        // Printf, para formatear la salida
        // %.2 para que ponga solo dos decimales.
        // d=numero sin decimales, f=numero con decimeales, b=boleano, s=letra
        // /n o %n para que haya un salto de linea, ya que Printf no hace saltos de linea por defecto
    }

    public void ejercicio02() {
        //    Permítase introducir el valor con IVA de una compra con dos decimales
//   (la compra no puede ser superior a 500€ ni inferior a 0€) y el valor del
//   IVA de dicha compra (valor entero entre 0 y 25%).¿Cuánto costó la compra
//   sin IVA?¿Cuánto fue el IVA? Muéstrese los resultados redondeados a dos
//   decimales. (Compra)

        lecturaTeclado = new Scanner(System.in);

// Pedir datos
        System.out.println("Cuánto ha costado la compra? (Valor entre 0 y 500)");
        double precioCompra = lecturaTeclado.nextDouble();

        System.out.println("Qué porcentaje es el IVA? (Valor entre 0 y 25)");
        int porcentajeIva = lecturaTeclado.nextInt();

// Validar datos
        boolean datosValidos = precioCompra >= 0 && precioCompra <= 500
                && porcentajeIva >= 0 && porcentajeIva <= 25;

// Calcular solo si los datos son válidos
        double sinIva = datosValidos ? precioCompra / (1 + porcentajeIva / 100.0) : 0.0; //Comprueba requisitos de datosValidos. Si es true, ok si no=0,0
        double iva = datosValidos ? precioCompra - sinIva : 0.0; //Comprueba requisitos de datosValidos. Si es true, ok si no=0,0

// Mostrar resultados
        System.out.printf("Datos válidos: %b%n", datosValidos);
        System.out.printf("Precio sin IVA: %.2f%n", sinIva);
        System.out.printf("IVA: %.2f%n", iva);

        lecturaTeclado.close();
        lecturaTeclado = null;
    }

    public void ejercicio03(){
        /*Se introducen los 5 dígitos de un número
        (decenas de mil, unidades de mil, centenas, decenas y unidades),
        y se obtiene el número correspondiente. (Numero)*/

        lecturaTeclado = new Scanner(System.in);

        // Pedir datos:
        System.out.println("Que numero quieres comprobar (valor introducido entre 0 y 99.999");
        int numero = lecturaTeclado.nextInt(); //79050

        // Validar datos
        boolean datoValido = numero >=0 && numero <99999;

        // Realizar calculos:
        int decenasMil = datoValido ? numero/10000 : 0;
        int unidadesMil = datoValido ? (numero / 1000) % 10: 0;
        int centenas = datoValido ? (numero / 100) % 10: 0;
        int decenas = datoValido ? (numero / 10) % 10: 0;
        int unidades = datoValido ? numero%10: 0;

        System.out.println("Comprobacion de datos: "+datoValido);
        System.out.println("Decenas de millar: "+decenasMil);
        System.out.println("Unidades de millar: "+unidadesMil);
        System.out.println("Centenas: "+centenas);
        System.out.println("Decenas: "+decenas);
        System.out.println("Unidades: "+unidades);
    }

    public void ejercicio4() {

        // Hágase un programa que convierta segundos en horas, minutos y segundos.

        lecturaTeclado = new Scanner(System.in);
        // 1- pedir datos
        System.out.println("Cuantos segundos quieres pasar a tiempo");
        int seguntosTotal = lecturaTeclado.nextInt(); // 24973
        // 2- realizar calculos
        // segundos -> 1 hora -> 3600
        // minutos -> 1 hora -> 60
        // segundos -> 1 minuto -> 60
        int horas = seguntosTotal / 3600;
        int minutos = (seguntosTotal % 3600) / 60; // Dividir entre 3600 y el resto es lo que utiliza el resto para calcular lois minutos.
        int segundo = seguntosTotal % 60;
        // 3- mostrar datos
        System.out.println("El numero de horas es " + horas);
        System.out.println("El numero de minutos es " + minutos);
        System.out.println("El numero de segundos es " + segundo);
        lecturaTeclado.close();
        lecturaTeclado = null;
    }
}