# 문자열과 StringBuilder

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
`String`은 문자열을 표현하는 클래스이며 **immutable(불변)** 입니다. 문자열을 수정하는 것처럼 보여도 실제로는 새로운 String 객체가 만들어집니다.

```java
String text = "Hello Java";
System.out.println(text.length());
System.out.println(text.substring(0, 5));
System.out.println(text.contains("Java"));
System.out.println(text.toUpperCase());
```

## `equals()`
```java
String a = new String("Java");
String b = new String("Java");
System.out.println(a.equals(b)); // true
```

## StringBuilder
문자열을 반복적으로 붙일 때는 `StringBuilder`가 유용합니다.

```java
StringBuilder sb = new StringBuilder();
sb.append("Hello").append(' ').append("Java");
System.out.println(sb.toString());
```

## 동작 원리와 주의사항

String.length()는 UTF-16 코드 단위 수입니다. 문자열 내용 비교에는 equals를 쓰고, null 가능성이 있으면 Objects.equals(a, b)를 고려합니다. substring의 끝 인덱스는 제외됩니다. StringBuilder는 변경 가능하며 자체적으로 동시 접근을 동기화하지 않습니다.

## 직접 확인하기

substring(0, 5)의 결과가 Hello인지 확인하고 범위를 벗어날 때의 예외를 확인하세요.

---

[언어 목차](../README.md) · [이전](../11.%20array/README.md) · [다음](../13.%20class%20object/README.md)

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
