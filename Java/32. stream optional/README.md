# Stream과 Optional

## 핵심 개념

Stream은 데이터 처리 연산을 연결하며 Optional은 반환값이 없을 수 있음을 나타냅니다.

## 실행 예제

```java
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> result = numbers.stream()
            .filter(number -> number % 2 == 0)
            .map(number -> number * 10)
            .toList();
        System.out.println(result);
        Optional<String> name = Optional.ofNullable(null);
        System.out.println(name.orElse("Unknown"));
    }
}
```

## 실행 결과

```text
[20, 40, 60]
Unknown
```

## 동작 원리와 주의사항

Stream의 중간 연산은 보통 지연되고 최종 연산에서 실행됩니다. toList() 결과는 수정할 수 없습니다. Optional.of(null)은 예외이고 ofNullable(null)은 empty입니다. orElse 인수는 미리 계산되며 비싼 기본값은 orElseGet을 고려합니다. 소비한 Stream은 재사용하지 않습니다. 중간 연산에서 외부 가변 상태를 수정하면 특히 병렬 처리에서 예측하기 어려워집니다. Optional.get을 무조건 호출하지 말고 map, orElseGet, orElseThrow 등으로 부재를 처리하세요.

## 직접 확인하기

filter 뒤 map 순서를 바꾸면 의미가 같은지 입력 예제로 확인하세요.

---

[언어 목차](../README.md) · [이전](../31.%20lambda%20functional%20interface/README.md) · [다음](../33.%20thread%20concurrency/README.md)

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
