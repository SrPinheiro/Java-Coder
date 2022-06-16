package A6Lambdas;

public class Calculadora {
    public static void main(String[] args) {
        Calculo calc = new Soma();
        System.out.println(calc.executar(4,3));

        calc = new Multiplicar();
        System.out.println(calc.executar(4,3));

    }
}
