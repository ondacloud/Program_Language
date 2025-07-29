# IF
**IF란?** <br>
조건이 참 일 때 실행되는 조건문 함수

<br>

## IF Basic Structure
```java
public class Main {
    public static void main(String[] args) {
        if (<Condition>) {
            <Command>;
            ...
        }
    }
}
```

<br>

## Example
### IF Sturecture
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

        if (a < 0) {
            System.out.println("successed");
        }

        sc.close();
    }
}
```