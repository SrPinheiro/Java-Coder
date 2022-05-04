package A5POO.A1Pista;

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