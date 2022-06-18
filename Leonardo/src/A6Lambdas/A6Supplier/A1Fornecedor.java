package A6Lambdas.A6Supplier;
import java.util.List;
import java.util.function.Supplier;
import java.util.Arrays;

public class A1Fornecedor {

    public static void main(String[] args) {
        Supplier<List<String>> list1 = () -> Arrays.asList("Larissa", "Julia"); // so retorna e não recebe nada

        System.out.println(list1.get());

    }
}
