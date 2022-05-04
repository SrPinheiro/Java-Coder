package A1Fundamentos.A8Exercicios;

import java.util.Scanner;

public class E6Bhaskara {
    //Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara.
    // Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor que acompanha X² (a):");
        var a = scan.nextLine().replace(",",".");
        System.out.println("Digite o valor que acompanha X (b):");
        var b = scan.nextLine().replace(",",".");
        System.out.println("Digite o valor independente (c):");
        var c = scan.nextLine().replace(",",".");
        try{
            var delta = Math.pow(Double.parseDouble(b),2) -4 * Double.parseDouble(a) * Double.parseDouble(c);
            System.out.println("delta= " + delta);
            double x1,x2;
            try {
                x1 = (-Double.parseDouble(b) + Math.sqrt(delta))/(2 * Double.parseDouble(a));
            }catch (Exception e){
                x1 = 0;
            }
            try{
                x2 = (-Double.parseDouble(b) - Math.sqrt(delta))/(2 * Double.parseDouble(a));
            }catch (Exception e){
                x2 = 0;
            }
            System.out.printf("A: %s\n", a);
            System.out.printf("B: %s\n", b);
            System.out.printf("C: %s\n", c);
            System.out.printf("Delta: %s", delta);
            System.out.printf("X1 = %s\n", x1);
            System.out.printf("X2 = %s\n", x2);
        }catch (Exception e){
            System.out.println("Digite apenas numeros!");
        }
    }
}
