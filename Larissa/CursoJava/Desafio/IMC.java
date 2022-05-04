import java.util.Scanner;

public class IMC {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in); 
        
        double atl = 0; 
        
        double peso;
        
        System.out.print("Digite seu peso: ");
        peso = scan.nextDouble(); 

        System.out.print("Digite sua altura: ");
        
        atl = scan.nextDouble(); 
        atl = Math.pow(atl, 2);

        scan.close(); 
        
        System.out.printf("imc: %.2f", peso / atl);
        




        






        
        

    }
    
}
