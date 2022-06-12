package A5POO.A9Interface;

class Civic extends Carro implements Luxo{
    private boolean ar;

     Civic(int maxVelocity){
        super(maxVelocity);
        this.setAceleracao(5);
    }

    @Override
    public void ligarAr() {
        this.ar = true;
    }

    @Override
    public void desligarAr() {
        this.ar = false;
    }
}

