package A3ClasseMetodo;

public class A5Referencia {
    public static void main(String[] args) {
         // quando se faz atribuição de uma variavel para outra, oq esta sendo atribuido é o valor da variavel
        //como mostra abaixo:

        int a = 7;
        int b = a; //atribuição de valor

        //nesse exemplo, o valor da variavel a foi clonado e atribuido a variavel b, esse esquema não funciona com
        //objetos, isso acontece pq dentro da variavel é atribuido a referencia ao objeto e não o objeto em si
        //exemplo:

        objeto1 a1 = new objeto1();
        objeto1 a2 = a1; // atribuição de referencia

        //na  variavel a1 fica armazenada a referencia que leva ao objeto, então quando eu faço a atribuição de a1 para
        //a variavel a2 eu estou a verdade atribuindo a refencia do objeto, no fim desse codigo tanto a1 quanto a2
        //serão O MESMO OBJETO com 2 nomes diferentes, ou seja, tudo que acontecer com a1 também acontecera com a2(pois eles são a mesma coisa)


        //nesse outro exemplo quando vc vai a atribuição de b1 para b2, o objeto que era referenciado pela variavel b1 deixa de existir,
        //assim existindo apenas o objeto referenciado por b2 que agr tbm é referenciado pela variavel b1

        objeto1 b1 = new objeto1();
        objeto1 b2 = new objeto1();




    }
}
class objeto1{
    int a = 7;
    int b = 9;
}