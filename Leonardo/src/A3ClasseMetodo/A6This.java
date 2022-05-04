package A3ClasseMetodo;

public class A6This {
    /*
    O construtor é um metodo especial que vai ajudar a criar instancias apartir de uma classe

    Restrições:
    1- O nome do construtor é o mesmo nome da classe!
    2- Construtor não tem retorno!
     */
    public static void main(String[] args) {
        Produto2 c = new Produto2();
        c = null;
        System.out.println(c);

    }
}
    class Produto2{
        String nome;
        double preco;
        double desconto;

        //Construtor
        Produto2 (){
            //chamando um construtor dentro de outro construtor
            this("celular",2000.0, 0.0);
        }

        //construtores personalizado
        Produto2(String nome){
            this.nome = nome;
        }
        Produto2(String nome, Double preco){
            this.nome = nome;
            this.preco = preco;
        }
        Produto2(String nome, Double preco, Double desconto){
            this.nome = nome;
            this.preco = preco;
            this.desconto = desconto;
        }
    }


