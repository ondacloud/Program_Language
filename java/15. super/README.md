# Super
**Super란?** <br>
자식 클래스가 부모 클래스의 변수나 메서드, 생성자를 사용할 때 쓰는 키워드

<br>

## Array Baic Structure
```java
class Animal {
    String name = "Animal";

    public Animal() {
        System.out.println("Animal constructor");
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String name = "Dog";

    public Dog() {
        super();
        System.out.println("Dog constructor");
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Dog barks");
    }

    public void printNames() {
        System.out.println(name);
        System.out.println(super.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.printNames();
    }
}
```