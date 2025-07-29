# Switch & Case
**Switch & Case란?** <br>
변수의 값에 따라 코드를 실행하는 조건문 함수

<br>

## Switch & Case Basic Structure
```java
public class Main {
    public static void main(String[] args) {
        switch (<Condition>) {
            case 0:
                <Command>;
                ...
                break;
            case 1:
                <Command>;
                ...
                break;
            ...
            default:
                <Command>;
                break;
        }
    }
}
```

<br>

## Example
### Switch & Case Sturcture
```java
public class Main {
    public static void main(String[] args) {
        int a = 1;

        switch (a) {
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            default:
                System.out.println("case default");
                break;
        }
    }
}

```