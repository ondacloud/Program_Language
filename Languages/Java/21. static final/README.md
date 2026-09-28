# static과 final

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
## static
`static` member는 객체마다 존재하지 않고 클래스에 속합니다.

```java
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}
```

## final
- `final variable`: 한 번 할당 후 재할당 불가
- `final method`: overriding 불가
- `final class`: 상속 불가

```java
final int MAX = 100;
```

참조형 변수를 `final`로 만들면 **참조 자체를 다른 객체로 변경할 수 없는 것**이지, 참조된 객체가 반드시 불변이 되는 것은 아닙니다.

## 동작 원리와 주의사항

static 가변 상태는 인스턴스 간 공유되며 동시 접근에 주의해야 합니다. final 참조와 불변 객체는 별개입니다. static final도 참조 대상 객체의 내부 변경까지 막지는 않습니다.

## 직접 확인하기

final List<String>에 add는 가능하지만 새 List 재대입은 불가능한지 확인하세요.

---

[언어 목차](../README.md) · [이전](../20.%20interface/README.md) · [다음](../22.%20package%20import/README.md)

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
