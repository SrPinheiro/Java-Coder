package A6Lambdas.A3Predicate;

import java.util.function.Predicate;

class predicate {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> prod.precoComDesconto > 4000; // retorna true ou false

        Produto notebook = new Produto("Sansung", 5000, 0.10);

        System.out.println(isCaro.test(notebook));
        System.out.println(notebook.precoComDesconto);
    }
}
