package A5POO.A3CompraDeCarro;

class loja {
    public static void main(String[] args) {
        Carro c1 = new Carro("Ferrari", 500000, true);

        Pessoa p1 = new Pessoa("LariGirl", 1000000);
        Pessoa p2 = new Pessoa("Loguito", 1000000);

        p1.comprarCarro(c1);
        System.out.println("Carros de p1:");
        p1.carros();
        System.out.println("Carros de P2:");
        p2.carros();
        p1.bloquear(c1);
        p2.comprarCarro(c1);
        System.out.println("Carros de P2:");
        p2.carros();
        System.out.println("Carros de p1:");
        p1.carros();
        System.out.println("P2 compra carro de P1");
        p1.liberar(c1);
        p2.comprarCarro(c1);
        System.out.println("Carros de P2:");
        p2.carros();
        System.out.println("Carros de p1:");
        p1.carros();



    }
}
