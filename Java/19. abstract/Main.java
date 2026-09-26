abstract class Animal {
    private final String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void sound();
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog("Milo"); System.out.println(a.getName()); a.sound();
    }
}
