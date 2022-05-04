package A2Controle.Exercicios;

import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args) {
        //3. Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual
        // a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
        // caso contrário imprime no console "Reprovado".
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        var nota1 = scan.nextFloat();
        System.out.println("Digite a segunda nota:");
        var nota2 = scan.nextFloat();
        var media = (nota1+nota2)/2;
        if (media >=7){
            System.out.println("Aprovado!");

        } else if (media <7 && media >4) {
            System.out.println("Recuperação!");

        }else{
            System.out.println("Reprovado!");
        }

        scan.close();

    }
}
