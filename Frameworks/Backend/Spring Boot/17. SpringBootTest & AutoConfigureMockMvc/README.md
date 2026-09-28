# SpringBootTest & AutoConfigureMockMvc

## 개념과 사용 시점

애플리케이션 컨텍스트와 MockMvc로 바인딩·검증·응답을 통합 테스트합니다. 테스트 코드는 tests/course/CourseTest.java에 있습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/17"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/17")
public class Lesson17 {

  @GetMapping
  public Map<String, String> show() {
    return Map.of("message", "testable");
  }
}
```

[실행 파일](Lesson17.java)

## 요청·예상 결과

GET은 testable. 과정 루트 mvn test로 정상·잘못된 입력·롤백·오류 응답을 검증합니다.

## 주의사항

MockMvc는 실제 포트를 열지 않습니다. JDBC·설정 등 컨텍스트 의존성은 함께 초기화됩니다.

## 연습

없는 데이터 404 테스트를 추가하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
