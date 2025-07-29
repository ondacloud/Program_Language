# Overloading
**Overloading란?** <br>
같은 이름의 메서드를 매개변수 형태만 달리해 여러 개 정의하는 기능

<br>

## Class Baic Structure
```java
public class <ParentClassName> {
    public <ReturnType> <MethodName>(<Parameters>) {
        <Statements>;
        ...
        return <Value>;
    }
}

public class <ChildClassName> extends <ParentClassName> {
    @Override
    public <ReturnType> <MethodName>(<Parameters>) {
        <Statements>;
        ...
        return <Value>;
    }
}
```

<br>

## Example
### Class Structure
```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}
```

```java
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound();

        Dog myDog = new Dog();
        myDog.sound();

        Animal polyAnimal = new Dog();
        polyAnimal.sound();
    }
}
```