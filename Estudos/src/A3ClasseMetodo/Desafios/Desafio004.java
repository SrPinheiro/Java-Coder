package A3ClasseMetodo.Desafios;

public class Desafio004 {
    public static void main(String[] args) {
        Produto a1 = new Produto();
        Produto a2 = new Produto();

        Produto.desconto = 0.25;

        a1.nome = "celular";
        a1.preco = 1500;

        a2.nome = "Computador";
        a2.preco = 3000;

        System.out.println(a1.precoComDesconto());
        System.out.println(a2.precoComDesconto());

    }

    static class Produto {
        String nome;
        double preco;
        static double desconto = 0.25;

        double precoComDesconto() {
            return preco * (1 - desconto);
        }
    }
}
