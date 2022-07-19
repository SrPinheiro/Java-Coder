package A8TratamentoErros.A3CriandoExcecoes;

public class Aluno {
    String nome;
    long matricula;
    char sexo;
    String serie;

    public Aluno(){
        this.matricula = (long) (1000000000 + Math.random() * 999999999999999999L);
    }
}
