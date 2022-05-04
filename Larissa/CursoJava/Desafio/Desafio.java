import java.util.Scanner;
public class Desafio {
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in); 
        String a, b, c; 
        double m = 0;   
 

        System.out.println("Digite o primeiro salario: ");
        a = scan.next().replace(",", "."); //chamei esse metodo pq pode haver um erro no momento da digitação

        
        System.out.println("Digite o segundo salario: ");
        b = scan.next().replace(",", "."); 

        
        System.out.println("Digite o terceiro salario: ");
        c = scan.next().replace(",", "."); 

        double x = Double.parseDouble(a); //metodo de conversão 
        double y = Double.parseDouble(b);
        double z = Double.parseDouble(c); 
         
        m = (x + y + z) / 3;
        System.out.printf("A media foi %f", m); 
        scan.close(); 



    }
}
