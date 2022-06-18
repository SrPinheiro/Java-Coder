package A6Lambdas.A9Desafios;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class D1BinaryOperator {
    /*
    1 - A partir do produto calcular o preco real (preco com desconto)
    2 - calcular imposto: >= 2500 (8,5%) | <2500 (0%)
    3 - Frete >= 3000 (100) | < 3000 (50)
    4 - arredondar: deixar 2 casas decimais
    5 - formatar: R$
     */
    public static void main(String[] args) {
        Produto p1 = new Produto("Celular", 3235.89,0.13);

        BinaryOperator<Double> precoReal = (n1, n2) -> n1 * (1 - n2);
        UnaryOperator<Double> imposto = n1 -> n1 >= 2500 ? n1 * (8.5/100) : 0.0 ;
        UnaryOperator<Double> frete = n1 -> n1 >= 3000 ? 100.0 : 50.0;
        UnaryOperator<Double> arredondar = n1 -> Double.parseDouble(String.format("%.2f", n1).replace(",", "."));
        UnaryOperator<Double> formatar = n1 -> Double.parseDouble(String.format("%.2f", n1).replace(",", "."));

        System.out.printf("Preco: %.2f\n", precoReal.apply(p1.preco, p1.desconto));
        System.out.printf("imposto: %.2f\n", precoReal.andThen(imposto).apply(p1.preco,p1.desconto));
        System.out.printf("Frete: %.2f\n", frete.apply(precoReal.apply(p1.preco, p1.desconto) + precoReal.andThen(imposto).apply(p1.preco,p1.desconto)));
        System.out.printf("Valor Final: %s\n", (arredondar.andThen(formatar).apply(precoReal.apply(p1.preco, p1.desconto) + imposto.apply(precoReal.apply(p1.preco, p1.desconto)) + frete.apply(imposto.apply(precoReal.apply(p1.preco, p1.desconto))))));
    }
}