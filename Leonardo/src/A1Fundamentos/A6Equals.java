package A1Fundamentos;

import java.util.Scanner;

public class A6Equals {
    public static void main(String[] args) {
        System.out.println("2" == "2"); //*VERDADEIRO* pois são iguais

        String s = "2";

        System.out.println("2" == s); //*FALSO* pois o java não analisa o conteudo e sim o Objeto
        System.out.println("2".equals(s)); //*VERDADEIRO* pois o equals analisa o valor

        Scanner scan = new Scanner(System.in);
        System.out.println("digite 5");
        String txt = scan.nextLine();
        System.out.println("5".equals(txt.trim())); //trim remove os espaços no inicio e no fim
    }
}
