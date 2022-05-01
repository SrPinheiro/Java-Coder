package A4Colecoes;

import java.util.Objects;

public class A3EqualsHashcode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Larissa", "LariLinda@gmail.com", "40028922");
        Usuario u2 = new Usuario("Larissa", "LariLinda@gmail.com", "40028922");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

    }
}
class Usuario{
    String nome;
    String email;
    String numero;

    Usuario(String nome, String email, String numero){
        this.nome = nome;
        this.email = email;
        this.numero = numero;
    }

    public boolean equals(Object obj) {

        if(obj instanceof Usuario outro){

            boolean nome = Objects.equals(this.nome, outro.nome);
            boolean email = Objects.equals(this.nome, outro.nome);
            boolean numero = Objects.equals(this.nome, outro.nome);

            return (nome && email && numero);
        }
        else{
            return false;
        }
    }
}
