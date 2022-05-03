//import java.util.Scanner; 
public class Desafio03 {
    public static void main(String[] args){ 
        //Scanner scan = new Scanner(System.in); 
        
        boolean trab01 = true;  
        boolean trab02 = true;  

        if(trab01 == true && trab02 == true){
            System.out.println("Tv de 50 e soverte");
        }
        else if(trab01 == true || trab02 == false){
            System.out.println("Tv de 30 e soverte"); 
        }
        else if(trab01 == false  || trab02 == true){
            System.out.println("Tv de 30 e soverte"); 
            
        }
        else{
            System.out.println("Familia vai ficar em casa");
        }

        }
 
    }
        


    
