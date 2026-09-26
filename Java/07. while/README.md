# while 반복

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
조건이 `true`인 동안 반복합니다. 시작부터 조건이 `false`이면 한 번도 실행되지 않을 수 있습니다.

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

## 동작 원리와 주의사항

조건을 바꾸는 갱신이 필요합니다. continue가 갱신을 건너뛰는 경로도 점검하세요. 반복 횟수가 명확하면 for, 조건 충족까지 기다리면 while을 사용하면 읽기 쉽습니다.

## 직접 확인하기

초깃값 i를 5로 바꾸면 출력이 없는지 확인하세요.

---

[언어 목차](../README.md) · [이전](../06.%20for/README.md) · [다음](../08.%20do%20while/README.md)

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
