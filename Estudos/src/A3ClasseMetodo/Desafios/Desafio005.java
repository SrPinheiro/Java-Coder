package A3ClasseMetodo.Desafios;

public class Desafio005 {
    // faça um print da variavel a dentro do main

    int a = 3;  // não pode mexer
    public static void main(String[] args) {
        // pode mexer

        Desafio005 b = new Desafio005();
        System.out.println(b.a);
    }
}
