package A5POO.A3CompraDeCarro;

class loja {
    public static void main(String[] args) {
        Carro c1 = new Carro("Ferrari", 500000, true);

        Pessoa p1 = new Pessoa("LariGirl", 1000000);
        Pessoa p2 = new Pessoa("Loguito", 1000000);

        //comprando carro
        System.out.println("==============Compra de carros=============");
        System.out.println("Carros de p1: ");
        p1.carros();
        System.out.println("Carros de P2:");
        p2.carros();
        System.out.println("P1 Compra ferrari");
        p1.comprarCarro(c1);
        System.out.println("Carros de P1:");
        p1.carros();
        System.out.println("Carros de P2:");
        p2.carros();
        System.out.println("P2 compra carro de P1");
        p2.comprarCarro(c1);
        System.out.println("Carros de P1:");
        p1.carros();
        System.out.println("Carros de p2:");
        p2.carros();

        //Ligando carro
        System.out.println("==========girando a chave========");
        p2.girarChave(1);
        p2.girarChave(1);

        //travando a venda do carro
        System.out.println("travando a venda do Carro:");
        p2.trava(1);
        p2.trava(1);

        //alterando preco do carro
        System.out.println("========= Alterando preco=====");
        System.out.println("preco atual:");
        p2.mostrarPreco(1);
        p2.alterarPreco(1,50);
        System.out.println("preco modificado:");
        p2.mostrarPreco(1);


    }
}
