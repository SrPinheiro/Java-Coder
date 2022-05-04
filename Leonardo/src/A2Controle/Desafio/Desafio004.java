package A2Controle.Desafio;

public class Desafio004 {
    public static void main(String[] args) {
        //use o for para fazer uma escada com # sem utilizar numeros para controla-lo

        for(String i = "#"; !i.equals("######"); i+="#"){
            System.out.println(i);
        }
    }
}
