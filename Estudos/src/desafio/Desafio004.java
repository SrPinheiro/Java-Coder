package desafio;

public class Desafio004 {
    public static void main(String[] args) {
        double a1 = (Math.pow((6*(3+2)), 2))/(3*2);
        double a2 = Math.pow((double)(1-5)*(2-7)/2, 2);
        double a3 = Math.pow((a1-a2), 3);
        double a4 = a3 / Math.pow(10, 3);
        System.out.printf("Resultado: %.2f ",a4);
    }
}
