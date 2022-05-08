package A5POO.Desafios.Desafio001;

class Pista {
    public static void main(String[] args) {
        Carro c1 = new Ferrari();
        Carro c2 = new Civic();

        System.out.println(c1.velocidade);
        System.out.println(c2.velocidade);

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();

        c1.frear();
        c1.frear();

        System.out.println(c1.velocidade);
        System.out.println(c2.velocidade);
    }
}
