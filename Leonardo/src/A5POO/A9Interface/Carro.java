package A5POO.A9Interface;

abstract class Carro {
    int maxVelocity;
    int velocidade; // por padrao é 0
    private int aceleracao; // por padrao é 0


    public Carro(int maxVelocity){
        this.maxVelocity = maxVelocity;
    }


    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        if(aceleracao >= 0){
            this.aceleracao = aceleracao;
        }
    }

    void acelerar() {
        if ((velocidade + aceleracao) > maxVelocity){
            velocidade = maxVelocity;

        }else{
            velocidade += aceleracao;
        }
        System.out.printf("velocidade atual: %sKm/h\n", this.velocidade);
    }

    void frear() {
        if (velocidade >= 5) {
            this.velocidade -= 5;
        }
    }
}
