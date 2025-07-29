# Abstract
**Abstract란?** <br>
추상 클래스를 만들거나 추상 메서드를 정의할 때 사용하는 키워드 <br>
| 추상 클래스: 직접 객체 생성이 불가능한 클래스, 다른 클래스가 상속받아 사용하도록 설계됨. <br>
추상 메서드: 선언만 있고 구현이 없는 메서드로, 자식 클래스가 반드시 오버라이딩해서 구현해야 함.

<br>

## Abstract Baic Structure
```java
abstract class <ClassName> {
    public abstract <ReturnType> <MethodName>(<Parameters>);

    public void normalMethod() {
        <Statements>;
    }
}

```

<br>

## Abstract Baic Structure
```java
abstract class Animal {
    public abstract void sound();

    public void breathe() {
        System.out.println("Animal is breathing");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.breathe();
    }
}
```