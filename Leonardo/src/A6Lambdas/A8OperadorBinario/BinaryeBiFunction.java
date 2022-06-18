package A6Lambdas.A8OperadorBinario;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryeBiFunction {
    public static void main(String[] args) {
        //Você decide 1 tipo e o valor de entrada/saida seram desse tipo
        BinaryOperator<Double> media = (n1, n2) -> (n1+n2) / 2;

        //Você decide qual o tipo dos valores e do retorno
        BiFunction<Double, Double, String> media2 = (n1, n2) -> (n1+n2)/2 > 7 ? "Aprovado" : "Reprovado";


        System.out.println((media.apply((double) 8, (double) 8)));
        System.out.println(media2.apply((double) 8, (double) 8));

    }
}
