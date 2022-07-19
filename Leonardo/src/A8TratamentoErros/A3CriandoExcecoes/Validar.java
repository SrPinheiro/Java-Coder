package A8TratamentoErros.A3CriandoExcecoes;

public class Validar {
    static boolean aluno(Aluno aluno){
        boolean result = true;
        if(aluno == null) {
            throw new IllegalArgumentException("Aluno Invalido!");

        }else if(aluno.nome == null){
            throw new ValorNulo("Nome Nulo");

        }else if(aluno.matricula == 0){
            throw  new ValorNulo("Matricula");

        }else if(aluno.serie == null){
            throw new ValorNulo("Serie");

        }
        return result;
    }
}
