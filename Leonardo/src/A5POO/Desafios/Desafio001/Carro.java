package A5POO.Desafios.Desafio001;

class Carro {
    final int maxVelocity;
    int velocidade;
    int aceleracao = 5;

    public Carro(int maxVelocity){
        this.maxVelocity = maxVelocity;
    }

    void acelerar() {
    }

    void frear() {
        if (velocidade >= 5) {
            this.velocidade -= 5;
        }
    }
}
