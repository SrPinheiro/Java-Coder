package A4Colecoes;

import java.util.Arrays;

public class A1Array {
    public static void main(String[] args) {

        //criando uma array (lista) com 6 espaços:
        System.out.println("=======Array========");
        int[] a = new int[6];

        //atribuindo valores:
        a[0] = 10;

        //atribuindo valores direto na array:
        int[] a1 = {1,4,7};

        System.out.println(a[0]);

        //mostrando todos os valores da variavel:
        System.out.println(Arrays.toString(a));

        //mostrando valores 1 por 1:

        System.out.println("=======For========");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        //mostrando valores usando foreach:

        System.out.println("=======Foreach========");
        for(var i: a){
            System.out.println(i);
        }







    }
}
