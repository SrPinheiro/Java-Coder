package A4Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class A6HashSet2 {
    public static void main(String[] args) {
        //Criando um HashSet exclusivo do tipo String
        Set<String> hash = new HashSet<>();

        hash.add("ola");
        hash.add("LariGirl");
        hash.add("teste");
        hash.add("hello");

        for (var k1 :hash) {
            System.out.println(k1);
        }

        //Treeset = ?
        Set<String> hash2 = new TreeSet<>();
        System.out.println("============Treeset========");

        hash2.add("ola");
        hash2.add("LariGirl");
        hash2.add("teste");
        hash2.add("hello");

        for (var k2 :hash2) {
            System.out.println(k2);
        }


    }
}
