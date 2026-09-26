import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        Set<String> set = new HashSet<>(list);

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 100);
        System.out.println(scores.getOrDefault("Bob", 0));
    }
}
