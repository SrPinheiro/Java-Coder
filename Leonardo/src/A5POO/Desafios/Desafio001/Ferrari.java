package A5POO.Desafios.Desafio001;

class Ferrari extends Carro{
    int aceleracao = 15;
    int maxVelocity = 300;
    @Override
    void acelerar() {
        if ((velocidade + aceleracao) <= maxVelocity){
            velocidade += aceleracao;
        }
    }
}
