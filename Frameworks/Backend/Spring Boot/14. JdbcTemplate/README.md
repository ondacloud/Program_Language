# JdbcTemplate

## 개념과 사용 시점

Boot가 준비한 DataSource로 JdbcTemplate을 주입받아 질의합니다. schema.sql과 data.sql이 메모리 DB를 초기화합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/14"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/14")
public class Lesson14 {
  private final JdbcTemplate jdbc;

  public Lesson14(JdbcTemplate jdbc) {
    this.jdbc = jdbc;
  }

  @GetMapping
  public Map<String, String> show(@RequestParam(name = "id", defaultValue = "1") int id) {
    var names =
        jdbc.query("SELECT name FROM students WHERE id = ?", (rs, row) -> rs.getString("name"), id);
    if (names.isEmpty())
      throw new org.springframework.web.server.ResponseStatusException(
          org.springframework.http.HttpStatus.NOT_FOUND);
    return Map.of("name", names.get(0));
  }
}
```

[실행 파일](Lesson14.java)

## 요청·예상 결과

id=1은 Mina, 없는 id는 404

## 주의사항

H2 메모리 DB는 서버 재시작 때 초기화됩니다. 운영 DB 마이그레이션·연결 풀·권한 설정과 구분하세요.

## 연습

작은따옴표 이름을 placeholder로 저장하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
