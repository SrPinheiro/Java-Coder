package A2Controle;

public class A7Break {
    public static void main(String[] args) {
        // break quebra *qualquer laço* assim que executado

        for(int i = 0; i <10; i++){
            if(i == 5){
               break;
                //nesse caso, quando o valor da variavel i for igual a 5, o for sera quebrado!
            }
            System.out.println(i);
        }
        System.out.println("===========");

        //break rotulado
        externo: for(int i = 0; i <10; i++){
          for(int j = 0; j <10; j++){
                if(i==1){
                    break externo;
                }
                System.out.println(i + " " + j);
            }
            System.out.println(" ");
        }
    }
}
