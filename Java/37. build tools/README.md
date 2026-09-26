# 실행 환경과 빌드 구조

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.

## JDK와 실행 과정

JDK에는 컴파일러 javac와 실행 명령 java 등이 포함됩니다. 이 정리의 기본 예제는 Java 17로 실행할 수 있습니다. `java -version`과 `javac -version`을 함께 확인해 서로 다른 설치를 가리키지 않는지 보세요.

`Main.java`:

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

결과는 `Hello Java`입니다. 공개 최상위 클래스 이름과 파일 이름을 맞추고 실행 명령에 .class 확장자를 붙이지 않습니다.

## 프로젝트가 커질 때

| 구분 | Maven | Gradle |
|---|---|---|
| 설정 | pom.xml | build.gradle 또는 build.gradle.kts |
| 기본 소스 | src/main/java | src/main/java |
| 기본 테스트 | src/test/java | src/test/java |
| 테스트 | mvn test | gradle test |

프로젝트에 Wrapper가 있으면 Windows는 mvnw.cmd 또는 gradlew.bat, Linux/macOS는 ./mvnw 또는 ./gradlew를 사용하여 도구 버전을 맞춥니다. Wrapper 실행 시 도구와 의존성을 다운로드할 수 있습니다. 의존성 버전은 프로젝트 설정에 고정하고 자동으로 최신 버전을 추정하지 마세요.

## 직접 확인하기

Main.java를 다른 이름으로 저장하면 컴파일러가 어떤 오류를 내는지 확인하세요. 여러 파일을 빌드할 때는 javac -d out으로 출력 위치를 분리하고 java -cp out Main으로 실행할 수 있습니다.

---

[언어 목차](../README.md) · [이전](../36.%20null%20common%20pitfalls/README.md) · [다음](../38.%20testing/README.md)

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
