# 컬렉션 프레임워크

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
Java Collection Framework는 여러 데이터를 효율적으로 저장하고 처리하는 표준 자료구조 API입니다.

|Interface|Typical Implementations|Feature|
|---|---|---|
|`List`|`ArrayList`, `LinkedList`|순서 O, 중복 O|
|`Set`|`HashSet`, `TreeSet`|중복 X|
|`Queue`|`ArrayDeque`, `PriorityQueue`|대기열 처리|
|`Map`|`HashMap`, `TreeMap`|key-value 저장, Collection 인터페이스 자체를 상속하지 않음|

```java
import java.util.*;

List<String> list = new ArrayList<>();
list.add("A");
list.add("B");

Set<String> set = new HashSet<>(list);

Map<String, Integer> scores = new HashMap<>();
scores.put("Alice", 100);
System.out.println(scores.getOrDefault("Bob", 0));
```

## 동작 원리와 주의사항

ArrayList는 인덱스 접근에, ArrayDeque는 스택·큐에 유용합니다. HashMap/HashSet은 순서를 보장하지 않습니다. List.of는 수정할 수 없고 null도 허용하지 않습니다. Arrays.asList는 원본 배열에 연결된 고정 크기 목록입니다.

## 직접 확인하기

List.of와 new ArrayList<>(List.of(...))에 add를 호출해 차이를 확인하세요.

---

[언어 목차](../README.md) · [이전](../25.%20generic/README.md) · [다음](../27.%20comparable%20comparator/README.md)

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
