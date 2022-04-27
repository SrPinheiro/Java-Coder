package A2Controle.Desafio;

import java.util.Scanner;

public class Desafio003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var valor = 0F;
        var total = 0F;
        var quant = 0;
        do{
            System.out.println("Digite uma nota:");
            valor = scan.nextFloat();
            if(valor >= 0 && valor <= 10){
                System.out.println("Nota Adicionada!");
                total+=valor;
                quant+=1;
            }else if (valor !=-1){
                System.out.println("Nova Invalida!");
           }
        }while(valor!=-1);
        System.out.printf("Total: %.1f\n", total);
        System.out.printf("Quantidade: %d\n",quant);
        System.out.printf("Media = %.1f\n", total/quant);
        scan.close();
    }
}
