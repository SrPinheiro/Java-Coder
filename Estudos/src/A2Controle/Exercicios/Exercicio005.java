package A2Controle.Exercicios;

import java.util.Scanner;

public class Exercicio005 {
    public static void main(String[] args) {
        //5. Refatorar o exercício 04, utilizando a estrutura switch.
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Digite um numero:");
            var num1 = scan.nextInt();
            var num2 = num1;
            var num3 = 0;
            if(num1<0){
                break;
            }
            while (num2 != 0) {
                if (num1 % num2 == 0) {
                    num3 += 1;
                }
                num2 -= 1;
            }
                switch(num3) {
                    case 2:
                        System.out.println("Numero PRIMO!");
                        break;
                    default:
                        System.out.println("Numero NÃO primo!");
                }
        }
        scan.close();
    }
}
