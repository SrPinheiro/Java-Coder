package A5POO.A6Encapsulamento2;

import A5POO.A6Encapsulamento.Ana;
public class Pedro extends Ana{
    Ana mae = new Ana();

    void testeAcessos(){
        // System.out.println(mae.segredo); private é apenas na classe ANA
        // System.out.println(mae.deverDeCasa); default so é visto no mesmo pacote
        //System.out.println(mae.formaDeFalar);
        System.out.println(formaDeFalar);
        System.out.println(mae.Cor);
    }

    public static void main(String[] args) {
        Pedro p1 = new Pedro();

        System.out.println(p1.formaDeFalar);
        System.out.println(p1.mae.Cor);
    }
}
