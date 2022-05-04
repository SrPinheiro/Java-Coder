package A1Fundamentos.A8Exercicios;

import java.util.Scanner;

public class E3IMC {
    public static void main(String[] args) {
        //Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
        //formula peso/altura**2
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua altura:");
        var altura = scan.nextLine().replace(",",".");
        System.out.println("Agora digite seu peso:");
        var peso = scan.nextLine().replace(",",".");
        try{
            if(Double.parseDouble(altura) > 4){
              altura = Double.toString(Double.parseDouble(altura)/100);
            }
            var altura2 = Math.pow(Double.parseDouble(altura), 2);
            var imc = Double.parseDouble(peso)/ altura2;
            System.out.printf("Altura: %sCm\n",altura);
            System.out.printf("Peso: %sKg\n",peso);
            System.out.printf("IMC: %.1f", imc);
        }catch (Exception e){
            System.out.printf("Erro codigo: %s ", e.getClass().getSimpleName());
            System.out.println("Digite apenas numeros!");
        }
    }
}
