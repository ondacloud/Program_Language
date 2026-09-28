# 파일 입출력

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
Modern Java에서는 `java.nio.file.Files`, `Path`를 사용하면 편리합니다.

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("sample.txt");

        Files.writeString(path, "Hello Java\n");
        String content = Files.readString(path);
        System.out.println(content);
    }
}
```

## Stream-based I/O
큰 파일이나 binary 데이터를 처리할 때 `InputStream`/`OutputStream`, 문자 데이터에는 `Reader`/`Writer` 계열을 사용합니다. 자원은 try-with-resources로 닫는 것을 권장합니다.

## 동작 원리와 주의사항

실행 예제의 Files.writeString은 sample.txt가 있으면 내용을 덮어씁니다. 연습 폴더에서 실행하세요. readString/writeString의 기본 인코딩은 UTF-8입니다. 큰 파일의 Files.lines는 지연 스트림이므로 try-with-resources로 닫아야 합니다.

## 직접 확인하기

Files.createTempFile을 사용해 임시 파일에 쓰고 finally에서 삭제하도록 바꾸세요.

---

[언어 목차](../README.md) · [이전](../28.%20exception/README.md) · [다음](../30.%20date%20time/README.md)

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
