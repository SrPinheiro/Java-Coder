package A5POO.A3CompraDeCarro;

import java.util.ArrayList;

class Pessoa {
    String nome;

    double money;

    ArrayList<Carro> carro = new ArrayList<Carro>();

    Pessoa(String nome, double money){
        this.nome = nome;
        this.money = money;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Pessoa obj2){
            return obj2.nome.equals(this.nome);
        }else{
            return false;
        }
    }

    void comprarCarro(Carro car){
        car.venda(this);
    }

    void carros(){
        System.out.println(carro.toString());
    }

    void bloquear(Carro car){
        car.disponibilidade(this,false);
    }
    void liberar(Carro car){
        car.disponibilidade(this,true);
    }
    void motor(Carro car){
        car.ligar(this);
    }
    void precoCarro(Carro car, double valor){
        car.preco(this, valor);
    }
}
