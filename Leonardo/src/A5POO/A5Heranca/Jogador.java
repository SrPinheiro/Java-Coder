package A5POO.A5Heranca;

class Jogador{
    int vida = 50;
    int x;
    int y;
    int forca;

    Jogador(int x, int y){
        this.x = x;
        this.y = y;
    }

    void andar(Direcao direcao){
        switch (direcao) {
            case NORTE -> y++;
            case SUL -> y--;
            case LESTE -> x++;
            case OESTE -> x--;
        }
    }
    boolean atacar(Jogador oponente){
        int deltax = Math.abs(x-oponente.x);
        int deltay = Math.abs(y-oponente.y);
        if(deltax == 0 && deltay ==1){
            oponente.vida -= this.forca;
            return  true;
        }else if(deltax == 1 && deltay == 0){
            oponente.vida -= this.forca;
            return true;
        }else{
            return false;
        }
    }

}
