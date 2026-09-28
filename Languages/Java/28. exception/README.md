# 예외 처리

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
예외 처리는 프로그램 실행 중 발생할 수 있는 비정상 상황을 처리합니다.

```java
try {
    int value = Integer.parseInt("abc");
    System.out.println(value);
} catch (NumberFormatException e) {
    System.out.println("숫자 형식이 아닙니다.");
} finally {
    System.out.println("정리 단계");
}
```

## 검사 예외와 비검사 예외
- Checked Exception: 컴파일러가 처리 또는 `throws` 선언을 요구 (`IOException` 등)
- Unchecked Exception: `RuntimeException` 계열 (`NullPointerException`, `IllegalArgumentException` 등)

## throw / throws
```java
static void validateAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("age must be >= 0");
    }
}
```

## 동작 원리와 주의사항

finally는 일반적인 제어 흐름의 정리용이며 JVM 강제 종료까지 실행을 보장하지 않습니다. finally에서 return하면 기존 반환·예외를 가릴 수 있습니다. Error도 unchecked 계열이지만 보통 복구 대상으로 광범위하게 잡지 않습니다. 자원은 try-with-resources로 관리하세요.

## 직접 확인하기

숫자 변환 실패와 파일 접근 실패에 서로 다른 메시지를 제공하세요.

---

[언어 목차](../README.md) · [이전](../27.%20comparable%20comparator/README.md) · [다음](../29.%20file%20io/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[Main.java](Main.java)

```sh
javac -encoding UTF-8 --release 17 -d . Main.java
java -Dfile.encoding=UTF-8 -cp . Main
```

JDK 17 이상이 필요합니다. 부분 예제에는 Main 진입점과 필요한 선언 위치를 보완했습니다.

### 예제 2

`examples/02` 폴더로 이동하여 실행합니다.

[Main.java](examples/02/Main.java)

```sh
javac -encoding UTF-8 --release 17 -d . Main.java
java -Dfile.encoding=UTF-8 -cp . Main
```

JDK 17 이상이 필요합니다. 부분 예제에는 Main 진입점과 필요한 선언 위치를 보완했습니다.
