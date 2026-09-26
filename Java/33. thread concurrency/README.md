# 스레드와 동시성 — 결과와 종료 관리

## 핵심 개념

동시에 실행하는 작업은 완료 대기, 오류 전달, 공유 상태 보호를 함께 설계해야 합니다.

## 실행 예제

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        try {
            Future<Integer> first = executor.submit(() -> 10 + 20);
            Future<Integer> second = executor.submit(() -> 2 * 3);
            System.out.println(first.get() + second.get());
        } finally {
            executor.shutdown();
        }
    }
}
```

## 실행 결과

```text
36
```

## 동작 원리와 주의사항

start는 새 스레드에서 실행하고 run 직접 호출은 현재 스레드에서 실행합니다. shutdown은 신규 작업 접수를 막지만 그 호출 자체가 완료 대기를 의미하지는 않습니다. Future.get이나 awaitTermination 등으로 완료를 확인하세요. 예제는 get으로 두 결과를 기다려 출력 순서 의존성을 없앴습니다. 작업 예외는 ExecutionException으로 전달됩니다. InterruptedException을 잡고 여기서 종료한다면 interrupt 상태 복구를 검토하세요. 예제의 throws Exception은 짧은 진입 코드용이며 실제 API에서는 처리할 예외를 구체화합니다.

## 공유 상태 보호

`count++`는 읽기·덧셈·쓰기를 합친 작업이라 단순 volatile int만으로 원자성이 보장되지 않습니다. 단일 카운터는 AtomicInteger, 여러 값의 불변식을 함께 지켜야 하면 synchronized 또는 Lock을 검토합니다. 스레드 안전한 컬렉션도 여러 메서드를 조합한 연산 전체를 자동 원자화하지는 않습니다.

기본 문서는 Java 17용입니다. Java 21 이상의 가상 스레드는 별도 주제이며 여기 예제 실행에 필요하지 않습니다.

## 직접 확인하기

결과가 필요한 작업을 submit으로 실행하고 Future.get으로 오류까지 관찰하세요.

---

[언어 목차](../README.md) · [이전](../32.%20stream%20optional/README.md) · [다음](../34.%20jvm%20memory/README.md)

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
