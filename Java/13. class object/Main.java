class Person {
    String name;
    int age;

    void introduce() {
        System.out.printf("%s, %d%n", name, age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Alice";
        p.age = 20;
        p.introduce();
    }
}
