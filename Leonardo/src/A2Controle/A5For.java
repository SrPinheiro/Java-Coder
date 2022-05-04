package A2Controle;

public class A5For {
    public static void main(String[] args) {

        for (int contador = 0; contador <=20; contador++){
            System.out.printf("i = %d\n",contador);
        }

        //se houver apenas 1 sentença não tem necessidade de criar um bloco de codigos...
        for(int contador = 20; contador >=0; contador-=1)
            System.out.println("contador " + contador);

        //for dentro do for

        for(int i = 0; i <10; i++){
            for(int j = 0; j <10; j++){
                System.out.printf("[%d %d]", i, j);
            }
            //esse print so serve para fazer uma quebra de linha...
            System.out.println();
        }


        //também é possivel usar a mesma variavel fora do for
        int i = 0;
        for(;i<10;i++){
            System.out.println(i);
        }
        System.out.println("saiu do for...");
        System.out.println(i);


        //for infinito:
            for(;;){
                System.out.println("teste");
            }

    }
}
