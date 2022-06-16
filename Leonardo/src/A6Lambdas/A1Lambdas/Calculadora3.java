package A6Lambdas.A1Lambdas;

import java.util.function.BinaryOperator;

public class Calculadora3 {
    public static void main(String[] args) {

        BinaryOperator<Double> calc = (x, y) -> x + y ;

        System.out.println(calc.apply((double) 6,(double) 5));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply((double) 6,(double) 5));

        BinaryOperator<Integer> calc2 = Integer::sum;
        System.out.println(calc2.apply(5,9));

    }


}
