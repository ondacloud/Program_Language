# Spring

실제 연산자·함수·데코레이터·애너테이션 이름 순서로 구성했습니다. 기초 연산 → 응답 출력 → 요청 입력 → 조건 → 반복 → 프레임워크 주요 기능으로 이어집니다. 선행 언어는 Flask·FastAPI의 Python, Gin의 Go, Spring 계열의 Java입니다.

## 준비와 실행

학습 기준: **Java 17 이상, Maven 3.6.3 이상, Spring Framework 6.2.16, Python 3.10 이상**. 최신 버전 전체를 의미하지 않으며 프로젝트 의존성에 적힌 기준으로 재현합니다.

```powershell
mvn -version
python run.py "00. operator/Main.java"
```


Spring Boot에 의존하지 않는 Spring Framework 과정입니다. 각 Main.java는 독립 실행되며 MVC 3개 장은 MockMvc로 HTTP 처리를 확인합니다. 실제 웹 서버 실행은 [Spring Boot](../Spring%20Boot/README.md)를 이어서 학습하세요.

서버 예제는 로컬 `127.0.0.1`에 바인딩합니다. Ctrl+C로 종료한 뒤 다른 장을 실행하세요. Flask 개발 서버와 단일 Uvicorn·Go·Boot 실습 구성은 운영 배포 설계를 대신하지 않습니다. FastAPI의 `/docs`에서 해당 앱의 입력·응답 계약도 확인할 수 있습니다.

## 구문별 목차

| 번호 | 구문·함수 |
|---|---|
| 00 | [operator](00.%20operator/README.md) |
| 01 | [System.out.println](01.%20System.out.println/README.md) |
| 02 | [Scanner & nextLine](02.%20Scanner%20%26%20nextLine/README.md) |
| 03 | [if & switch](03.%20if%20%26%20switch/README.md) |
| 04 | [for & stream](04.%20for%20%26%20stream/README.md) |
| 05 | [AnnotationConfigApplicationContext](05.%20AnnotationConfigApplicationContext/README.md) |
| 06 | [Configuration & Bean](06.%20Configuration%20%26%20Bean/README.md) |
| 07 | [Component & ComponentScan](07.%20Component%20%26%20ComponentScan/README.md) |
| 08 | [Autowired & constructor injection](08.%20Autowired%20%26%20constructor%20injection/README.md) |
| 09 | [Primary & Qualifier](09.%20Primary%20%26%20Qualifier/README.md) |
| 10 | [Scope](10.%20Scope/README.md) |
| 11 | [Value & Environment](11.%20Value%20%26%20Environment/README.md) |
| 12 | [Profile](12.%20Profile/README.md) |
| 13 | [PostConstruct & PreDestroy](13.%20PostConstruct%20%26%20PreDestroy/README.md) |
| 14 | [EventListener & publishEvent](14.%20EventListener%20%26%20publishEvent/README.md) |
| 15 | [JdbcTemplate & queryForObject](15.%20JdbcTemplate%20%26%20queryForObject/README.md) |
| 16 | [Transactional](16.%20Transactional/README.md) |
| 17 | [RestController & GetMapping](17.%20RestController%20%26%20GetMapping/README.md) |
| 18 | [RequestParam & PathVariable](18.%20RequestParam%20%26%20PathVariable/README.md) |
| 19 | [ExceptionHandler & RestControllerAdvice](19.%20ExceptionHandler%20%26%20RestControllerAdvice/README.md) |

## 종합 실습

학생 생성·목록 조회·단건 조회·삭제 API를 작성하세요. 이름 공백, 점수 범위 0~100, 없는 ID, 잘못된 Content-Type, 허용하지 않은 메서드를 확인합니다. 상태 코드·응답 형식을 정하고 정상 요청뿐 아니라 실패 요청도 테스트하세요. 전역 리스트를 영구 DB로 간주하지 마세요.

[HTTP·설계 공통 안내](../HTTP.md) · [공식 문서](https://docs.spring.io/spring-framework/reference/6.2/index.html) · [Backend 목차](../README.md) · [전체 목차](../../../README.md)
