# 배열과 Arrays

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
배열은 **고정된 길이**의 동일 타입 데이터를 저장합니다. 인덱스는 0부터 시작합니다.

```java
int[] a = new int[3];
int[] b = {10, 20, 30};
System.out.println(b.length);
```

## 2-Dimensional Array
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};

for (int[] row : matrix) {
    for (int value : row) {
        System.out.println(value);
    }
}
```

## Arrays Utility
```java
import java.util.Arrays;

int[] values = {3, 1, 2};
Arrays.sort(values);
System.out.println(Arrays.toString(values));
```

## 동작 원리와 주의사항

배열 길이는 length 필드, String 길이는 length(), 컬렉션 크기는 size()입니다. Java의 2차원 배열은 배열의 배열이라 각 행 길이가 다를 수 있습니다. Arrays.copyOf는 참조형 원소의 객체까지 깊게 복사하지 않습니다.

## 직접 확인하기

길이가 1, 2, 3인 세 행을 만들고 각 행의 length로 순회하세요.

---

[언어 목차](../README.md) · [이전](../10.%20method/README.md) · [다음](../12.%20string/README.md)

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
