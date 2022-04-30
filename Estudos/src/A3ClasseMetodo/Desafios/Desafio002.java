package A3ClasseMetodo.Desafios;

public class Desafio002 {
    public static void main(String[] args) {
        Data2 data = new Data2();
        data.dia = 12;
        data.mes = 7;
        data.ano = 2121;
        System.out.println(data.DataFormatada());

    }
}
class Data2{
    int dia;
    int mes;
    int ano;

    //2 metodos com o mesmo nome
    String DataFormatada(){
        return String.format("%s/%s/%s", dia, mes, ano);
    }
    void DataFormatada(int a){
        System.out.printf("%s/%s/%s\n",dia,mes,ano);
    }

}