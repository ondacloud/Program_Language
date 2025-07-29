# Function
**Function이란?** <br>
특정 작업을 수행하고 결과를 반환하는 코드 블록

<br>

## Function Basic Structure
```java
public class Main {
    public static void main(String[] args) {
        <Function Name>(<Variable>);
    }

    public static <Data Type> <Function Name>(<Variable>) {
        <Command>;
        ...
        return <Value>;
    }
}
```

<br>

## Example
### Function Structure
```java
public class Main {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = sumNum(a, b);
        System.out.println(c);
    }

    public static int sumNum(int a, int b) {
        return a + b;
    }
}
```