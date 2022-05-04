package A1Fundamentos;

public class A5Operadores {
    public static void main(String[] args) {
        // Operadores Unarios Ex: a++, a--
        // Operadores Binários Ex: 3 + 2
        // Operadores Ternários Ex: a ? b : c

        //prefix: ++a
        //postfix a++
        //infix a+b

        var a = (double) 5;
        var b = 7.5;
        //Aritmeticos
        System.out.println("================Aritmeticos=================");
        System.out.println(a+b); // adição
        System.out.println(a-b); // subtração
        System.out.println(a*b); // multiplicação
        System.out.println(a/b); // divisão
        System.out.println(a%b); // resto da divisão
        System.out.println(a+b*a); // ordem de prescedência (primeiro multiplicação depois divisão)

        //Lógicos
        /*
        &&  e
        ||  ou
        ^   ou exclusivo
        !   negação
        */
        System.out.println("================Logicos=================");
        System.out.println(true && false); // resultado é *FALSO* pois precisa dos 2 para ser verdadeiro
        System.out.println(true || false); // resultado *VERDADEIRO* pois precisa apenas de 1 para ser verdadeiro
        System.out.println(true ^ true); // resultado *FALSO* pois precisa que um seja verdadeiro e o outro falso
        System.out.println(!true); // resultado *FALSO* pois a negação troca o valor logico!


        //Relacionais
        /*
        ==  igual
        >   maior
        >=  maior ou igual
        <   menor
        <=  menor ou igual
        !=  diferente
         */
        System.out.println("================Relacionais=================");
        a = 7;
        b = 9;
        System.out.println(a == b); // *FALSO* pois A é diferente que B
        System.out.println(a > b);  // *FALSO* pois A é menor que B
        System.out.println(a >= b); // *FALSO* pois A é menor que B
        System.out.println(a < b);  // *VERDADEIRO* pois A é menor que B
        System.out.println(a <= b); // *VERDADEIRO* pois A é menor que B
        System.out.println(a != b); // *VERDADEIRO* pois A é diferente que B

        //Atribuição
        System.out.println("================Atribuição=================");
        int a1=5,b1=5,c1=5;
        a1 = 5; //Atribuição
        b1+= a1;
        c1 += a1+b1;
        System.out.println(c1+=b); //Atribuição aditiva
        System.out.println(c1-=a); //Atribuição Subtrativa
        System.out.println(c1*=a); //Atribuição multiplicativa
        System.out.println(c1/=a); //Atribuição divisiva
        System.out.println(c1%=a); //Atribuição modular

        //Unarios
        a=5;
        System.out.println("================unarios=================");
        System.out.println(a++); //aqui sera imprimido o primeiro valor de A
        System.out.println(a); // aqui sera imprimido o valor ja somado

        b = 5;
        System.out.println(--b); //aqui sera imprimido o valor de B-1
        System.out.println(++b);//aqui sera imprimido o valor de B+1

        //ternarios
        System.out.println("================Ternarios=================");
        double media = 4;
        String resultado = media >=7 ? "Aprovado" : media>=5 ? "Recuperação" : "reprovado";
        System.out.printf("Situação: %s", resultado);

    }
}
