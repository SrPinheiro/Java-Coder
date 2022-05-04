package A5POO.A2Shopping;

import java.util.ArrayList;

public class Pessoa{
    String cliente;
    ArrayList<Produtos> compras = new ArrayList<>();
    Pessoa(String cliente){
        this.cliente = cliente;
    }
    void add(Produtos e) {
        this.compras.add(e);
        e.cliente = this;
    }
    void add(String nome, double preco, int quantidade){
        this.add(new Produtos(nome,preco,quantidade));
    }

    int quantidade(){
        int total = 0;
        for (var k1 : compras) {
            total+= k1.quantidade;
        }
        return total;
    }

    double precoFinal(){
        double total = 0;
        for (var k1 :compras) {
            total += (k1.preco*k1.quantidade);
        }
        return total;
    }
}