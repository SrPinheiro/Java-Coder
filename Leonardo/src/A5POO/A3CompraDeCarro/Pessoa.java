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

    void trava(int car){
        this.carro.get(car-1).disponibilidade(this);
    }
    void girarChave(int car){
        this.carro.get(car-1).ligar(this);
    }

    void mostrarPreco(int car){
        this.carro.get(car-1).valor(this);
    }
    void alterarPreco(int car, double valor){
        this.carro.get(car-1).preco(this, valor);
    }
}
