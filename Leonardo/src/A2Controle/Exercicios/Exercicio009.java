package A2Controle.Exercicios;

import java.util.Scanner;

public class Exercicio009 {
    public static void main(String[] args) {
        //9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
        Integer[] num = new Integer[10];
        Scanner scan = new Scanner(System.in);
        int maior = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº numero", i);
            num[i-1] = scan.nextInt();
            if (num[i-1] > maior){
                maior = num[i-1];
            }
        }
        scan.close();
        System.out.printf("O maior numero digitado foi: %d\n", maior );
    }
}
