package A6Lambdas.A5Function;

import java.util.function.Function;

public class funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par": "Impar"; // retorna qualquer valor

        Function<String, String> resultadoE = result -> "Resulado é: " + result;

        Function<String, String> empolgado = result -> result + "!!!!";

        System.out.println(parOuImpar
                           .andThen(resultadoE)
                           .andThen(empolgado).apply(8));

        System.out.println(empolgado.apply(resultadoE.apply(parOuImpar.apply(8))));
    }
}
