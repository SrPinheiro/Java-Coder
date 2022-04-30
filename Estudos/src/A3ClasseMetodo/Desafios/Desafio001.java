package A3ClasseMetodo.Desafios;

public class Desafio001 {
    public static void main(String[] args) {
        Data tempo1 = new Data();

        tempo1.dia = 11;
        tempo1.mes = 9;
        tempo1.ano = 2001;

        System.out.printf("Dia: %s\n", tempo1.dia);
        System.out.printf("Mes: %s\n", tempo1.mes);
        System.out.printf("Ano: %s\n", tempo1.ano);
    }

}
class Data{
    int dia;
    int mes;
    int ano;
}