# 람다와 함수형 인터페이스

## 핵심 개념

하나의 추상 메서드를 가진 인터페이스의 구현을 표현식으로 전달할 수 있습니다.

## 실행 예제

```java
import java.util.function.Predicate;
import java.util.function.Function;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Predicate<Integer> positive = number -> number > 0;
        Function<String, Integer> length = String::length;
        System.out.println(add.calculate(10, 20));
        System.out.println(positive.test(-1));
        System.out.println(length.apply("Java"));
    }
}
```

## 실행 결과

```text
30
false
4
```

## 동작 원리와 주의사항

람다는 함수형 인터페이스 타입이 있는 문맥에서 사용합니다. 외부 지역 변수를 캡처하려면 final 또는 effectively final이어야 합니다. 이는 캡처한 객체의 내부 상태까지 불변이라는 뜻은 아닙니다. Predicate는 조건 검사, Function은 변환, Consumer는 소비, Supplier는 값 생성을 나타냅니다. 메서드 참조는 호환되는 기존 메서드를 연결하는 표현입니다.

## 직접 확인하기

Predicate<String>으로 빈 문자열이 아닌지 검사하는 람다를 작성하세요.

---

[언어 목차](../README.md) · [이전](../30.%20date%20time/README.md) · [다음](../32.%20stream%20optional/README.md)

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
