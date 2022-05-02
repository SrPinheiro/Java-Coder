package A5POO;


class jogo {
    public static void main(String[] args) {
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

class Carro{
    Motor m1 = new Motor();

    void acelerar() {
        if(m1.injecao < 2.6){
            m1.injecao += 0.4;
        }
    }

    void frear(){
        if(m1.injecao > 0.5){
            m1.injecao-= 0.4;
        }
    }

    void ligar(){
        m1.ligado = true;
    }

    void desligar(){
        m1.ligado = false;
    }

    boolean motor(){
        return m1.ligado;
    }
}


class Motor{
    boolean ligado = false;
    double injecao = 1.0;

    int giros(){
        if(ligado){
            return (int) Math.round(this.injecao*3000);
        }else{
            return 0;
        }
    }
}