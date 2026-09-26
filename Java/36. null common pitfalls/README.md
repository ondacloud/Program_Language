# null과 자주 하는 실수

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
## NullPointerException
```java
String text = null;
// text.length(); // NullPointerException
```
외부 입력이나 nullable 값은 사용 전에 검증하고, API 설계 단계에서 null 허용 여부를 명확히 하는 것이 좋습니다.

## Integer Overflow
```java
int max = Integer.MAX_VALUE;
System.out.println(max + 1); // Integer.MIN_VALUE로 overflow
```

## Floating Point Precision
```java
System.out.println(0.1 + 0.2); // 정확히 0.3으로 표현되지 않을 수 있음
```
금액처럼 정확한 10진 연산이 필요한 경우 `BigDecimal`을 고려합니다.

```java
import java.math.BigDecimal;
BigDecimal a = new BigDecimal("0.1");
BigDecimal b = new BigDecimal("0.2");
System.out.println(a.add(b)); // 0.3
```

## Mutable Collection Exposure
내부 Collection을 그대로 반환하면 외부에서 객체 상태를 변경할 수 있습니다. 필요하면 unmodifiable view 또는 복사본을 반환합니다.

## 동작 원리와 주의사항

Objects.requireNonNull은 경계에서 null을 조기에 거부할 때 유용합니다. Math.addExact는 정수 오버플로를 예외로 검출합니다. BigDecimal.equals는 값뿐 아니라 scale도 비교하므로 수치 비교는 compareTo와 구별하세요.

## 직접 확인하기

new BigDecimal("1.0")과 new BigDecimal("1.00")의 equals 및 compareTo 결과를 비교하세요.

---

[언어 목차](../README.md) · [이전](../35.%20object%20methods%20record/README.md) · [다음](../37.%20build%20tools/README.md)

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

### 예제 3

`examples/03` 폴더로 이동하여 실행합니다.

[Main.java](examples/03/Main.java)

```sh
javac -encoding UTF-8 --release 17 -d . Main.java
java -Dfile.encoding=UTF-8 -cp . Main
```

JDK 17 이상이 필요합니다. 부분 예제에는 Main 진입점과 필요한 선언 위치를 보완했습니다.

### 예제 4

`examples/04` 폴더로 이동하여 실행합니다.

[Main.java](examples/04/Main.java)

```sh
javac -encoding UTF-8 --release 17 -d . Main.java
java -Dfile.encoding=UTF-8 -cp . Main
```

JDK 17 이상이 필요합니다. 부분 예제에는 Main 진입점과 필요한 선언 위치를 보완했습니다.
