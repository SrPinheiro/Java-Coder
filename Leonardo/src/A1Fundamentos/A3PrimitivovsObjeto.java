package A1Fundamentos;

public class A3PrimitivovsObjeto {
    public static void main(String[] args) {
        //Wrappers são a versão objeto dos tipos primitivos
        //observe a diferente entre letras maiusculas e minusculas
        // argumento final serve para criar constantes

        final Byte a = 100; // byte
        final Short b = 1000; // short
        final Integer c = 10000; // int
        final Long d = 100000L; // long

        Boolean e = Boolean.parseBoolean("false"); // boolean

        Character f = 'a'; // char

        Float g = 123.456F; //float
        Double h = 123.4567; //double


        //você tera mais opções de controle sobre a variavel
        //se ela for um objeto

        System.out.println(a.byteValue());
        System.out.println(b);


    }
}
