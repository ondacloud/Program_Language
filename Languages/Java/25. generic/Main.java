import java.util.List;
class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
}

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("Java");
        System.out.println(box.get());
        List<? extends Number> values = List.of(1, 2, 3);
        double total = 0;
        for (Number value : values) {
            total += value.doubleValue();
        }
        System.out.println(total);
    }
}
