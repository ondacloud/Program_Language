# LoggerFactory & logging level

## 개념과 사용 시점

구조화 가능한 로그 메시지와 레벨로 서버 동작을 관찰합니다. 설정에서 패키지별 로그 레벨을 제어할 수 있습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/19"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/19")
public class Lesson19 {
  private static final Logger log = LoggerFactory.getLogger(Lesson19.class);

  @GetMapping
  public Map<String, String> show() {
    log.info("course request handled");
    return Map.of("message", "logged");
  }
}
```

[실행 파일](Lesson19.java)

## 요청·예상 결과

서버 INFO 로그와 message=logged 응답

## 주의사항

토큰·비밀번호·민감한 요청 본문을 로그에 넣지 마세요. 요청 실패를 조사할 상관관계 ID와 관찰 도구는 별도 설계합니다.

## 연습

DEBUG 로그를 추가하고 설정으로 노출 여부를 바꾸세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
