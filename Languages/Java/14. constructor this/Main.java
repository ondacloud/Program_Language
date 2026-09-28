class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name) {
        this(name, 0); // 다른 생성자 호출, 반드시 첫 문장
    }
}

public class Main {
    public static void main(String[] args) {
        Person a = new Person("Kim", 20); Person b = new Person("Lee"); System.out.println(a != b);
    }
}
