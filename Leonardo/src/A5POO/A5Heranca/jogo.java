package A5POO.A5Heranca;

class jogo {
    public static void main(String[] args) {
        Jogador p1 = new Jogador(0,0);
        Jogador p2 = new Heroi(0,0);
        Jogador p3 = new Monstro();


        p1.andar(Direcao.NORTE);
        p1.andar(Direcao.NORTE);
        p1.andar(Direcao.NORTE);
        p1.andar(Direcao.NORTE);

        p2.andar(Direcao.NORTE);
        p2.andar(Direcao.NORTE);
        p2.andar(Direcao.NORTE);
        p2.andar(Direcao.NORTE);
        p2.andar(Direcao.LESTE);

        p2.atacar(p1);
        p1.atacar(p2);

        System.out.println("Vida p1: " + p1.vida);
        System.out.println("Vida p2: " + p2.vida);
        System.out.println("Vida p3: " + p3.vida);

    }
}
