# Actuator & health

## 개념과 사용 시점

Actuator는 상태 확인 같은 운영 엔드포인트를 제공합니다. 의존성 추가와 노출 설정을 함께 관리합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/16"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/16")
public class Lesson16 {

  @GetMapping
  public Map<String, String> show() {
    return Map.of("health", "/actuator/health");
  }
}
```

[실행 파일](Lesson16.java)

## 요청·예상 결과

/actuator/health에서 status=UP. 이 장은 해당 경로를 안내합니다.

## 주의사항

예제는 health만 노출하고 상세 정보를 숨깁니다. 모든 관리 엔드포인트를 공개하지 마세요. 운영 접근 제어를 별도로 구성합니다.

## 연습

상태 점검의 liveness·readiness 목적을 구분하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
