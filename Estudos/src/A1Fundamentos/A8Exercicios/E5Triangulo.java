package A1Fundamentos.A8Exercicios;

import java.util.Scanner;

public class E5Triangulo {
    public static void main(String[] args) {
        //Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da base do triangulo");
        var base = scan.nextLine().replace(",",".");
        System.out.println("Agora digite o valor da altura do triangulo");
        var altura = scan.nextLine().replace(",",".");
        try {
            System.out.printf("Base: %scm\n", Float.parseFloat(base));
            System.out.printf("Altura: %scm\n", Float.parseFloat(altura));
            System.out.printf("Area: %scm\n", (Float.parseFloat(base) * Float.parseFloat(altura)) / 2);
        }
        catch(Exception e){
            System.out.println("Digite apenas numeros!");
            System.out.printf("Erro codigo: %s", e);
        }
    }
}
