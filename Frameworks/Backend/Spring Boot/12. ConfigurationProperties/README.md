# ConfigurationProperties

## 개념과 사용 시점

관련 설정을 타입 객체에 묶어 주입합니다. 자동 바인딩과 외부 설정을 통해 환경별 값을 분리합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/12"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.*;

@EnableConfigurationProperties(Lesson12.Settings.class)
@RestController
@RequestMapping("/lessons/12")
public class Lesson12 {
  private final Settings settings;

  public Lesson12(Settings settings) {
    this.settings = settings;
  }

  @GetMapping
  public Map<String, String> show() {
    return Map.of("label", settings.label());
  }

  @ConfigurationProperties(prefix = "course")
  public record Settings(String label) {}
}
```

[실행 파일](Lesson12.java)

## 요청·예상 결과

기본 설정의 label=Spring Boot course

## 주의사항

설정 타입의 등록이 필요합니다. 이 예제는 EnableConfigurationProperties를 사용합니다. 비밀값은 파일에 커밋하지 마세요.

## 연습

환경 변수 COURSE_LABEL로 값을 덮어쓰세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
