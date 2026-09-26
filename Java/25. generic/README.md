# 제네릭 — 타입 매개변수와 와일드카드

## 핵심 개념

제네릭은 사용하는 타입을 매개변수화하여 컴파일 시 타입 검사를 유지하면서 코드를 재사용합니다.

## 실행 예제

```java
import java.util.List;

class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
}

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("Java");
        System.out.println(box.get());
        List<? extends Number> values = List.of(1, 2, 3);
        double total = 0;
        for (Number value : values) {
            total += value.doubleValue();
        }
        System.out.println(total);
    }
}
```

## 실행 결과

```text
Java
6.0
```

## 동작 원리와 주의사항

List<Integer>는 List<Number>의 하위 타입이 아닙니다. 읽는 생산자는 ? extends T, 쓰는 소비자는 ? super T를 고려합니다. raw type은 타입 검사를 약화합니다. 일반적인 제네릭 타입 정보는 타입 소거되므로 new T()와 new T[n]은 직접 허용되지 않습니다.

## 와일드카드 선택

| 선언 | 읽을 때 | 넣을 때 |
|---|---|---|
| `List<? extends Number>` | Number로 읽기 가능 | 실제 하위 타입을 몰라 일반 Number 추가 불가 |
| `List<? super Integer>` | 안전한 일반 타입은 Object | Integer 추가 가능 |
| `List<?>` | Object로 읽기 | 구체적 타입의 값 추가 불가 |

제네릭 메서드는 `static <T extends Number> double convert(T value)`처럼 선언합니다. 타입 인수에 기본형 int 대신 Integer를 사용하세요.

## 직접 확인하기

Number 하위 타입 리스트의 합을 계산하는 메서드에 List<? extends Number>를 사용하세요.

---

[언어 목차](../README.md) · [이전](../24.%20wrapper%20autoboxing/README.md) · [다음](../26.%20collection/README.md)

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
