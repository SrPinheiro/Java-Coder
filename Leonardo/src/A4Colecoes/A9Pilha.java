package A4Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class A9Pilha {
    public static void main(String[] args) {
        Deque<String> pilha = new ArrayDeque<String>();

        pilha.add("Percy Jackson");
        pilha.push("Harry Potter");
        pilha.push("Hobbit");
        pilha.push("livro1231");

        for (var k1 :pilha) {
            System.out.println(k1);

        }


        System.out.println(pilha.poll());
        System.out.println(pilha.poll());
        System.out.println(pilha.poll());
        System.out.println(pilha.pop());

    }
}
