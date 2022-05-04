package A5POO.A2Shopping;

public class shopping {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("jubileu");

        p1.add(new Produtos("Arroz 1k", 6.5, 5));
        p1.add(new Produtos("feijao 1k", 7.5, 5));
        p1.add(new Produtos("carne 1k", 10.0, 4));
        p1.add(new Produtos("Coxinha", 2.5, 4));
        p1.add(new Produtos("Cerveja", 22, 6));

        p1.add("RTX-3090", 5000,1);
        p1.add("Memoria ram", 200,2);
        p1.add("SSD", 300,1);


        System.out.printf("Quantidade de itens: %s\n", p1.quantidade());
        System.out.printf("Preco Final: %s\n", p1.precoFinal());
    }
}
