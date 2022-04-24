package Coder;

public class A4Convertendo {
    public static void main(String[] args) {
        //de um tipo menor para um tipo maior n tem problema
        // por isso a conversão pode ser feita de forma implicida
        int a = 5;
        float b = a; // conversão implicita pois não a perda de informação

        System.out.println(b);
        System.out.println(((Object)b).getClass().getSimpleName());
        System.out.println();

        // de um tipo maior para um tipo menor você devera deixar
        //o codigo de forma explicita, pois pode haver perda de infomração
        float a2 = 10F;
        int b2 = (int) a2; //colocando o int vc deixa de forma explicita a conversão

        System.out.println(b2);
        System.out.println(((Object)b2).getClass().getSimpleName());
        System.out.println();

        //para converter String para tipo primitivo numerico utilize o 'parse'
        String a3 = "3";
        short b3 = Short.parseShort(a3);

        System.out.println(b3);
        System.out.println(((Object)b3).getClass().getSimpleName());
        System.out.println();

        //para converter string em char deve-se utilizar o charAt
        String a4 = "6";
        char b4 = a4.charAt(0);

        System.out.println(b4);
        System.out.println(((Object)b4).getClass().getSimpleName());
        System.out.println();

        //converter para String use o valueof ou toString (so funcionam em objetos)
        boolean a5 = true;
        String b5 = String.valueOf(a5);

        System.out.println(b5);
        System.out.println(((Object)b5).getClass().getSimpleName());
        System.out.println();

        byte a6 = 120;
        String b6 = Byte.toString(a6);

        System.out.println(b6);
        System.out.println(((Object)b6).getClass().getSimpleName());
        System.out.println();

    }
}
