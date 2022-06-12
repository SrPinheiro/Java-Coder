package A5POO.Desafios.Desafio001;

class Civic extends Carro{
    final int aceleracao = 5;
    int maxVelocity = 100;

    Civic(int maxVelocity){
        super(maxVelocity);
    }

    @Override
    void acelerar() {
        if ((velocidade + aceleracao) > maxVelocity){
            velocidade = maxVelocity;
        }else{
            velocidade += aceleracao;
        }
    }
}

