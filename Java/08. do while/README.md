# do-while 반복

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
본문을 먼저 실행하고 조건을 검사하므로 **최소 한 번은 실행**됩니다.

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

## 동작 원리와 주의사항

조건이 처음부터 거짓이어도 한 번은 실행합니다. 마지막 while 뒤의 세미콜론을 빠뜨리지 마세요. 메뉴 출력 후 재시도 여부를 검사하는 흐름에 적합합니다.

## 직접 확인하기

i를 5로 시작할 때 5가 한 번 출력되는지 확인하세요.

---

[언어 목차](../README.md) · [이전](../07.%20while/README.md) · [다음](../09.%20break%20continue/README.md)

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
