# IF & ELSE
**IF & ELSE란?** <br>
조건이 참과 거짓일 때 실행되는 조건문 함수

<br>

## IF & ELSE Basic Structure
```java
public class Main {
    public static void main(String[] args) {
        if (<Condition>) {
            <Command>;
            ...
        }
        else {
            <Command>;
            ...
        }
    }
}
```

<br>

## Example
### IF & ELSE Sturecture
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
        else {
            System.out.println("failed");
        }

        sc.close();
    }
}
```