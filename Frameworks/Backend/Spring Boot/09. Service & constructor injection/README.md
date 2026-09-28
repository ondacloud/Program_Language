# Service & constructor injection

## 개념과 사용 시점

서비스에 업무 로직을 두고 생성자로 주입받습니다. 생성자가 하나면 Autowired 생략이 가능합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/09"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/09")
public class Lesson09 {
  private final Greeter service;

  public Lesson09(Greeter service) {
    this.service = service;
  }

  @GetMapping
  public Map<String, String> show() {
    return Map.of("message", service.greet());
  }

  @Service
  public static class Greeter {
    public String greet() {
      return "Hello, Mina";
    }
  }
}
```

[실행 파일](Lesson09.java)

## 요청·예상 결과

message=Hello, Mina

## 주의사항

싱글턴 서비스에 요청별 가변 상태를 저장하면 요청 간 데이터가 섞일 수 있습니다.

## 연습

생성자 주입을 사용하는 서비스 단위 테스트를 작성하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
