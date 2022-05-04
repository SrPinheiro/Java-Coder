import java.util.Scanner;

public class Cubo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        double x;

        System.out.println("Digite um numero: ");
        x = scan.nextDouble();
        System.out.println(Math.pow(x, 2));
        System.out.println(Math.pow(x, 3));

        scan.close(); 

        
         
    }
    
}
