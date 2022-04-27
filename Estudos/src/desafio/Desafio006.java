package desafio;


import java.util.Scanner;

public class Desafio006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o primeiro numero!");
        var num1 = scan.nextLine().replace(",",".");
        System.out.println("digite o segundo numero!");
        var num2 = scan.nextLine().replace(",",".");
        System.out.println("digite a opração desejada:");
        System.out.println("(+) Adição  (-)subtração (*)multiplicação (/)Divisão (%)Resto");
        var parametro = scan.nextLine();
        System.out.print(parametro.equals("+") ? Float.parseFloat(num1) + Float.parseFloat(num2) : parametro.equals("-") ? Float.parseFloat(num1) - Float.parseFloat(num2) : "");
        System.out.print(parametro.equals("*") ? Float.parseFloat(num1) * Float.parseFloat(num2) : parametro.equals("/") ? Float.parseFloat(num1) / Float.parseFloat(num2) : "");
        System.out.print(parametro.equals("%") ? Float.parseFloat(num1) % Float.parseFloat(num2):"");

    }
}
