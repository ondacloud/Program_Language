# JVM과 메모리
Java source code는 일반적으로 다음 과정을 거칩니다.

```text
.java Source
    ↓ javac
.class Bytecode
    ↓ JVM Class Loader
Runtime Data Areas
    ↓
Interpreter / JIT Compiler
    ↓
Native Machine Code
```

## 주요 런타임 영역
- **Heap**: 객체와 배열이 주로 저장되며 Garbage Collector의 관리 대상
- **Java Stack**: thread마다 생성되며 method frame, local variable 등을 저장
- **Method Area**: class metadata, runtime constant pool 등 JVM 수준의 class 정보를 관리
- **PC Register**: thread별 현재 실행 위치 정보
- **Native Method Stack**: native method 실행 지원

## 가비지 컬렉션
GC는 더 이상 도달할 수 없는 객체의 메모리를 자동 회수합니다. 하지만 file, socket, database connection 같은 외부 resource까지 GC에 맡기면 안 되므로 명시적인 close 또는 try-with-resources를 사용해야 합니다.

## 동작 원리와 주의사항

메서드 호출은 스택 프레임을 만들며 재귀가 너무 깊으면 StackOverflowError가 날 수 있습니다. 도달 가능한 객체를 컬렉션에 계속 보관하면 GC가 있어도 메모리 누수가 생깁니다. 메서드 영역은 JVM 명세 개념이며 구현의 Metaspace와 설명 층위를 구분하세요.

## 직접 확인하기

사용이 끝난 객체를 static 목록에 계속 추가할 때 회수되지 않는 이유를 설명하세요.

---

[언어 목차](../README.md) · [이전](../33.%20thread%20concurrency/README.md) · [다음](../35.%20object%20methods%20record/README.md)

## 참조와 도달 가능성 실습

두 참조가 같은 배열을 가리킵니다. 한 참조를 null로 바꿔도 다른 참조가 남으면 배열에 도달할 수 있습니다. 출력은 9와 2이며 GC 실행 시점을 측정하는 예제가 아닙니다.

```java
public class Main {
    public static void main(String[] args) {
        int[] first = {1, 2};
        int[] alias = first;
        alias[0] = 9;
        System.out.println(first[0]);
        alias = null;
        System.out.println(first.length);
    }
}
```

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
