import java.util.List;
import java.util.Optional;
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> result = numbers.stream()
            .filter(number -> number % 2 == 0)
            .map(number -> number * 10)
            .toList();
        System.out.println(result);
        Optional<String> name = Optional.ofNullable(null);
        System.out.println(name.orElse("Unknown"));
    }
}
