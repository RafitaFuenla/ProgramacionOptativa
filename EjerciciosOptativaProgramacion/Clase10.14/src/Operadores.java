public class Operadores {
    public void operadoresAritmeticos() {
// UNARIOS
        int operandoUno = 5;
        // incremento
        operandoUno++; // Esto le suma 1 al valor que ya tenia
        operandoUno++; // Esto le suma 1 al valor que ya tenia
        operandoUno++; // Esto le suma 1 al valor que ya tenia
        operandoUno++; // Esto le suma 1 al valor que ya tenia

        System.out.println("EL valor del operadn uno despues de los incrementos es: " + operandoUno);

        // Decremento, le resta 1 al valor que ya tenia
        operandoUno--; // Esto le resta 1 al valor final de operandoUno
        operandoUno--; // Esto le resta 1 al valor final de operandoUno
        operandoUno--; // Esto le resta 1 al valor final de operandoUno

        System.out.println("EL valor de operando uno despues de los decrementeos es: " + operandoUno);

// BINARIOS -> DOS operadores. Suma (+), resta (-), multi (*), divi (/), modulo (resto de dision) (%)
        operandoUno = 8;
        int operandoDos = 3;
        int suma = operandoUno + operandoDos;
        System.out.println("EL resultado de ls suma es " + suma);

        int resta = operandoUno - operandoDos;
        System.out.println("EL resultado de la resta es; " + resta);

        int multi = operandoUno * operandoDos;
        System.out.println("El resultaod de la multiplicacion es: " + multi);
        double division = (double) operandoUno / operandoDos; // Castin, para que salgan decimeales se pasa temporalmente uno de los operadores a doble 8.0/3
        System.out.println("EL resultado de la division es: " + division);

        int modulo = operandoUno % operandoDos;
        System.out.println("El resultado del resto de diviison es; " + modulo);
        // Me vale para saber si el numero es par (/2) siendo el resto cero
        System.out.println();
        System.out.println();

    }


    public void operadoresAsigacion() {
        int operadorUno = 10;
        int operadorDos = 6;
        operadorUno += 5; // EL operadorUno guarda la suma de lo que valia operadorUno + el valor que indique.
        operadorUno += operadorDos;
        System.out.println("El valor de operadorUno es: " + operadorUno);

        operadorUno -= 5;  //16
        operadorUno *= 2;  //32
        operadorUno %= 2;   //0 (el resto de dividir ul ultimo operado (32) entre 2 = 0
        System.out.println("EL resultado de las asignaciones completa es: " + operadorUno);
        System.out.println();
        System.out.println();
    }

    public void operadoresComparacion() {
        int operandoUno = 10;
        int operandoDos = 20;
        boolean resultado = operandoUno > operandoDos;
        System.out.println("EL resultado de la comparacion es " + resultado);


        resultado = operandoUno < operandoDos;
        System.out.println("EL resultado de la comparacion es " + resultado);

        resultado = operandoUno <= operandoDos;
        resultado = operandoUno >= operandoDos;
        resultado = operandoUno == operandoDos;
        resultado = operandoUno != operandoDos;

        System.out.println();
        System.out.println();
    }

    public void operadoresLogicos() {
        int sueldo = 20000;
        int edad = 35;
        boolean carnetConducir = true;

        System.out.println("El canditado puede conducir:" + !carnetConducir);

        // Canditado valido si quiere cobrar menos de 30.000 y tiene menos de 40 años y puede condicir.
        boolean candidatoValido = sueldo < 30000 && edad < 40 && carnetConducir; // true
        candidatoValido = sueldo < 20000 || edad < 25 || carnetConducir && sueldo > 25000 && edad > 60;

        System.out.println("El candidato es valido " + candidatoValido);

        System.out.println();
        System.out.println();

    }

    public void evaluarCanditado(double sueldo, int edad, boolean conducir, String nombre) {
        boolean resultado = sueldo <= 20000 && edad < 40 && conducir;
        System.out.println("Evandulando al candidato "+nombre);
        System.out.println("La evaluacion del candidato es " + resultado);

    }
}


