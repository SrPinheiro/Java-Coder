package A1Fundamentos;

import java.util.Scanner;

public class A2Console {
    public static void main(String[] args) {

        //print normal
        System.out.print("Bom");
        System.out.print(" dia!\n\n");

        //print que quebra linha no fim
        System.out.println("bom");
        System.out.println("dia!");

        //print formatado
                System.out.printf("Megasena:  %d %d %d %d %d %d %n", 1,2,3,4,5,6);
        System.out.printf("Salario: %.1f%n", 1234.5678);
        System.out.format("%%");

        /*Erro: Não foi possível localizar nem carregar a classe principal A5POO.A1Pista.Pista
        parametros format:

         %s = Tipo string (%s funciona para qualquer valor, pois todos eles podem ser convertidos para string)
         %S = Tipos String (soq toda a string aparece maiuscula)
         %d = Tipo Inteiro
         %f = Tipo flutuante
         %b = Tipo bollean
         %c = Tipo cha


         \n = quebra de linha
         \t = tubulação
         \" = no java se usa as aspas duplas para escrever dentro do print e caso no seu texto tenha aspas duplas vc tera que utilizar /"  para coloca-la no seu texto
         \\ = escreve 1 barra invertida no console

         */

        //Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("\nDigite o seu nome:");
        String nome = scan.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scan.nextLine();

        System.out.printf("Nome: %s \nSobrenome: %s", nome, sobrenome);

        //fecha o leitor
        scan.close();

    }
}
