# Spring Boot

실제 연산자·함수·데코레이터·애너테이션 이름 순서로 구성했습니다. 기초 연산 → 응답 출력 → 요청 입력 → 조건 → 반복 → 프레임워크 주요 기능으로 이어집니다. 선행 언어는 Flask·FastAPI의 Python, Gin의 Go, Spring 계열의 Java입니다.

## 준비와 실행

학습 기준: **Java 17 이상, Maven 3.6.3 이상, Spring Boot 3.5.11 / Spring Framework 6.2 계열**. 최신 버전 전체를 의미하지 않으며 프로젝트 의존성에 적힌 기준으로 재현합니다.

```powershell
mvn test
mvn spring-boot:run
# 종료 후 실행 JAR 생성
mvn package
java -jar target/spring-boot-course-1.0.0.jar
```


20개 장을 하나의 내장 서버에서 `/lessons/00`부터 `/lessons/19`까지 제공합니다. 경로·메서드에 따라 입력 조건이 다릅니다. H2는 메모리 실습 DB이며 재시작하면 초기화됩니다. Boot 4와 섞지 않는 3.5 계열 학습 기준입니다.

서버 예제는 로컬 `127.0.0.1`에 바인딩합니다. Ctrl+C로 종료한 뒤 다른 장을 실행하세요. Flask 개발 서버와 단일 Uvicorn·Go·Boot 실습 구성은 운영 배포 설계를 대신하지 않습니다. FastAPI의 `/docs`에서 해당 앱의 입력·응답 계약도 확인할 수 있습니다.

## 구문별 목차

| 번호 | 구문·함수 |
|---|---|
| 00 | [operator](00.%20operator/README.md) |
| 01 | [return & JSON](01.%20return%20%26%20JSON/README.md) |
| 02 | [RequestParam](02.%20RequestParam/README.md) |
| 03 | [if & ResponseStatusException](03.%20if%20%26%20ResponseStatusException/README.md) |
| 04 | [for & stream](04.%20for%20%26%20stream/README.md) |
| 05 | [SpringBootApplication & SpringApplication.run](05.%20SpringBootApplication%20%26%20SpringApplication.run/README.md) |
| 06 | [RestController & GetMapping](06.%20RestController%20%26%20GetMapping/README.md) |
| 07 | [PathVariable](07.%20PathVariable/README.md) |
| 08 | [RequestBody & Valid](08.%20RequestBody%20%26%20Valid/README.md) |
| 09 | [Service & constructor injection](09.%20Service%20%26%20constructor%20injection/README.md) |
| 10 | [ResponseEntity](10.%20ResponseEntity/README.md) |
| 11 | [RestControllerAdvice & ExceptionHandler](11.%20RestControllerAdvice%20%26%20ExceptionHandler/README.md) |
| 12 | [ConfigurationProperties](12.%20ConfigurationProperties/README.md) |
| 13 | [Profile & application properties](13.%20Profile%20%26%20application%20properties/README.md) |
| 14 | [JdbcTemplate](14.%20JdbcTemplate/README.md) |
| 15 | [Transactional](15.%20Transactional/README.md) |
| 16 | [Actuator & health](16.%20Actuator%20%26%20health/README.md) |
| 17 | [SpringBootTest & AutoConfigureMockMvc](17.%20SpringBootTest%20%26%20AutoConfigureMockMvc/README.md) |
| 18 | [CommandLineRunner](18.%20CommandLineRunner/README.md) |
| 19 | [LoggerFactory & logging level](19.%20LoggerFactory%20%26%20logging%20level/README.md) |

## 종합 실습

학생 생성·목록 조회·단건 조회·삭제 API를 작성하세요. 이름 공백, 점수 범위 0~100, 없는 ID, 잘못된 Content-Type, 허용하지 않은 메서드를 확인합니다. 상태 코드·응답 형식을 정하고 정상 요청뿐 아니라 실패 요청도 테스트하세요. 전역 리스트를 영구 DB로 간주하지 마세요.

[HTTP·설계 공통 안내](../HTTP.md) · [공식 문서](https://docs.spring.io/spring-boot/3.5/index.html) · [Backend 목차](../README.md) · [전체 목차](../../../README.md)
