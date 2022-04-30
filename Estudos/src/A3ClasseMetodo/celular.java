package A3ClasseMetodo;
class Fabrica{
    public static void main(String[] args) {
        celular c1 = new celular();
        c1.cor = "azul";

        celular c2 = new celular();
        c2.cor = "rosa";
    }
}

class celular{
    static String processador = "SnapDragon XXXX";
    String cor;
}