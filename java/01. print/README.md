# Print
**Print란?** <br>
텍스트 출력하는 함수

<br>

## Print Baic Structure
```java
public class Main {
    public static void main(String[] args) {
        System.out.printf("<Text>");
    }
}
```

<br>

## Output Funtion

|Format Specifier|Description|
|---|---|
|%d|10진수 정수형|
|%ld|long 타입 10진수|
|%f|실수형|
|%lf|double 타입 실수형|
|%c|문자|
|%s|문자열|
|%o|8진수|
|%x|16진수|

<br>

## Example
### Print Structure - 1
```java
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello World!");
    }
}
```

### Print Structure - 2
```java
public class Main {
    public static void main(String[] args) {
        String msg = "Hello World!";
        System.out.printf("%s", msg);
    }
}
```