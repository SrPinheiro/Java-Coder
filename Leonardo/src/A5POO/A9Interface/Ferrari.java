package A5POO.A9Interface;

class Ferrari extends Carro implements Esportivo, Luxo{

    private boolean turbo;
    private boolean ar;


    public Ferrari(int maxVelocity){
        super(maxVelocity);
        this.setAceleracao(15);
    }

    @Override
    public void ligarTurbo() {
        if(!this.turbo){
            this.setAceleracao(this.getAceleracao() * 2);
            this.turbo = true;
        }
    }

    @Override
    public void desligarTurbo() {
        if(this.turbo){
            this.setAceleracao(this.getAceleracao() / 2);
            this.turbo = false;
        }
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
