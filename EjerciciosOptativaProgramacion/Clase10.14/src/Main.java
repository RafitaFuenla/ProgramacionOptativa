import java.util.Scanner;

public class Main   {

    public static void main(String[] args) {
        System.out.println("Inciado programa de operadores");
        Operadores operacionesVariables = new Operadores();
        operacionesVariables.operadoresAritmeticos();
        operacionesVariables.operadoresAsigacion();
        operacionesVariables.operadoresComparacion();
        operacionesVariables.operadoresLogicos();


        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Dime tu nombre y apellido");
        String nombre = lectorTeclado.nextLine(); //permiter poner espacios

        System.out.println("Que salario queres ganar?");
        double salarioEntrada = lectorTeclado.nextDouble(); //lee numeros enteros o decimales

        System.out.println("Que edad tienes?");
        int edad = lectorTeclado.nextInt();

        System.out.println("Tienes permiso de conducir?");
        boolean conducir = lectorTeclado.nextBoolean();
        operacionesVariables.evaluarCanditado(salarioEntrada,  edad, conducir, nombre);
    }
}
