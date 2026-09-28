# CommandLineRunner

## 개념과 사용 시점

앱 시작 완료 시점에 초기 작업을 수행합니다. 반환하는 CommandLineRunner 빈이 시작 과정에서 실행됩니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/18"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/18")
public class Lesson18 {

  @Bean
  CommandLineRunner courseRunner() {
    return args -> System.out.println("course runner ready");
  }

  @GetMapping
  public Map<String, String> show() {
    return Map.of("startup", "see server log");
  }
}
```

[실행 파일](Lesson18.java)

## 요청·예상 결과

시작 로그에 course runner ready; GET은 안내 JSON

## 주의사항

인스턴스마다 실행되므로 DB 초기화를 전역 한 번만 실행하는 수단으로 가정하지 마세요. 오래 걸리는 작업은 기동을 지연합니다.

## 연습

실행 인자 args를 읽어 보세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
