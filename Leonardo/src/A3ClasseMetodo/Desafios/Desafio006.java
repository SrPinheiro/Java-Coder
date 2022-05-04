package A3ClasseMetodo.Desafios;

class jantar{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("julia", 70);

        Comida c1 = new Comida("Hamburguer", 1);
        Comida c2 = new Comida("Barca de sushi", 50);

        System.out.printf("Peso antes de comer: %.2f\n", p1.peso);
        p1.comer(c1);
        p1.comer(c2);
        System.out.printf("Peso depois de comer: %.2f\n", p1.peso);
    }
}

class Pessoa{
    String nome;
    double peso;

    Pessoa(String nome,double peso){
        this.nome = nome;
        this.peso = peso;
    }
    void comer(Comida a){
        this.peso += a.peso;
    }
}

class Comida{
    String nome;
    double peso;

    Comida(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
}

