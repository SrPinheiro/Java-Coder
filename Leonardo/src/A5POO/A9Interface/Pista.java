package A5POO.A9Interface;

class Pista {
    public static void main(String[] args) {
        Civic c1 = new Civic(150);
        Ferrari c2 = new Ferrari(400);

        System.out.println(c1.velocidade);
        System.out.println(c2.velocidade);

//        c1.acelerar();
//        c1.acelerar();
//        c1.acelerar();
//        c1.acelerar();
//        c1.acelerar();


        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();

        System.out.println("TURBOOO");
        c2.ligarTurbo();

        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();

        System.out.println(c1.velocidade);
        System.out.println(c2.velocidade);
    }
}
