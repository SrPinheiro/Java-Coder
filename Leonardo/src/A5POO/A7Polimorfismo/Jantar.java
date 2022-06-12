package A5POO.A7Polimorfismo;

class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(20);

        Arroz fd1 = new Arroz(2);
        Feijao fd2 = new Feijao(5);
        Sorvete fd3 = new Sorvete(20);

        convidado.comer(fd2);
        System.out.println(convidado.getPeso());
    }
}
