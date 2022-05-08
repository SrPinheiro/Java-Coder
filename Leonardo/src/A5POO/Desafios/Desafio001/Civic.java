package A5POO.Desafios.Desafio001;

class Civic extends Carro{
    int aceleracao = 5;
    int maxVelocity = 100;

    @Override
    void acelerar() {
        if ((velocidade + aceleracao) <= maxVelocity){
            velocidade += aceleracao;
        }
    }
}

