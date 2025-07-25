package lambdas;

import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;

        var result = increment.andThen(square).apply(1);
        System.out.println(result);
    }
}