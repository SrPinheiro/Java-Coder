package A6Lambdas.A3Predicate;

import java.util.function.Predicate;

public class predicate2 {
    public static void main(String[] args) {
        Predicate<Integer> isPar = p1 -> p1 % 2 == 0;
        Predicate<Integer> isTresDigitos = p1 -> p1 >= 100 && p1 <=999;

        System.out.println(isTresDigitos.and(isPar).test(258));
        System.out.println(isTresDigitos.or(isPar).test(27));
    }
}
