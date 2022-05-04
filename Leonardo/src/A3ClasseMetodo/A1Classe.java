package A3ClasseMetodo;

public class A1Classe{
    public static void main(String[] args) {

        A2Classe p1 = new A2Classe();
        var p2 = new A2Classe();

        p1.nome = "Celular";
        p1.preco = 1800;
        p1.desconto = 0.25;

        p2.nome = "computador";
        p2.preco = 3000;
        p2.desconto = 0.3;

        System.out.printf("Nome: %s\n", p2.nome);
        System.out.printf("Preço: R$%s\n",p2.preco);
        System.out.printf("Desconto: %s%%\n",p2.desconto);
        System.out.printf("Preço Final: %s\n", p2.preco-(p2.preco*p2.desconto));
    }
}
class A2Classe{
    String nome;
    double preco;
    double desconto;
}
