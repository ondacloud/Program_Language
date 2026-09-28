class Resource implements AutoCloseable {
    private final String name;
    Resource(String name) { this.name = name; }
    @Override public void close() { System.out.println("close " + name); }
}

public class Main {
    public static void main(String[] args) {
        try (Resource first = new Resource("first");
             Resource second = new Resource("second")) {
            System.out.println("work");
        }
    }
}
