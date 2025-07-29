# Scanner
**Scanner란?** <br>
사용자 입력을 받기 위한 표준 입력 클래스
| 'java.util.Scanner'를 import 하여 사용한다.

<br>

## Scanner Baic Structure
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}
```

<br>

## Output Funtion

|Method|Description|
|---|---|
|sc.nextInt()|정수 입력|
|sc.nextLong()|long 정수 입력|
|sc.nextDouble()|실수 입력|
|sc.next()|문자열(공백 전까지) 입력|
|sc.nextLine()|문자열(한 줄 전체) 입력|
|sc.nextBoolean()|true/false 입력|

<br>

## Example
### Scanner Structure - 1
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("입력한 숫자: %d%n", num);
        sc.close();
    }
}
```

### Scanner Structure - 2
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.printf("입력한 문장: %s%n", line);
        sc.close();
    }
}
```