package modul;

public class Calculadora {

    public  void sumar(int op1, int op2){
        int resultado = op1 + op2;
        System.out.println("El resultado de la suma es "+resultado);

    }

    protected void restar(int op1, int op2){ // Los metodos protected, pueden se usados, siempre y cuando esten ene la misma carpeta raiz que esta el Main, en este caso SRC, o importandola
        int resultado = op1 - op2;
        System.out.println("El resultado de la resta  es "+resultado);
    }

    public int multiplicar(int op1, int op2){
        int resultado = op1*op2;
        return resultado;
    }
}
