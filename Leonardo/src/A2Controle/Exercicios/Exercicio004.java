package A2Controle.Exercicios;

import java.util.Scanner;

public class Exercicio004 {
    public static void main(String[] args) {
        //4. Criar um programa que receba um número e diga se ele é um número primo.
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Digite um numero:");
            var num1 = scan.nextInt();
            var num2 = num1;
            var num3 = 0;
            while (num2 != 0) {
                if (num1 % num2 == 0) {
                    num3 += 1;
                }
                num2 -= 1;
            }
            if (num3 != 2) {
                System.out.println("não é primo!");
            } else {
                System.out.println("é primo");
            }
        }

    }
}
