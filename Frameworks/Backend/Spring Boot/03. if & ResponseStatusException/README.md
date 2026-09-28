# if & ResponseStatusException

## 개념과 사용 시점

업무 조건을 검사하고 오류 상태를 명확하게 반환합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/03"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/lessons/03")
public class Lesson03 {

  @GetMapping
  public Map<String, String> show(@RequestParam(name = "score", defaultValue = "80") int score) {
    if (score < 0 || score > 100)
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "score must be 0..100");
    return Map.of("result", score >= 70 ? "pass" : "retry");
  }
}
```

[실행 파일](Lesson03.java)

## 요청·예상 결과

score=80은 pass, 101은 400

## 주의사항

기본 오류 본문은 설정·프레임워크 버전에 따라 다릅니다. 사용자 계약이 필요하면 Advice로 정의하세요.

## 연습

0·70·100 경계값을 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
