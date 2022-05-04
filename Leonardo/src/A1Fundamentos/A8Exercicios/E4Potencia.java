package A1Fundamentos.A8Exercicios;

import java.util.Scanner;

public class E4Potencia {
    public static void main(String[] args) {
        //Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero:");
        var num = scan.nextLine().replace(",",".");
        var quadrado = Math.pow(Double.parseDouble(num),2);
        var cubo = Math.pow(Double.parseDouble(num),3);
        System.out.printf("Numero: %s\n",num);
        System.out.printf("Quadrado: %s\n", quadrado);
        System.out.printf("Cubo: %s\n",cubo);
    }
}
