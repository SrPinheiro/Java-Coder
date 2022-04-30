package A3ClasseMetodo;

public class A4Static {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(10);

        System.out.println(a1.area());

    }
    static class AreaCirc{
        double raio;
        static double pi;

        AreaCirc(double raioInicial){
            pi = 3.14;
            raio = raioInicial;
        }

        double area(){
            return pi *(raio*raio);
        }

    }
}
