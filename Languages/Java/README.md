# Java 학습 가이드

문법을 읽고 직접 실행하면서 동작 원리와 실패 조건을 확인하는 한국어 학습 노트입니다. 기본 설명 기준은 **Java 17**입니다. 이는 최신 버전이라는 뜻이 아니라 예제의 학습 기준입니다.

## 권장 학습 순서

자료형·제어문·메서드 → 배열·문자열 → 클래스·상속·인터페이스 → 제네릭·컬렉션 → 예외·파일 → 람다·Stream·동시성 → 빌드·테스트

폴더 번호는 기존 경로를 유지하기 위한 번호입니다. 새로 보강된 기초 주제는 뒤 번호에 있어도 위 순서에 맞춰 함께 읽으세요. 각 문서는 독립적인 예제이므로 같은 이름의 클래스나 함수를 한 파일에 모두 붙이지 않습니다.

## 첫 프로그램 실행

`Main.java` 파일에 저장하세요.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```

```sh
javac -encoding UTF-8 --release 17 Main.java
java Main
```

`java -version`과 `javac -version`을 확인하세요. `record`와 `Stream.toList()` 등을 포함하므로 Java 8로는 모든 예제를 실행할 수 없습니다. 최신 버전 전용·미리보기 기능은 기본 과정에 필요하지 않습니다.

## 문서 읽는 방법

1. 핵심 개념을 읽고 실행 결과를 먼저 예상합니다.
2. 예제를 실행하고 출력과 원본 데이터 변경을 관찰합니다.
3. 빈 값, 경계값, 잘못된 입력도 시도합니다.
4. 직접 확인하기 문제로 코드를 바꿔 봅니다.

전체 프로그램과 부분 예제를 구별하세요. 부분 예제는 해당 설명에 나온 위치에 넣고, 다중 파일 예제는 파일별로 저장합니다. 주소·스레드 순서·현재 시간 등은 실행마다 다를 수 있습니다.

## 전체 목차

| 번호 | 주제 |
|---|---|
| 00 | [자료형과 형 변환](00.%20data%20type/README.md) |
| 01 | [연산자와 비교](01.%20operator/README.md) |
| 02 | [표준 출력과 서식](02.%20print/README.md) |
| 03 | [입력 — Scanner](03.%20scanner/README.md) |
| 04 | [조건문 — if](04.%20if/README.md) |
| 05 | [switch와 switch 표현식](05.%20switch/README.md) |
| 06 | [for 반복과 순회](06.%20for/README.md) |
| 07 | [while 반복](07.%20while/README.md) |
| 08 | [do-while 반복](08.%20do%20while/README.md) |
| 09 | [break와 continue](09.%20break%20continue/README.md) |
| 10 | [메서드와 값 전달](10.%20method/README.md) |
| 11 | [배열과 Arrays](11.%20array/README.md) |
| 12 | [문자열과 StringBuilder](12.%20string/README.md) |
| 13 | [클래스와 객체](13.%20class%20object/README.md) |
| 14 | [생성자와 this](14.%20constructor%20this/README.md) |
| 15 | [접근 제어와 캡슐화](15.%20access%20modifier%20encapsulation/README.md) |
| 16 | [상속과 super](16.%20inheritance%20super/README.md) |
| 17 | [오버로딩](17.%20overloading/README.md) |
| 18 | [오버라이딩과 다형성](18.%20overriding%20polymorphism/README.md) |
| 19 | [추상 클래스](19.%20abstract/README.md) |
| 20 | [인터페이스](20.%20interface/README.md) |
| 21 | [static과 final](21.%20static%20final/README.md) |
| 22 | [패키지와 import](22.%20package%20import/README.md) |
| 23 | [열거형 enum](23.%20enum/README.md) |
| 24 | [래퍼 타입과 오토박싱](24.%20wrapper%20autoboxing/README.md) |
| 25 | [제네릭 — 타입 매개변수와 와일드카드](25.%20generic/README.md) |
| 26 | [컬렉션 프레임워크](26.%20collection/README.md) |
| 27 | [객체 정렬 — Comparable과 Comparator](27.%20comparable%20comparator/README.md) |
| 28 | [예외 처리](28.%20exception/README.md) |
| 29 | [파일 입출력](29.%20file%20io/README.md) |
| 30 | [날짜와 시간](30.%20date%20time/README.md) |
| 31 | [람다와 함수형 인터페이스](31.%20lambda%20functional%20interface/README.md) |
| 32 | [Stream과 Optional](32.%20stream%20optional/README.md) |
| 33 | [스레드와 동시성 — 결과와 종료 관리](33.%20thread%20concurrency/README.md) |
| 34 | [JVM과 메모리](34.%20jvm%20memory/README.md) |
| 35 | [Object 메서드와 record — 동등성과 복사](35.%20object%20methods%20record/README.md) |
| 36 | [null과 자주 하는 실수](36.%20null%20common%20pitfalls/README.md) |
| 37 | [실행 환경과 빌드 구조](37.%20build%20tools/README.md) |
| 38 | [테스트 — 경계값과 실패 검증](38.%20testing/README.md) |
| 39 | [자원 관리 — try-with-resources](39.%20resource%20management/README.md) |
| 40 | [불변 객체와 방어적 복사](40.%20immutability/README.md) |
| 41 | [애너테이션과 리플렉션](41.%20annotations%20reflection/README.md) |

## 공식 참고 자료

- [공식 학습 자료](https://dev.java/learn/)
- [Java 17 API](https://docs.oracle.com/en/java/javase/17/docs/api/)
- [Java 17 언어 명세](https://docs.oracle.com/javase/specs/jls/se17/html/index.html)
- [record 문서](https://docs.oracle.com/en/java/javase/17/language/records.html)

[전체 언어 가이드](../../README.md)

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

## 동봉 파일 안내

각 주제 문서의 **동봉 실행 파일과 실행 방법**에서 소스 파일과 실행 명령을 확인하세요. 각 주제 문서의 실행 방법을 확인하세요.
