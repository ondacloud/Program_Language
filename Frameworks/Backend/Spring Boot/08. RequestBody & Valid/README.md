# RequestBody & Valid

## 개념과 사용 시점

JSON 본문을 DTO로 변환하고 Bean Validation으로 필드 규칙을 검사합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/08"
```

## 코드 읽기

```java
package course.lessons;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/08")
public class Lesson08 {

  public record Student(@NotBlank @Size(max = 30) String name, @Min(0) @Max(100) int score) {}

  @PostMapping
  public ResponseEntity<Student> create(@Valid @RequestBody Student student) {
    return ResponseEntity.status(201).body(student);
  }
}
```

[실행 파일](Lesson08.java)

## 요청·예상 결과

POST {"name":"Mina","score":80}은 201. 빈 이름·101점은 400. GET은 405입니다.

```powershell
Invoke-RestMethod http://127.0.0.1:8080/lessons/08 -Method Post -ContentType application/json -Body '{"name":"Mina","score":80}'
```

## 주의사항

@Valid만 붙이고 validation 의존성이 없으면 기대한 검사가 동작하지 않습니다. 예제에는 starter-validation이 포함되어 있습니다.

## 연습

점수가 누락된 경우도 거절하려면 Integer와 NotNull의 차이를 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
