# Continue
**Continue란?** <br>
이하 실행문을 수행하지 않고 반복문 처음으로 돌아가는 함수

<br>

## Example
### Continue Structure
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i <= 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
```