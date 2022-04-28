package A2Controle.Exercicios;

import java.util.Scanner;

public class Exercicio001 {
    public static void main(String[] args) {
        //1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um numero:");
        var num = scan.nextFloat();
        if (num >= 0 && num <= 10) {
            System.out.printf("O numero: %.1f esta dentro do intervalo!\n", num);
        }else{
            System.out.printf("O numero: %.1f Não esta dentro do Intervalo!\n", num);
        }if (num%2 == 0) {
            System.out.printf("O numero: %.1f é PAR!!\n", num);
        }else{
            System.out.printf("O numero: %.1f é IMPAR!!\n", num);
        }
        scan.close();
    }
}
