package A8TratamentoErros.A3CriandoExcecoes;

public class ErroNaoTratado extends RuntimeException{
    String text;

    public ErroNaoTratado(String text){
        this.text = text;
    }

    public String getMessage() {
        return String.format("Mensagem de erro: %s", this.text);
    }
}
