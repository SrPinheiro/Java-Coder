package A8TratamentoErros.A2CriandoExcecoes;

public class A1Exp {
    public static void main(String[] args) {

        System.out.println("ola mundo");



       try{
           erro1();
           erro2();

        }catch(Exception e){
        //
        }


        System.out.println("Testeee");
    }
    static void erro1(){ //Exception que nao possui obrigatoriedade de ser checada
        throw new RuntimeException("ahahhah qual é a graça");
    }

    static void erro2() throws Exception { //Exception que precisa ser checada
        throw new Exception("Imaginei que você perguntaria");
    }

}
