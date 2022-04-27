package A2Controle;

import java.util.Scanner;

public class A4While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 1;

        while (contador <= 10) {
            System.out.printf("i = %d\n", contador);
            contador++;
        }

        var valor = "";
        while (!valor.equalsIgnoreCase("sair")) {
            System.out.println("voce diz: ");
            valor = scan.nextLine();
        }

        // o do executa pelo menos 1 vez
        do{
            System.out.println("Digite um valor: ");
            valor = scan.nextLine();
        } while (!valor.equalsIgnoreCase("sair"));

    }
}
