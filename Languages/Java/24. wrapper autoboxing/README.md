# 래퍼 타입과 오토박싱

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
기본형을 객체처럼 다룰 수 있도록 `Integer`, `Long`, `Double`, `Boolean`, `Character` 등의 wrapper class가 제공됩니다.

```java
int primitive = 10;
Integer boxed = primitive; // autoboxing
int value = boxed;         // unboxing

int parsed = Integer.parseInt("123");
String text = Integer.toString(123);
```

> Wrapper 객체는 `null`일 수 있으므로 unboxing 시 `NullPointerException`에 주의합니다.

## 동작 원리와 주의사항

Integer의 ==는 객체 참조 비교가 될 수 있고 캐시 범위에 따라 우연히 같아 보일 수 있습니다. 내용은 equals 또는 언박싱 후 비교하세요. parseInt 실패는 NumberFormatException입니다. 컬렉션 제네릭에는 int가 아니라 Integer를 씁니다.

## 직접 확인하기

Integer a = 1000, b = 1000에서 a.equals(b)를 확인하세요.

---

[언어 목차](../README.md) · [이전](../23.%20enum/README.md) · [다음](../25.%20generic/README.md)

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
