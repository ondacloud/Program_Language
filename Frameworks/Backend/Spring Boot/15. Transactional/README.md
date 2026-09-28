# Transactional

## 개념과 사용 시점

서비스 메서드 경계에서 트랜잭션을 시작하고 런타임 예외 시 롤백합니다. 컨트롤러는 프록시가 적용된 서비스를 호출합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/15"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/15")
public class Lesson15 {
  private final Writer service;
  private final JdbcTemplate jdbc;

  public Lesson15(Writer service, JdbcTemplate jdbc) {
    this.service = service;
    this.jdbc = jdbc;
  }

  @PostMapping
  public Map<String, Integer> create() {
    try {
      service.create();
    } catch (IllegalStateException expected) {
      /* exercise: rollback */
    }
    return Map.of("rows", jdbc.queryForObject("SELECT COUNT(*) FROM tx_students", Integer.class));
  }

  @Service
  public static class Writer {
    private final JdbcTemplate jdbc;

    public Writer(JdbcTemplate jdbc) {
      this.jdbc = jdbc;
    }

    @Transactional
    public void create() {
      jdbc.update("INSERT INTO tx_students(name) VALUES (?)", "Mina");
      throw new IllegalStateException("rollback demo");
    }
  }
}
```

[실행 파일](Lesson15.java)

## 요청·예상 결과

POST 후 rows=0. 예외 전에 실행한 INSERT가 롤백됩니다. GET은 405

## 주의사항

이 예제의 예외 catch는 롤백 결과 관찰용입니다. 실서비스는 실패를 성공처럼 숨기지 말고 API 오류로 매핑하세요. 자기 호출은 기본 프록시를 통과하지 않습니다.

## 연습

예외를 제거하고 rows=1을 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
