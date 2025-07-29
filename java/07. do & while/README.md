# Do & While
**Do & While이란?** <br>
주어진 조건을 만족할 때 반복하는 함수

<br>

## Do & While Basic Sturcture

```java
public class Main {
    public static void main(String[] args) {
        do {
            <Command>;
            ...
        } while (<Condition>);
    }
}
``` 

<br>

## Example
### Do & While Sturcture
```java
public class Main {
    public static void main(String[] args) {
        int a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a <= 10);
    }
}
```