interface Flyable {
    int MAX_SPEED = 100; // public static final

    void fly();          // public abstract

    default void land() {
        System.out.println("Landing");
    }

    static void info() {
        System.out.println("Flyable");
    }
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird flies");
    }
}

public class Main {
    public static void main(String[] args) {
        Flyable bird = new Bird(); bird.fly(); bird.land(); Flyable.info();
    }
}
