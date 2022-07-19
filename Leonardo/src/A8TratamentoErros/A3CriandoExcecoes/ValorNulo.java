package A8TratamentoErros.A3CriandoExcecoes;

public class ValorNulo extends RuntimeException{
    private String nome;

    public ValorNulo(String nome){
        this.nome = nome;
    }

    public String getMessage() {
        return String.format("O atributo %s esta vazio!", nome);
    }
}
