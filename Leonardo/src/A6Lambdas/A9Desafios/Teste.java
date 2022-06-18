package A6Lambdas.A9Desafios;

import java.util.function.UnaryOperator;

public class Teste {
    public static void main(String[] args) {
        UnaryOperator<Double> arredondar = n1 -> Double.parseDouble(String.format("%.2f",  n1).replace(",","."));
        UnaryOperator<Double> formatar = n1 -> Double.parseDouble(String.format("%.2f", n1));

        System.out.printf("%.2f", (double) 1500);
        //System.out.println(arredondar.apply((double) 1500));
    }
}
