package A1Fundamentos.Desafios;

public class Desafio005 {
    public static void main(String[] args){
        boolean terca = true;
        boolean quinta = false;

        if(terca && quinta){
            System.out.println("comprar TV de 50\"");
            System.out.println("Comprar sorvete com a familia");
        }else if(terca || quinta){
            System.out.println("comprar TV de 30\"");
            System.out.println("Comprar sorvete com a familia");
        }else{
            System.out.println("Ficar em casa");
        }
    }
}
