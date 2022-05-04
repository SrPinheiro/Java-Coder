package A5POO.A3CompraDeCarro;

class Carro {
    private String nome;
    private double preco;
    private boolean disponivel;

    private boolean motor;

    private Pessoa dono;
    Carro(String nome, double preco, boolean disponivel) {
        this.nome = nome;
        this.preco = preco;
        this.disponivel = disponivel;
        this.motor = false;
    }
    Carro(){
        this("Carro",20000,true);
    }
    void venda(Pessoa dono) {
        if (this.disponivel) {
            if (dono.money >= this.preco) {
                dono.money -= this.preco;
                if(this.dono != null){
                    this.dono.carro.remove(this);
                }
                this.dono = dono;
                dono.carro.add(this);
            } else {
                System.out.println("Sem dinheiro");
            }
        }else {
            System.out.println("Indisponivel");

        }
    }

    void ligar(Pessoa dono){
       if(dono.equals(this.dono)){
           if(this.motor){
               this.motor = false;
           }else{
               this.motor = true;
           }
        }
    }


    public String toString() {
        return this.nome;
    }
    void disponibilidade(Pessoa dono, boolean chave){
        if(dono.equals(this.dono)){
            this.disponivel = chave;
        }
    }
    void preco(Pessoa dono, double valor){
        if(dono.equals(this.dono)){
            this.preco = valor;
        }
    }
}
