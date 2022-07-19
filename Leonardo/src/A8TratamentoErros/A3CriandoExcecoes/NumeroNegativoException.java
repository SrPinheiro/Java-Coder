package A8TratamentoErros.A3CriandoExcecoes;

public class NumeroNegativoException extends RuntimeException{
    private static final long SerialVersionUID = 1L;

    private String nome;

    public NumeroNegativoException(String nome){
        this.nome = nome;
    }

    public String getMessage() {
        return String.format("O atributo %s esta negativo!", nome);
    }
}
