# for 반복과 순회

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.

## Basic For Loop
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

## Infinite Loop
```java
for (;;) {
    // 반복
    break;
}
```

## Enhanced For Loop
배열이나 `Iterable` 객체를 순회할 때 사용합니다.

```java
int[] numbers = {10, 20, 30};
for (int number : numbers) {
    System.out.println(number);
}
```

## 동작 원리와 주의사항

향상된 for의 변수는 매 반복마다 원소 값을 받습니다. 그 변수에 다른 값을 대입한다고 배열 원소가 바뀌지는 않습니다. 원소 객체의 메서드로 상태를 변경하는 경우는 별개입니다.

## 직접 확인하기

배열의 각 숫자를 두 배로 바꾸려면 인덱스 기반 반복이 필요한 이유를 확인하세요.

---

[언어 목차](../README.md) · [이전](../05.%20switch/README.md) · [다음](../07.%20while/README.md)

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
