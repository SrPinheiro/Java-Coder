package A6Lambdas.A1Lambdas;

public class Calculadora2 {
    public static void main(String[] args) {

        Calculo soma = (x,y) ->{
            return x + y;
        };
        System.out.println(soma.executar(5,6));

        soma = (x, y) -> x * y;
        System.out.println(soma.executar(5,6));
    }


}
