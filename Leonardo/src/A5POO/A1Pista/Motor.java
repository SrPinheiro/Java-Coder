package A5POO.A1Pista;

class Motor{
    boolean ligado = false;
    double injecao = 1.0;

    int giros(){
        if(ligado){
            return (int) Math.round(this.injecao*3000);
        }else{
            return 0;
        }
    }
}