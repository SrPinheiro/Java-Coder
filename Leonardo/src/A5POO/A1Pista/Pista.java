package A5POO.A1Pista;

public class Pista {
    public static void main(String[] args){
        Carro c1 = new Carro();

        System.out.printf("Esta ligado: %s\n", c1.motor());
        System.out.printf("Giros: %sRPM\n", c1.m1.giros());

        c1.ligar();
        System.out.printf("Esta ligado: %s\n", c1.motor());

        System.out.printf("Giros: %sRPM\n", c1.m1.giros());

        c1.acelerar();
        c1.acelerar();
        System.out.printf("Giros: %sRPM\n", c1.m1.giros());

        c1.frear();
        System.out.printf("Giros: %sRPM\n", c1.m1.giros());

        c1.desligar();
        System.out.printf("Giros: %sRPM\n", c1.m1.giros());


        // faltou encapsulamento!!
        //c1.m1.injecao = -30;

    }
}
