package A4Colecoes;

public class A1Array {
    public static void main(String[] args) {

        //criando uma array (lista) com 6 espaços:
        int[] a = new int[6];

        //atribuindo valores:
        a[0] = 10;

        System.out.println(a[0]);

        // array dentro de array
        int[][] b = new int[20][3];
        b[0][2] = 6;
        b[15][1] = 9;
        b[10][0] = 15;

        System.out.printf("aluno 0 da sala 2: %s\n", b[0][2]);
        System.out.printf("aluno 15 da sala 1: %s\n", b[15][1]);
        System.out.printf("aluno 10 da sala 0: %s\n", b[10][0]);



    }
}
