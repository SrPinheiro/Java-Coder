package A5POO.A5Heranca;

class Heroi extends Jogador{

    Heroi(int x, int y){
        super(x,y);
    }
    boolean atacar(Jogador oponente){
        super.atacar(oponente);
        return true;
    }

}
