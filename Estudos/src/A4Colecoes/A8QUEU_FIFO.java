package A4Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class A8QUEU_FIFO {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("allahu akbar"); // retorna erro
        fila.offer("carai borracha"); // retorna exceção
        fila.offer("jubileu");

        System.out.println(fila.peek()); //retorna o primeiro valor da fila // retorna exceção
        System.out.println(fila.element()); //retorna o primeiro valor da fila // retorna erro

        System.out.println(fila.poll()); // retorna o primeiro valor da fila e remove ele // retorna exceção
        System.out.println(fila.remove()); // retorna o primeiro valor da fila e remove ele // retorna erro

        // fila.clear(); limpa a fila
        //System.out.println(fila);




    }
}
