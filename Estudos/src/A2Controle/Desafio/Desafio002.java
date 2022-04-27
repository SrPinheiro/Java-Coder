package A2Controle.Desafio;

import java.util.Scanner;

public class Desafio002 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do dia: ");
        var dia = scan.nextLine();
        if(dia.equalsIgnoreCase("Domingo")){
            System.out.println("Domingo = 1");

        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.println("Segunda = 2");

        } else if (dia.equalsIgnoreCase("terça")) {
            System.out.println("terça = 3");

        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println("Quarta = 4");

        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println("quinta = 5");

        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println("sexta = 6");

        } else if (dia.equalsIgnoreCase("sabado")) {
            System.out.println("sabado = 7");
        } else {
            System.out.println("Desculpe, dia invalido!");
        }
    }
}