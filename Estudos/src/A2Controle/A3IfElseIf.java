package A2Controle;

import java.util.Scanner;

public class A3IfElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua nota:");
        var nota = scan.nextDouble();

        if(nota > 10 || nota < 0){
            System.out.println("Nota Invalida!");

        }else if(nota >=8.1) {
            System.out.println("conceito A");

        }else if (nota>=6.1) {
            System.out.println("Conceito B");
            
        }else if(nota >= 4.1) {
            System.out.println("Conceito C");

        }else if(nota >=2.1){
            System.out.println("conceito D");

        }else{
            System.out.println("Conceito E");
        }
        System.out.println("Fim!");

        scan.close();
    }
}
