package A2Controle;

import java.util.Scanner;

public class A6Switch {
    public static void main(String[] args) {
        //switch sistema de hierarquia, quando executa 1 exceção todas as de baixo tbm se executam, exeto se houver um *break*
        String faixa = "preta";
        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Faixa preta!");
            case "marrom":
                System.out.println("Faixa marrom");
            case "roxa":
                System.out.println("Faixa roxa");
            case "verde":
                System.out.println("Faixa verde");
            case "laranja":
                System.out.println("Faixa laranja");
            case "vermelha":
                System.out.println("Faixa vermelha");
            case "amarela":
                System.out.println("Faixa amarela!");
            case "branca":
                System.out.println("Faixa branca!");
                break;
            default:
                System.out.println("não sei que faixa é");
        }

        System.out.println("=====================================");
        String conceito = "";
        System.out.println("Informe a nota:");
        Scanner scan = new Scanner(System.in);
        var nota = scan.nextInt();

        // também é possivel colocar 2 exceções dentro de 1 sentença
        switch (nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6: case 5:
                conceito = "c";
                break;
            case 4: case 3:
                conceito = "D";
                break;
            case 2: case 1:
                conceito = "E";
                break;
            default:
                System.out.println("conceito não informado");
        }
        System.out.println("conceito: "+ conceito);
        scan.close();

    }
}
