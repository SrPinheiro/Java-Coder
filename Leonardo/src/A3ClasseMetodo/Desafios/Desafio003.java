package A3ClasseMetodo.Desafios;

public class Desafio003 {
    public static void main(String[] args) {
        Data3 data = new Data3();
        Data3 data2 = new Data3();

        System.out.println(data.DataFormatada());
        System.out.println(data2.DataFormatada());


    }
}
class Data3 {
    int dia = 7;
    int mes;
    int ano;

    String DataFormatada() {
        return String.format("%s/%s/%s", dia, mes, ano);
    }
    Data3(){
        dia = 30;
        mes = 26;
        ano = 1970;
    }
    Data3(int diaInicial, int mesInicial, int anoInicial){
       dia = diaInicial;
       mes = mesInicial;
       ano = anoInicial;
    }
}
