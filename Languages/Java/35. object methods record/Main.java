import java.util.List;
import java.util.ArrayList;
record User(String name, List<String> roles) {
    User {
        roles = List.copyOf(roles);
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> source = new ArrayList<>(List.of("reader"));
        User first = new User("Alice", source);
        source.add("admin");
        User second = new User("Alice", List.of("reader"));
        System.out.println(first.roles());
        System.out.println(first.equals(second));
        System.out.println(first.hashCode() == second.hashCode());
    }
}
