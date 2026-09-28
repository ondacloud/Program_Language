# RestControllerAdvice & ExceptionHandler

## 개념과 사용 시점

예외 타입을 공개 오류 계약으로 변환합니다. 이 장의 Advice는 해당 컨트롤러에만 적용합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/11"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/11")
public class Lesson11 {

  @GetMapping
  public String fail() {
    throw new MissingStudent();
  }

  static class MissingStudent extends RuntimeException {}

  @RestControllerAdvice(assignableTypes = Lesson11.class)
  public static class Errors {
    @ExceptionHandler(MissingStudent.class)
    public ResponseEntity<Map<String, String>> missing() {
      return ResponseEntity.status(404).body(Map.of("error", "student_not_found"));
    }
  }
}
```

[실행 파일](Lesson11.java)

## 요청·예상 결과

404와 {"error":"student_not_found"}

## 주의사항

상세 내부 메시지·스택을 응답에 그대로 포함하지 않습니다. 예상 가능한 업무 오류와 예상하지 못한 결함을 구분하세요.

## 연습

다른 업무 예외를 409로 처리하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
