# return & JSON

## 개념과 사용 시점

RestController 메서드가 반환한 객체는 HTTP 메시지 변환기를 거쳐 JSON으로 출력됩니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/01"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/01")
public class Lesson01 {

  record Student(String name, int score) {}

  @GetMapping
  public Student show() {
    return new Student("Mina", 80);
  }
}
```

[실행 파일](Lesson01.java)

## 요청·예상 결과

{"name":"Mina","score":80}

## 주의사항

System.out.println은 클라이언트 응답이 아닙니다. 엔티티를 무조건 공개하기보다 응답 DTO를 분리하세요.

## 연습

팀 이름 필드를 추가하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
