import java.util.Scanner;

public class Baskara {
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in); 
        int a, b, c;
        double delta;
        double x, x2;  
        
        System.out.print("Digite o valor de a: ");
        a = scan.nextInt(); 
       
        System.out.print("Digite o valor de b: ");
        b = scan.nextInt();
       
        System.out.print("Digite o valor de c: ");
        c = scan.nextInt();
        scan.close(); 

        delta = Math.pow(b, 2) - 4 * a * c; 
        if(delta < 0){
            x = 0; 
            x2 = 0; 


        }
        else{ 
            x = (-b+Math.sqrt(delta)) / (2 *a);
            x2 = (-b-Math.sqrt(delta)) / (2 *a);  
        }

        System.out.println(x +""+x2);
        


    }
    
}
