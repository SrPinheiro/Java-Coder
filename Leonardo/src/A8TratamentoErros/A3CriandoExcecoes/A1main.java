package A8TratamentoErros.A3CriandoExcecoes;

public class A1main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.serie = "2 ano";
        a1.nome = "Larissa";
        System.out.println(Validar.aluno(a1));
        throw new ErroNaoTratado("Erro não tratado");
    }
}
