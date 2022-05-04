package A4Colecoes;

import java.util.HashMap;
import java.util.Map;

public class A10Map {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<Integer, String>();

        usuarios.put(12312,"Leonardo");
        usuarios.put(213152,"Larigirl");
        usuarios.put(1231312, "jubileu");

        System.out.println(usuarios.values());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(12312));
        System.out.println(usuarios.containsValue("Larigirl"));

        for (var k1 : usuarios.keySet()) {
            System.out.println(k1);
        }

        System.out.println("=========");

        for (var k1 : usuarios.values()) {
            System.out.println(k1);
        }

        System.out.println("=========");

        for (var k1 : usuarios.entrySet()) {
            System.out.println(k1.getKey());
            System.out.println(k1.getValue());

        }
        usuarios.remove(12312);
        System.out.println(usuarios);

        System.out.println("=========");
    }
}
