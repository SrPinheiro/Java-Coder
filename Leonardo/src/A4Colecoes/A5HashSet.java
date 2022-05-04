package A4Colecoes;

import java.util.HashSet;
import java.util.Set;

public class A5HashSet {
    public static void main(String[] args) {
        //Criando HashSet
        HashSet conjunto = new HashSet();
        Set conjunto2 = new HashSet();


        //adicionando valores
        //pode adicionar qualquer tipo de valor dentro de um HashSet
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Ola,Mundo");
        conjunto.add(1);
        conjunto.add('x');

        conjunto2.add(1);
        conjunto2.add(2);
        conjunto2.add(3);
        conjunto2.add(4);

        System.out.println(conjunto2);
        System.out.println(conjunto);

        //união entre Sets

        conjunto.addAll(conjunto2);
        System.out.println(conjunto);

        // Interseção entre Sets
        conjunto.retainAll(conjunto2);


        // verificando o tamanho da HashSet
        System.out.printf("Tamanho: %s\n", conjunto.size());

        //removendo elementos
        System.out.println(conjunto.remove("Ola,Mundo"));

        System.out.printf("Tamanho: %s\n", conjunto.size());

        //verificando (contains)
        System.out.println(conjunto.contains(1));



    }
}
