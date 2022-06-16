package A6Lambdas.A3Predicate;

class Produto {
    final String nome;
    double preco;
    double desconto;
    double precoComDesconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.precoComDesconto = preco * (1 - desconto);
    }
}
