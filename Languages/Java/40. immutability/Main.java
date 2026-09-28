import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        List<String> source = new ArrayList<>(List.of("a"));
        List<String> view = Collections.unmodifiableList(source);
        List<String> snapshot = List.copyOf(source);
        source.add("b");
        System.out.println(view);
        System.out.println(snapshot);
    }
}
