# Class
**Class란?** <br>
객체의 속성과 동작을 정의하는 설계도

<br>

## Class Baic Structure
```java
public class <ClassName> {
    <DataType> <variableName>;

    public <ClassName>() {
        // Initialization code
    }

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
public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String introduce() {
        return "Hello, my name is " + name;
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        Person p = new Person("Alice");
        System.out.println(p.introduce());
    }
}
```