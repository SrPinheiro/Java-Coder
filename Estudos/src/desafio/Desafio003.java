package desafio;

import java.util.Scanner;

public class Desafio003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] salario = new String[4];
        for(byte c = 1; c < 4; c++){
            System.out.printf("Digite o seu %dº salario:",c);
            salario[c-1] = scan.nextLine().replace(",",".");
        }
        scan.close();
        try{
            double sal1 = Double.parseDouble(salario[0]);
            double sal2 = Double.parseDouble(salario[1]);
            double sal3 = Double.parseDouble(salario[2]);
            double media = (sal1+sal2+sal3)/3;
            System.out.printf("Media: %.2f",media);
        }catch (Exception e){
            System.out.println("Digite apenas numeros!");
        }
    }
}
