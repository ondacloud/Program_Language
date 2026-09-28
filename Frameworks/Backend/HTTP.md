# HTTP 요청부터 응답까지

요청은 메서드·경로·쿼리·헤더·본문으로 구성됩니다. 서버는 라우팅 → 입력 변환·검증 → 업무 로직 → 저장소 → 응답 직렬화 순으로 처리합니다. middleware·filter·interceptor의 실행 위치는 프레임워크에 따라 다릅니다.

| 목적 | Flask | FastAPI | Gin | Spring MVC / Boot |
|---|---|---|---|---|
| 조회 경로 | app.get | app.get | GET | GetMapping |
| 쿼리 입력 | request.args | Query | Query / ShouldBindQuery | RequestParam |
| JSON 입력 | request.get_json | BaseModel | ShouldBindJSON | RequestBody + Valid |
| JSON 출력 | jsonify / dict | return / response_model | Context.JSON | RestController / DTO |
| 오류 | abort / errorhandler | HTTPException | AbortWithStatusJSON | Advice / ExceptionHandler |
| 구조화 | Blueprint | APIRouter / Depends | Group / 명시적 Go 생성자 | Configuration / Bean / Service |
| 포트 없는 검사 | test_client | TestClient | httptest | MockMvc |

Spring은 컨테이너·DI·MVC·트랜잭션 등의 기반 프레임워크입니다. Spring Boot는 이를 사용하면서 자동 설정·starter·내장 서버·운영 기능을 통해 실행 앱 구성을 돕습니다. 서로 대체하는 별개 언어가 아닙니다.

## 상태 코드와 입력 검증

200은 정상 응답, 201은 생성, 204는 본문 없는 성공, 400은 잘못된 요청, 404는 찾을 수 없음, 405는 허용하지 않는 메서드입니다. FastAPI의 기본 입력 검증 오류는 422로 표현됩니다. 500은 서버 오류입니다. 오류 본문이 JSON인지 HTML인지도 계약에 포함합니다. 프레임워크 기본값을 억지로 같은 결과로 가정하지 마세요.

브라우저 입력 검증만 믿지 않고 서버에서 타입·길이·범위·허용 필드를 확인합니다. 타입 변환 성공과 업무상 유효함은 다릅니다. JSON 대신 form 본문을 보낼 때 Content-Type도 맞춥니다. PowerShell의 curl 별칭 차이를 피하려고 문서에서는 curl.exe를 사용합니다. JSON POST는 Invoke-RestMethod의 -ContentType application/json과 -Body를 활용합니다.

## 상태·자원·동시성

요청 데이터는 요청 범위에 두고 공유 가변 상태의 동시성 정책을 정합니다. 세션 쿠키, 인메모리 상태, 영구 DB의 수명은 다릅니다. DB·파일·HTTP 연결은 소유자가 정리해야 합니다. 예제의 SQLite·H2 메모리 DB는 영구 저장을 시연하지 않습니다.

비동기 함수가 모든 블로킹 호출을 자동으로 비동기로 바꾸지는 않습니다. DB·HTTP 드라이버에 맞는 실행 모델을 선택하세요. 요청 타임아웃과 실제 작업 취소, 프로세스 내부 BackgroundTasks와 내구성 있는 작업 큐도 구분합니다.

SQL 값은 매개변수 바인딩으로 전달합니다. 트랜잭션의 성공·롤백 경계를 정하고 동일 요청 재시도 시 중복 처리를 고려하세요. API 인증과 리소스별 권한 검사, 브라우저 CORS, 쿠키 기반 인증의 CSRF 방어는 서로 다른 역할입니다. 이 기초 예제들은 완성된 인증 시스템이 아닙니다.

## 프로젝트 구조 확장

요청 파싱과 HTTP 응답은 라우터·컨트롤러, 업무 규칙은 서비스, DB 접근은 저장소로 나눌 수 있습니다. 작은 예제부터 무조건 많은 계층을 만들기보다 변경 이유가 다른 책임을 분리하세요. 테스트에서는 서비스 규칙·HTTP 계약·실제 DB 동작·운영 네트워크를 각각 필요한 범위로 확인합니다.

운영 배포에는 비밀 관리, HTTPS, 프록시의 신뢰 범위, 타임아웃, 로그·상태 점검, 정상 종료, DB 마이그레이션과 백업을 환경에 맞춰 구성합니다. 예제의 디버그 도구나 관리 엔드포인트를 무조건 외부에 공개하지 마세요.

[Backend 목차](README.md)
