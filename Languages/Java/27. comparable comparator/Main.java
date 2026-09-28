import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
record Person(String name, int age) {}

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
            new Person("Bob", 20), new Person("Alice", 20), new Person("Chris", 30)));
        people.sort(Comparator.comparingInt(Person::age).thenComparing(Person::name));
        for (Person person : people) {
            System.out.println(person.name() + ":" + person.age());
        }
    }
}
