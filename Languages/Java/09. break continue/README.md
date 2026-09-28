# break와 continue

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
`break`는 가장 가까운 반복문 또는 switch를 종료하고, `continue`는 현재 반복의 남은 코드를 건너뛰고 다음 반복으로 이동합니다.

```java
for (int i = 0; i < 10; i++) {
    if (i == 2) continue;
    if (i == 7) break;
    System.out.println(i);
}
```

## Labeled Break / Continue
중첩 반복문에서 특정 반복문을 대상으로 지정할 수도 있습니다.

```java
outer:
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (i == 1 && j == 1) break outer;
    }
}
```

## 동작 원리와 주의사항

첫 예제는 0, 1, 3, 4, 5, 6을 줄마다 출력합니다. return은 반복문이 아닌 메서드 자체를 끝냅니다. 레이블은 여러 겹의 반복을 제어할 때 유용하지만 메서드 분리도 고려하세요.

## 직접 확인하기

if (i == 7) break를 출력 뒤로 옮기면 7도 출력되는 이유를 설명하세요.

---

[언어 목차](../README.md) · [이전](../08.%20do%20while/README.md) · [다음](../10.%20method/README.md)

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
