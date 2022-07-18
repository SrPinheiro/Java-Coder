package A8TratamentoErros.A1Excecoes;

public class A1Erro {
    public static void main(String[] args) {
        //System.out.println(7 / 0); //java.lang.ArithmeticException
        //Pessoa a1 = null;
        //imprimirNomeAluno(a1); //java.lang.NullPointerException
        try{
            double a = 7/0;

        }catch(Exception e){ // tratamento generico
            e.printStackTrace();
        }

        try{
            Pessoa a1 = null;
            imprimirNomeAluno(a1);

        }catch (NullPointerException e){ //tratamento mais especifico
            e.printStackTrace();

        }

    }

    static void imprimirNomeAluno(Pessoa aluno){
        System.out.println(aluno.nome);
    }
}
