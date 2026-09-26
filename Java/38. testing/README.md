# 테스트 — 경계값과 실패 검증

## 핵심 개념

외부 라이브러리 없이도 작은 검증 프로그램으로 동작을 확인할 수 있습니다. 프로젝트에서는 테스트 프레임워크로 실행과 보고를 자동화합니다.

## 실행 예제

```java
public class Main {
    static double average(int[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("empty values");
        }
        long total = 0;
        for (int value : values) total += value;
        return (double) total / values.length;
    }
    static void check(boolean condition, String name) {
        if (!condition) throw new AssertionError(name);
    }
    public static void main(String[] args) {
        check(average(new int[]{2, 4}) == 3.0, "average");
        check(average(new int[]{5}) == 5.0, "single");
        try {
            average(new int[]{});
            throw new AssertionError("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            System.out.println("all checks passed");
        }
    }
}
```

## 실행 결과

```text
all checks passed
```

## 동작 원리와 주의사항

Java의 assert 키워드는 기본적으로 꺼져 있을 수 있어 활성화하려면 java -ea Main이 필요합니다. 위 코드는 명시적인 검사라 -ea 없이 동작합니다. 테스트 프레임워크를 도입하면 단위 테스트별 격리, 예상 예외, 매개변수화 테스트를 사용하세요.

## 직접 확인하기

음수 입력과 Integer.MAX_VALUE 두 개의 평균을 확인하세요. 누적 타입이 int였다면 왜 문제가 될까요?

---

[언어 목차](../README.md) · [이전](../37.%20build%20tools/README.md) · [다음](../39.%20resource%20management/README.md)

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
