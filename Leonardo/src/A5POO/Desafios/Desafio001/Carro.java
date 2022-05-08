package A5POO.Desafios.Desafio001;

class Carro {
    int velocidade;
    int aceleracao = 5;

        void acelerar() {
        }

    void frear() {
        if (velocidade >= 5) {
            this.velocidade -= 5;
        }
    }
}
