# 입력 — Scanner

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
`java.util.Scanner`는 표준 입력, 문자열 등의 입력을 쉽게 읽을 수 있는 클래스입니다.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            sc.nextLine(); // 남아 있는 줄바꿈 소비
            String name = sc.nextLine();
            System.out.printf("%s: %d%n", name, age);
        }
    }
}
```

|Method|Description|
|---|---|
|`nextInt()`|int 입력|
|`nextLong()`|long 입력|
|`nextDouble()`|double 입력|
|`nextBoolean()`|boolean 입력|
|`next()`|공백 전까지 문자열 입력|
|`nextLine()`|한 줄 전체 입력|

## 주의: `nextInt()` 후 `nextLine()`
`nextInt()`는 숫자만 소비하고 줄바꿈 문자를 남깁니다. 바로 `nextLine()`을 호출하면 빈 문자열이 들어올 수 있어 필요하면 중간에 `nextLine()`으로 줄바꿈을 소비합니다.

## 동작 원리와 주의사항

예제 입력은 첫 줄 20, 둘째 줄 Alice입니다. 결과는 Alice: 20입니다. 잘못된 숫자는 InputMismatchException이 될 수 있으므로 hasNextInt 또는 한 줄 읽기 후 parseInt로 검증하세요. Scanner를 닫으면 감싼 System.in도 닫히므로 여러 곳에서 공유하는 입력의 수명은 호출자가 관리해야 합니다.

## 직접 확인하기

숫자 대신 abc를 입력하는 경우 오류 메시지를 내고 재입력할 수 있게 바꾸세요.

---

[언어 목차](../README.md) · [이전](../02.%20print/README.md) · [다음](../04.%20if/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[Main.java](Main.java) · [input.txt](input.txt)

```sh
javac -encoding UTF-8 --release 17 -d . Main.java
java -Dfile.encoding=UTF-8 -cp . Main
```

JDK 17 이상이 필요합니다. 부분 예제에는 Main 진입점과 필요한 선언 위치를 보완했습니다.

입력을 요청하면 아래 내용을 순서대로 입력하세요. 같은 내용의 input.txt도 제공합니다.

```text
20
Alice
```
