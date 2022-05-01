package A4Colecoes;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class A7ArrayList {
    public static void main(String[] args) {
        //criando Arraylist
        ArrayList<Usuario> users = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Digite seu nome:");
            var nome = scan.nextLine();

            if(Objects.equals(nome, "false")){
                break;
            }else{
                users.add(new Usuario(nome));
            }

        }
        System.out.println("nome:");
        var i2 = scan.nextLine();

        users.contains(new Usuario(i2));
        users.remove(new Usuario(i2));
        for (var k1 : users) {
            System.out.println(k1);
        }



    }

    private static class Usuario{
        String nome;

        Usuario(String nome){
            this.nome = nome;
        }

        public String toString() {
            return this.nome;
        }

        @Override
        public boolean equals(Object obj) {

            if(obj instanceof Usuario obj2){
               return (this.nome.equals(obj2.nome));

            }else{
                return false;
            }
        }


    }
}
