package A2Controle.Exercicios;

import java.util.Scanner;

public class Exercicio006 {
    public static void main(String[] args) {
        //6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
        // Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas
        // para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
        // de tentativas restantes, e imprima se o número inserido é maior ou menor do que o
        // número armazenado.

        Scanner scan = new Scanner(System.in);
        byte tentativa = 1;
        var numero = 78;
        var usuario = 0;
        while(tentativa!=11){
            System.out.printf("%dºTentativa!\n", tentativa);
            System.out.println("Digite um numero:");
            usuario = scan.nextInt();
            if(usuario == numero){
                System.out.println("Você acertou!! parabêns!!");
                System.out.printf("O numero era: %d\n", numero );
                break;
            }else if(usuario > numero){
                System.out.printf("Quase!, o numero é menor do que %d\n", usuario );
                System.out.printf("Você ainda tem %d tentativas!!\n", 10-tentativa);
            }else {
                System.out.printf("Quase!, o numero é maior do que %d\n", usuario );
                System.out.printf("Você ainda tem %d tentativas!!\n", 10-tentativa);
            }
            tentativa +=1;
        }
        scan.close();
    }
}
