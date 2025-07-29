# Getter & Setter
**Getter & Setter란?** <br>
클래스의 변수를 직접 다루지 않고, 메서드를 통해 값을 읽고 쓰는 메서드

<br>

## Getter & Setter Baic Structure
```java
public class <ClassName> {
    private <DataType> <Variable>;

    public <DataType> get<Variable>() {
        return <Variable>;
    }

    public void set<Variable>(<DataType> <Variable>) {
        this.<Variable> = <Variable>;
    }
}
```

<br>

## Example
### Class Structure
```java
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```