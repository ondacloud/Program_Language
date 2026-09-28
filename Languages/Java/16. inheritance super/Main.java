class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // 부모 생성자 호출
    }

    @Override
    void sound() {
        super.sound();
        System.out.println("Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        new Dog("Milo").sound();
    }
}
