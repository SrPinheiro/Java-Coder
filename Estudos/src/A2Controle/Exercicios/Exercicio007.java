package A2Controle.Exercicios;

import java.util.Scanner;

public class Exercicio007 {
    public static void main(String[] args) {
        //7. Criar um programa que enquanto estiver recebendo números positivos,
        // imprime no console a soma dos números inseridos, caso receba um número negativo,
        // encerre o programa. Tente utilizar a estrutura do while.

        Scanner scan = new Scanner(System.in);
        var num = 0;
        float total = 0F;
        do{
            System.out.println("Digite um numero:");
            num = scan.nextInt();
            if(num > 0){
                total+=num;
                System.out.printf("Total: %.2f\n",total);
            }else{
                break;
            }
        }while(num>=0);
        scan.close();
    }
}
