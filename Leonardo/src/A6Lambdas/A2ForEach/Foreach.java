package A6Lambdas.A2ForEach;

import java.util.List;
import java.util.Arrays;

class Foreach {
    public static void main(String[] args){
        List<String> aprovados = Arrays.asList("Ana", "Lia", "gui");

        System.out.println("forma tradicional...");
        for(var c : aprovados){
            System.out.println(c);
        }

        System.out.println("Lambda...");
        aprovados.forEach((nome) -> System.out.println(nome));


        System.out.println("Referencia de metodo...");
        aprovados.forEach(System.out::println);


        System.out.println("Referencia de metodo2...");
        aprovados.forEach(Foreach::imprimir);

    }
    static void imprimir(String nome){
        System.out.println("oi, meu nome é " + nome);
    }
}
