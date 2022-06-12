package A5POO.A7Polimorfismo;

class Pessoa {
    private double peso;

    public void comer(Arroz food){
        this.peso += food.getPeso();
    }

    public void comer(Feijao food){
        this.peso += food.getPeso();
    }
    public void comer(Sorvete food){
        this.peso += food.getPeso();
    }

    public Pessoa(double peso){
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0){
            this.peso = peso;
        }
    }
}
