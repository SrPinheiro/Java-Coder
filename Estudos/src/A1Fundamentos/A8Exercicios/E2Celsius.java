package A1Fundamentos.A8Exercicios;

import java.util.Scanner;

public class E2Celsius {
    public static void main(String[] args) {
        //Criar um programa que leia a temperatura em Celsius e converta para fahrenheit.
        //formula (C × 9/5) + 32 = 32
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius:");
        var cel = scan.nextLine().replace(",",".");
        try{
            float fah = ((Float.parseFloat(cel) * 9/5) + 32);
            System.out.printf("Celsius: %s\n",cel);
            System.out.printf("Fahrenheit: %.0f", fah);
        }
        catch (Exception e) {
            System.out.println("Erro classe: " + e.getClass().getSimpleName());
            System.out.println("Digite apenas numeros!");
        }
    }
}
