import modul.Calculadora; // Para que la clase Calculadora, puede ser llamada

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proyecto metodos");
        System.out.println("Vamos a realziar llamadas a metodos");

//        Calculadora.sumar(4,4);

        Calculadora operacionesMatermaticas = new Calculadora();
        operacionesMatermaticas.sumar(1,2);
        operacionesMatermaticas.restar(4,3);
        operacionesMatermaticas.multiplicar(7,3);

        /*
        String data="Maria";
        saludar(data);
        despedir();
        System.out.println();
        data = "Rafa";
        saludar(data);
        despedir(); */



//        saludar(("Rafa"));
//        saludar(("Maria"));
//        saludar(("Lucas"));
//        saludar(("Martin"));




    }

    public static void saludar(String nombre){
        System.out.println("Hola "+nombre);
        System.out.println("Encantado de saludarte");
        System.out.println("Vamos a practicar el llamado a metodos");
    }

    public static void despedir(){
        System.out.println("A cerrar el portatil que hay que irse a casa");
    }
}
