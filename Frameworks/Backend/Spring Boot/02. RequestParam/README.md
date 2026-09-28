# RequestParam

## 개념과 사용 시점

쿼리 매개변수를 메서드 입력으로 바인딩합니다. 기본값을 정해 누락 상황을 처리합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/02?name=Mina"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/02")
public class Lesson02 {

  @GetMapping
  public Map<String, String> show(
      @RequestParam(name = "name", defaultValue = "guest") String name) {
    return Map.of("name", name);
  }
}
```

[실행 파일](Lesson02.java)

## 요청·예상 결과

?name=Mina는 Mina, 누락 시 guest

## 주의사항

문자열을 SQL에 연결하지 말고 바인딩하세요. 길이·공백 정책은 별도 검증입니다.

## 연습

limit을 int로 받고 허용 범위를 검사하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
