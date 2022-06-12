package A5POO.A6Encapsulamento;

public class Paulo {
    Ana esposa = new Ana();
    void testeAcessos(){
       // System.out.println(esposa.segredo); private é apenas na classe ANA
        System.out.println(esposa.deverDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.Cor);
    }
}
