package A2Controle.Exercicios;

import java.util.Scanner;

public class Exercicio008 {
    public static void main(String[] args) {
        //8. Criar um programa que receba uma palavra e imprime no console letra por letra.
        Scanner scan = new Scanner(System.in);
        System.out.println("digite uma palavra:");
        var i = scan.nextLine();
        char[] letras = i.toCharArray();
        for (var a:letras) {
            System.out.println(a);
        }
        scan.close();
    }
}
