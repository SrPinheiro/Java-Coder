package A3ClasseMetodo;

public class A3Construtor {
    /*
    O construtor é um metodo especial que vai ajudar a criar instancias apartir de uma classe

    Restrições:
    1- O nome do construtor é o mesmo nome da classe!
    2- Construtor não tem retorno!
     */
    public static void main(String[] args) {
      Produto c = new Produto();
      System.out.println(c.nome);


    }

    static class Produto{
        String nome;
        double preco;
        double desconto;

        //Construtor padrão do java
        Produto (){
        }

        //construtores personalizado
        Produto(String nomeInicial){
            nome = nomeInicial;
        }
        Produto(String nomeInicial, Double precoInicial){
            nome = nomeInicial;
            preco = precoInicial;

        }
        Produto(String nomeInicial, Double precoInicial, Double descontoInicial){
            nome = nomeInicial;
            preco = precoInicial;
            desconto = descontoInicial;
        }
    }

}
