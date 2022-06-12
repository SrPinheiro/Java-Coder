package A5POO.A8Polimorfismo2;

class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(20);

        System.out.println(convidado.getPeso());

        Arroz fd1 = new Arroz(2);
        Feijao fd2 = new Feijao(5);
        Sorvete fd3 = new Sorvete(20);

        convidado.comer(fd2);
        convidado.comer(fd1);
        convidado.comer(fd3);
        System.out.println(convidado.getPeso());
    }
}
