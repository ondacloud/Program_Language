# Interface
**Interface란?** <br>
메서드 선언만 가진 설계도

<br>

## Interface Baic Structure
```java
public interface <InterfaceName> {
    void <MethodName>(<Parameters>);
    
    default void defaultMethod() {
        <Statements>;
    }
}

```

<br>

## Example
### Interface Structure
```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();

        Animal cat = new Cat();
        cat.sound();
    }
}
```