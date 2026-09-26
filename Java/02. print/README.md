# 표준 출력과 서식

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
Java의 표준 출력은 `System.out.print`, `println`, `printf`를 사용합니다.

|Method|Description|
|---|---|
|`System.out.print()`|출력 후 줄바꿈 없음|
|`System.out.println()`|출력 후 줄바꿈|
|`System.out.printf()`|Format String을 이용한 형식 출력|

## Common Format Specifier
|Specifier|Description|
|---|---|
|`%d`|정수(`byte`, `short`, `int`, `long`)|
|`%f`|실수(`float`, `double`)|
|`%c`|문자|
|`%s`|문자열/객체 문자열 표현|
|`%b`|boolean|
|`%x`|16진수|
|`%o`|8진수|
|`%n`|플랫폼 독립 줄바꿈|

> Java `printf`에서는 C의 `%ld`, `%lf`를 따로 사용하지 않습니다.

```java
public class Main {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 20;
        double score = 95.1234;

        System.out.print("Hello ");
        System.out.println(name);
        System.out.printf("name=%s, age=%d, score=%.2f%n", name, age, score);
    }
}
```

## 동작 원리와 주의사항

printf의 소수점 표현은 로캘에 영향을 받습니다. 결과 형식 고정이 필요하면 Locale.ROOT 등의 로캘을 명시하세요. 잘못된 서식과 인수 조합은 실행 시 예외가 될 수 있습니다.

## 직접 확인하기

%s, %d, %.2f, %n으로 이름·개수·평균을 출력하세요.

---

[언어 목차](../README.md) · [이전](../01.%20operator/README.md) · [다음](../03.%20scanner/README.md)

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
