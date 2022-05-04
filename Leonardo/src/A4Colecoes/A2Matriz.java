package A4Colecoes;

import java.util.Arrays;

public class A2Matriz {
    public static void main(String[] args) {
        //matriz
        // array dentro de array
        System.out.println("====Array dentro de array====");

        double[][] b = new double[20][3];

        //1 array com 20 espaços dentro e dentro de cada espaço tem outra array com mais 3 espaços
        b[0][2] = 6;
        b[15][1] = 9;
        b[10][0] = 15;

        System.out.printf("Nota do aluno(0) da sala(2): %s\n", b[0][2]);
        System.out.printf("Nota do aluno(15) da sala(1): %s\n", b[15][1]);
        System.out.printf("Nota do aluno(10) da sala(0): %s\n", b[10][0]);

        //mostrando todos os valores:
        System.out.println("turma0/turma1/turma2");
        for (int i = 0; i < b.length; i++) {
            System.out.printf("Aluno %s: ", i);
            System.out.println(Arrays.toString(b[i]));
        }
    }
}
