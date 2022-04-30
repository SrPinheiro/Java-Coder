package A3ClasseMetodo;

public class A2Metodos {
    public static void main(String[] args) {
        Produto c = new Produto();
        c.nome = "celular";
        c.preco = 1800;
        c.desconto = 0.25;
        System.out.printf("Nome: %s\nPreço: %s\nDesconto: %s%%\nP.Final: %s \n", c.nome, c.preco, (c.desconto*100), c.precoComDesconto());


    }

}
class Produto{
    String nome;
    double preco;
    double desconto;

    double precoComDesconto(){
        return preco*(1-desconto);
    }
}
