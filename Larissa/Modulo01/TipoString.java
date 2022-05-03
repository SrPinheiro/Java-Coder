public class TipoString {
    public static void main(String[] args){ 
        //Exemplo de metodos que podem ser ultilizados com o objeto String 
        //Observação ao contrario de algumas linguagens(Python, por exemplo) String no java é um objeto
        
        
        //String s = "Larissa";
       
        /* O metodo startsWith vai ser retornar um valor true se o texto 
       inserido estiver dentro da frase/palavra*/ 
       
       /* if(s.startsWithstartsWith("Lari")); 
            System.out.println("Esse valor é t("Lari") == true){ 
            System.out.println(s.rue");
        }
        else{ 
            System.out.println("Esse valor é false"); 
        } */ 

        String a = "Larissa Rodrigues";
        a = a.toUpperCase(); //Vai retornar a frase com letras grandes. 
        System.out.println(a); 
         
        String b = "Larissa Rodrigues"; 
        b = b.replace( "Larissa", "Maria"); //Vai trocar um elemento da frase por outro. 
        System.out.println(b);  

        String c = "Larissa Rodrigues"; 
        c = c.concat(">]"); //Vai adcionar um elemento a frase 
        System.out.println(c);





      
        
        

         
    }
    
}
