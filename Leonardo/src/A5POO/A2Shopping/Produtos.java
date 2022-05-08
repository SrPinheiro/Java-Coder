package A5POO.A2Shopping;

class Produtos{
    String nome;
    double preco;
    int quantidade;

    Pessoa cliente;

    Produtos(String nome,double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String toString() {
        return this.nome;
    }
}