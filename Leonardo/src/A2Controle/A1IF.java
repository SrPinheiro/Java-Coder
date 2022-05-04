package A2Controle;

import java.util.Scanner;

public class A1IF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a media do aluno:");
        var media = scan.nextDouble();

        if(media<=10 && media >=7) {
            System.out.println("Aprovado!");
            System.out.println("Parabens");
        }
        //Não é necessario criar um bloco de codigos quando se tem apenas 1 sentença
        if(media<7 && media>=4.5)
            System.out.println("Recuperação!");

        //pode atribuir a condição em uma variavel e usa-la dentro do If
        var criterioaprovacao = media <4.5;
        if(criterioaprovacao){
            System.out.println("Reprovado!");
        }
        scan.close();
    }
}
