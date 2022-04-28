package A2Controle;

public class A8Continue {
    public static void main(String[] args) {
        //o continue ele pula apenas 1 ciclo do laço
        for(int i= 0; i<=20; i++) {
            if(i%2 == 1){
                //nesse caso toda vez que o numero for impar ele vai pular o ciclo e vai para o proximo
                // fazendo assim com que apenas os numeros pares sejam imprimidor na tela
                continue;
            }
            System.out.println(i);
        }

        //continue rotulado
        externo: for(int i = 0; i <10; i++){
            for(int j = 0; j <10; j++){
                if(i==1 || i== 3){
                    continue externo;
                }
                System.out.printf("[%d %d]\n", i, j);
            }
            System.out.println(" ");
        }
    }
}
