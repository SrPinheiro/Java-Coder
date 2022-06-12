package A5POO.Desafios.Desafio001;

class Ferrari extends Carro{

    final int aceleracao = 15;
    int maxVelocity = 100;


    public Ferrari(int maxVelocity){
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
