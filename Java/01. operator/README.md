# 연산자와 비교

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.

## Arithmetic Operator
|Operator|Description|
|---|---|
|`+`|덧셈, 문자열 연결|
|`-`|뺄셈|
|`*`|곱셈|
|`/`|나눗셈|
|`%`|나머지|

```java
System.out.println(5 / 2);   // 2: 정수 나눗셈
System.out.println(5.0 / 2); // 2.5
```

## Assignment Operator
`=`, `+=`, `-=`, `*=`, `/=`, `%=` 등을 사용합니다.

```java
int a = 10;
a += 5; // a = a + 5
```

## Increment / Decrement
`i++`, `i--`는 현재 값을 사용한 뒤 증감하고, `++i`, `--i`는 먼저 증감한 뒤 값을 사용합니다.

## Comparison Operator
`<`, `>`, `<=`, `>=`, `==`, `!=`의 결과는 정수 `1/0`이 아니라 **boolean 값 `true/false`** 입니다.

```java
int a = 10;
System.out.println(a == 10); // true
```

## Logical Operator
|Operator|Description|
|---|---|
|`&&`|AND, 앞 조건이 false이면 뒤 조건을 평가하지 않는 Short-circuit 연산|
|`\|\|`|OR, 앞 조건이 true이면 뒤 조건을 평가하지 않음|
|`!`|NOT|

## Bitwise / Shift Operator
`&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`를 사용할 수 있습니다. `>>`는 부호를 유지하는 오른쪽 시프트이고 `>>>`는 왼쪽을 0으로 채우는 unsigned right shift입니다.

## Ternary Operator
```java
int age = 20;
String result = age >= 19 ? "Adult" : "Minor";
```

## `==` vs `equals()`
기본형은 `==`로 값을 비교합니다. 객체에서 `==`는 참조가 같은지 비교하므로 문자열 등 객체의 내용 비교에는 일반적으로 `equals()`를 사용합니다.

```java
String a = new String("Java");
String b = new String("Java");
System.out.println(a == b);      // false
System.out.println(a.equals(b)); // true
```

## 동작 원리와 주의사항

정수 나눗셈은 0 방향으로 소수 부분을 버립니다. 정수의 0 나눗셈은 ArithmeticException입니다. &&와 &는 boolean에도 쓸 수 있지만 &는 양쪽을 모두 평가합니다. 문자열과 숫자를 섞는 +는 평가 순서에 따라 문자열 연결이 됩니다.

## 직접 확인하기

"sum=" + 1 + 2와 "sum=" + (1 + 2)의 차이를 확인하세요. 답: sum=12, sum=3.

---

[언어 목차](../README.md) · [이전](../00.%20data%20type/README.md) · [다음](../02.%20print/README.md)

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

### 예제 5

`examples/05` 폴더로 이동하여 실행합니다.

[Main.java](examples/05/Main.java)

```sh
javac -encoding UTF-8 --release 17 -d . Main.java
java -Dfile.encoding=UTF-8 -cp . Main
```

JDK 17 이상이 필요합니다. 부분 예제에는 Main 진입점과 필요한 선언 위치를 보완했습니다.
