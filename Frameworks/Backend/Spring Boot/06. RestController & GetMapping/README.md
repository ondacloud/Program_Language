# RestController & GetMapping

## 개념과 사용 시점

컨트롤러의 클래스 경로와 메서드 경로를 결합하여 HTTP 엔드포인트를 만듭니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/06"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/06")
public class Lesson06 {

  @GetMapping
  public Map<String, String> show() {
    return Map.of("method", "GET");
  }

  @PostMapping
  public Map<String, String> create() {
    return Map.of("method", "POST");
  }
}
```

[실행 파일](Lesson06.java)

## 요청·예상 결과

GET은 GET, POST는 POST. 다른 메서드는 405

## 주의사항

GET은 조회 의미를 유지하세요. 실제 생성 작업이면 201과 위치 정보를 검토합니다.

## 연습

DELETE를 204로 처리하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
