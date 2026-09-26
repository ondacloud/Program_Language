# 자원 관리 — try-with-resources

## 핵심 개념

AutoCloseable 자원은 try 괄호 안에 선언하면 블록이 끝날 때 자동으로 닫힙니다.

## 실행 예제

```java
class Resource implements AutoCloseable {
    private final String name;
    Resource(String name) { this.name = name; }
    @Override public void close() { System.out.println("close " + name); }
}

public class Main {
    public static void main(String[] args) {
        try (Resource first = new Resource("first");
             Resource second = new Resource("second")) {
            System.out.println("work");
        }
    }
}
```

## 실행 결과

```text
work
close second
close first
```

## 동작 원리와 주의사항

자원은 선언의 역순으로 닫힙니다. 본문과 close가 모두 예외를 던지면 close 예외는 suppressed exception으로 남을 수 있습니다. GC는 파일·소켓 같은 외부 자원의 신속한 반환을 대신하지 않습니다.

## 직접 확인하기

본문에 예외를 발생시켜도 두 close가 호출되는지 확인하세요.

---

[언어 목차](../README.md) · [이전](../38.%20testing/README.md) · [다음](../40.%20immutability/README.md)

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
