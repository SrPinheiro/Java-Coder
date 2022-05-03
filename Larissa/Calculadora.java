import java.util.Scanner;

//import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 

        String num; 
        String nu2; 
        String op; 

        System.out.print("Digite um numero: ");
        num = scan.nextLine().replace(",", "."); 
        
        System.out.print("Digite outro numero: ");
        nu2 = scan.nextLine().replace(",", ".");

        System.out.print("Qual estilo de calculo deseja? \n(+) adição\n(-) Subtração\n(%) resto\n(*) multipliação: ");
        op = scan.nextLine(); 
        scan.close();

        
        System.out.print(op.equals("+") ?
        Double.parseDouble(num) + Double.parseDouble(nu2) : ""
        );

        System.out.print(op.equals("-") ? 
        Double.parseDouble(num) - Double.parseDouble(nu2) : ""
        );
        
        System.out.print(op.equals("*") ? 
        Double.parseDouble(num) * Double.parseDouble(nu2) : ""
          );

        System.out.print(op.equals("%") ? 
        Double.parseDouble(num) % Double.parseDouble(nu2) : ""
          );

    }
    
    
}
