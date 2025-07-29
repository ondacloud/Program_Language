# Break
**Break란?** <br>
이하 실행문을 수행하지 않고 반복문을 끝내는 함수

<br>

## Example
### Break Structure
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
    }
}
```