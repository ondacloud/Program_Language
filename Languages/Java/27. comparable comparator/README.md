# 객체 정렬 — Comparable과 Comparator

## 핵심 개념

Comparable은 타입의 자연 순서를 정의하고 Comparator는 용도별 정렬 기준을 외부에서 구성합니다.

## 실행 예제

```java
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

record Person(String name, int age) {}

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
            new Person("Bob", 20), new Person("Alice", 20), new Person("Chris", 30)));
        people.sort(Comparator.comparingInt(Person::age).thenComparing(Person::name));
        for (Person person : people) {
            System.out.println(person.name() + ":" + person.age());
        }
    }
}
```

## 실행 결과

```text
Alice:20
Bob:20
Chris:30
```

## 동작 원리와 주의사항

비교 결과는 음수·0·양수로 순서를 나타냅니다. 정수 뺄셈으로 비교하면 오버플로할 수 있으므로 Integer.compare나 comparingInt를 씁니다. thenComparing으로 동점 기준을 추가합니다. `Comparable<T>`는 `compareTo(T other)`를 구현합니다. 정렬 집합·맵은 비교 결과 0으로 같은 정렬 키를 판단하므로 equals와의 일관성도 고려합니다.

## 직접 확인하기

나이는 내림차순, 이름은 오름차순으로 바꾸세요. comparingInt(...).reversed().thenComparing(...) 순서를 확인하세요.

---

[언어 목차](../README.md) · [이전](../26.%20collection/README.md) · [다음](../28.%20exception/README.md)

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
