package A1Fundamentos.A8Exercicios;
import java.util.Scanner;
public class E1Fahrenheit{

    public static void main(String[] args) {
        //formula (32 °F − 32) × 5/9
        //Criar um programa que leia a temperatura em celrenheit e converta para Celsius.

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus celrenheit:");
        var cel = scan.nextLine().replace(",",".");
        try{
            float celsius = ((Float.parseFloat(cel)-32)*5/9);
            System.out.printf("celrenheit: %s\n",cel);
            System.out.printf("Celsius: %.0f", celsius);
        }
        catch (Exception e) {
            System.out.println("Erro classe: " + e.getClass().getSimpleName());
            System.out.println("Digite apenas numeros!");
        }
    }
}