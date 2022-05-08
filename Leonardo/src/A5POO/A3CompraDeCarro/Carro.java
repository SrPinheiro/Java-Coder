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

    private boolean seguranca(Pessoa dono){
        return dono.equals(this.dono);
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
                this.disponivel = false;
            } else {
                System.out.println("Sem dinheiro");
            }
        }else {
            System.out.println("Indisponivel");

        }
    }

    void ligar(Pessoa dono){
        if(this.seguranca(dono)){
            this.motor = !this.motor;
            System.out.printf("Motor = %s\n", this.motor);
        }
    }

    public String toString() {
        return this.nome;
    }
    void disponibilidade(Pessoa dono){
        if(seguranca(dono)){
            this.disponivel = !this.disponivel;
            System.out.printf("Diponibilidade: %s\n", this.disponivel);
        }
    }
    void preco(Pessoa dono, double valor){
        if(seguranca(dono)){
            this.preco = valor;
        }
    }
    void valor(Pessoa dono){
        System.out.printf("Valor: %s\n", this.preco);
    }
}
