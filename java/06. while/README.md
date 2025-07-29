# While
**While이란?** <br>
주어진 조건을 만족할 때까지 반복하는 함수

<br>

## While Basic Sturcture
```java
public class Main {
    public static void main(String[] args) {
        while (<Condition>) {
            <Command>;
            ...
        }
    }
}
```

<br>

## While Loop Structure
```c
public class Main {
    public static void main(String[] args) {
        while (true) {
            <Command>;
            ...
        }
    }
}

```

<br>

## Example
### While Sturcture - 1
```c
public class Main {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }
    }
}
```

### While Sturcture - 2
```c
public class Main {
    public static void main(String[] args) {
        int a = 1;
        while (true) {
            System.out.println(a);
            a++;

            if (a == 10) {
                break;
            }
        }
    }
}
```