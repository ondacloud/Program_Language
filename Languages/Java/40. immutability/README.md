# 불변 객체와 방어적 복사

## 핵심 개념

외부에서 상태를 바꿀 수 없는 객체는 추론과 공유가 쉽습니다. final 필드만으로 깊은 불변성이 완성되지는 않습니다.

## 실행 예제

```java
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<String> source = new ArrayList<>(List.of("a"));
        List<String> view = Collections.unmodifiableList(source);
        List<String> snapshot = List.copyOf(source);
        source.add("b");
        System.out.println(view);
        System.out.println(snapshot);
    }
}
```

## 실행 결과

```text
[a, b]
[a]
```

## 동작 원리와 주의사항

unmodifiableList는 수정 불가능한 뷰이므로 원본의 변화를 볼 수 있습니다. List.copyOf는 원본의 이후 구조 변경을 반영하지 않는 목록을 제공합니다. 둘 다 원소 객체를 깊게 복사하지는 않습니다. 생성자 입력과 반환값 모두에서 소유권을 고려하세요.

## 직접 확인하기

원소를 가변 객체로 바꾸고 객체 내부 변경이 양쪽에 보이는지 확인하세요.

---

[언어 목차](../README.md) · [이전](../39.%20resource%20management/README.md) · [다음](../41.%20annotations%20reflection/README.md)

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
