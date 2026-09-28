# Profile & application properties

## 개념과 사용 시점

활성 프로필에 따라 빈 등록을 나눕니다. 공통 설정과 환경별 설정의 우선순위를 이해해야 합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/13"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

@Profile("demo")
@RestController
@RequestMapping("/lessons/13")
public class Lesson13 {

  @GetMapping
  public Map<String, String> show() {
    return Map.of("profile", "demo");
  }
}
```

[실행 파일](Lesson13.java)

## 요청·예상 결과

기본 demo 프로필에서는 200. demo를 끄면 이 컨트롤러가 등록되지 않아 404

## 주의사항

학습 프로젝트 application.properties에서 demo를 활성화합니다. 프로필 자체는 접근 권한이나 비밀 관리 수단이 아닙니다.

## 연습

SPRING_PROFILES_ACTIVE를 다른 값으로 바꾸어 경로 등록을 비교하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
