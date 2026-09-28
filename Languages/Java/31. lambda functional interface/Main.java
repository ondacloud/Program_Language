import java.util.function.Predicate;
import java.util.function.Function;
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Predicate<Integer> positive = number -> number > 0;
        Function<String, Integer> length = String::length;
        System.out.println(add.calculate(10, 20));
        System.out.println(positive.test(-1));
        System.out.println(length.apply("Java"));
    }
}
