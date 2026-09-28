# 자료형과 형 변환

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
Java의 자료형은 **기본형(Primitive Type)** 과 **참조형(Reference Type)** 으로 구분합니다.

## 기본형
|Type|Size|Range / Description|Default Value (field)|
|---|---:|---|---|
|byte|1 Byte|-128 ~ 127|0|
|short|2 Bytes|-32,768 ~ 32,767|0|
|int|4 Bytes|-2,147,483,648 ~ 2,147,483,647|0|
|long|8 Bytes|-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807|0L|
|float|4 Bytes|약 ±3.4E38, 유효 자릿수 약 6~7자리|0.0f|
|double|8 Bytes|약 ±1.7E308, 유효 자릿수 약 15~16자리|0.0d|
|char|2 Bytes|Unicode UTF-16 code unit, `\u0000` ~ `\uFFFF`|`\u0000`|
|boolean|JVM 구현 의존|`true` 또는 `false`|false|

> Java에는 C/C++의 `long long`, `long double`, 포인터 자료형이 없습니다.

## 참조형
배열, 클래스, 인터페이스, `String` 등이 참조형입니다. 참조형 변수는 객체를 참조하는 값을 저장합니다. 참조형 필드와 배열 원소의 기본값은 `null`이며 지역 변수는 직접 초기화해야 합니다.

```java
public class Main {
    public static void main(String[] args) {
        int age = 20;
        long population = 8_000_000_000L;
        double pi = 3.141592;
        char grade = 'A';
        boolean active = true;
        String name = "Alice";

        System.out.println(age);
        System.out.println(population);
        System.out.println(name);
    }
}
```

## 형 변환
```java
int a = 10;
double b = a;       // widening: 자동 변환

double c = 10.7;
int d = (int) c;    // narrowing: 명시적 변환, d == 10
```

## 동작 원리와 주의사항

필드와 배열 원소는 기본값으로 초기화되지만 지역 변수는 사용 전에 직접 초기화해야 합니다. 참조형 지역 변수에도 null이 자동 대입되는 것은 아닙니다. int에서 float로 자동 변환되어도 큰 수의 정밀도가 손실될 수 있습니다. char 하나는 UTF-16 코드 단위이며 이모지 하나가 char 두 개로 표현될 수 있습니다.

## 직접 확인하기

double을 int로 바꿀 때 소수 부분이 어떻게 처리되는지, 범위 밖 값은 어떻게 되는지 확인하세요.

---

[언어 목차](../README.md) · [다음](../01.%20operator/README.md)

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
