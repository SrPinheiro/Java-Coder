import javax.swing.JOptionPane;

public class ConversaoDeValores {
    public static void main(String[] args){ 

        
        double c = 1; 
        System.out.println(c); //conversão inplicita o proprio Java faz a conversão neste caso o valor a ser mostrado sera 1.0
                              // não acontece perde de valores
        double a = 3.5; 
        int b = (int) a; // conversão explicita (CAST) o programador está ciente de que pode haver perde de informação 
                        // De certa forma o CAST é uma conversão que é feit de forma forçada
        System.out.println(b); 

        //ConversaoDeValores > Numeros para String 

        Integer x = 24; 
        System.out.println(x.toString()); // conversão de numero para string 

        // conversão de String para numero 
         
        
        
        //String para double 
        
        String z = JOptionPane.showInputDialog("Digite algo: "); 
        String y = JOptionPane.showInputDialog("Digite algo: ");

        double v = Double.parseDouble(z); //metodo de conversão 
        double d = Double.parseDouble(y);
        System.out.println(v + d);

        //String para int

        String l = JOptionPane.showInputDialog("Digite algo: "); 
        String k = JOptionPane.showInputDialog("Digite algo: ");
        
        int g = Integer.parseInt(l); //metodo de conversão 
        int h = Integer.parseInt(k); 

        System.out.println(g + h);


    }
    
}
