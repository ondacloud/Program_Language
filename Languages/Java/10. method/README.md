# 메서드와 값 전달

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
Java에서는 클래스 밖에 독립적인 함수가 존재하지 않으며, 클래스에 정의한 함수를 **메서드(Method)** 라고 합니다.

```java
public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        int result = add(10, 20);
        printMessage("result=" + result);
    }
}
```

## 매개변수와 인수
`int a, int b`는 parameter이고 `add(10, 20)`의 `10`, `20`은 argument입니다.

## 가변 인수
```java
static int sum(int... numbers) {
    int result = 0;
    for (int n : numbers) result += n;
    return result;
}
```

## 값에 의한 전달
Java는 항상 **값에 의한 전달(pass-by-value)** 입니다. 객체를 전달할 때도 객체의 참조값이 복사되어 전달됩니다.

## 동작 원리와 주의사항

static 메서드는 클래스 이름으로 호출할 수 있고 인스턴스 메서드는 객체가 필요합니다. 객체 참조값이 복사되므로 전달받은 객체의 상태 변경은 보이지만 매개변수를 새 객체로 재대입해도 호출자의 변수는 바뀌지 않습니다. 가변 인수는 마지막 매개변수만 사용할 수 있습니다.

## 직접 확인하기

배열 원소 변경과 매개변수에 새 배열 대입을 각각 구현해 차이를 확인하세요.

---

[언어 목차](../README.md) · [이전](../09.%20break%20continue/README.md) · [다음](../11.%20array/README.md)

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
