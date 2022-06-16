package A6Lambdas.A4Consumer;

import java.util.function.Consumer;

class consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = valor -> System.out.println(valor.nome); // não retorna nada

        Produto p1 = new Produto("celular", 2000, 0.2);

        imprimir.accept(p1);
    }
}
