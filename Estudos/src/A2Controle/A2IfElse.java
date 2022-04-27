package A2Controle;

import javax.swing.*;

public class A2IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite um valor:");
        int numero = Integer.parseInt(valor);

        if(numero%2 == 0){
            System.out.printf("o numero %s é par\n", numero);
        }
        else {
            System.out.printf("o numero %s é impar\n", numero);
        }
    }
}
