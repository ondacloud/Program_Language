# switch와 switch 표현식

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
`switch`는 하나의 값에 따라 여러 분기를 처리할 때 사용합니다.

## Traditional Switch
```java
int menu = 2;

switch (menu) {
    case 1:
        System.out.println("Create");
        break;
    case 2:
        System.out.println("Read");
        break;
    default:
        System.out.println("Unknown");
}
```

`break`를 생략하면 다음 case로 계속 진행하는 **fall-through**가 발생할 수 있습니다.

## Switch Expression
Modern Java에서는 값을 반환하는 switch expression을 사용할 수 있습니다.

```java
String grade = "A";
int point = switch (grade) {
    case "A" -> 100;
    case "B" -> 80;
    case "C" -> 60;
    default -> 0;
};
```

## 동작 원리와 주의사항

이 문서는 Java 17을 기준으로 합니다. switch 표현식은 모든 경우를 처리해야 하므로 필요한 경우 default를 둡니다. 화살표 블록에서 값을 내보낼 때 yield를 사용합니다. Java 17의 일반적인 String/enum switch에 null을 전달하면 NullPointerException입니다.

## 직접 확인하기

case "A" -> { int bonus = 5; yield 95 + bonus; }로 블록 표현식을 작성하세요.

---

[언어 목차](../README.md) · [이전](../04.%20if/README.md) · [다음](../06.%20for/README.md)

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
