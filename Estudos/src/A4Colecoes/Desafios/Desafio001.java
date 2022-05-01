package A4Colecoes.Desafios;

import java.util.Scanner;

public class Desafio001 {
    public static void main(String[] args) {
        double total = 0;
        int a1 = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas notas voce quer Informar?");
        a1 = scan.nextInt();
        scan.nextLine();

        double[] notas = new double[a1];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a %sº nota:\n", i+1);
            notas[i] = scan.nextDouble();
        }

        for (var i: notas) {
            total+=i;
        }

        System.out.printf("Media: %.2f\n", total/notas.length);
    }
}
