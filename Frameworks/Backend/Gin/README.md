# Gin

실제 연산자·함수·데코레이터·애너테이션 이름 순서로 구성했습니다. 기초 연산 → 응답 출력 → 요청 입력 → 조건 → 반복 → 프레임워크 주요 기능으로 이어집니다. 선행 언어는 Flask·FastAPI의 Python, Gin의 Go, Spring 계열의 Java입니다.

## 준비와 실행

학습 기준: **Go 1.25 이상, Gin 1.11.0, Python 3.10 이상**. 최신 버전 전체를 의미하지 않으며 프로젝트 의존성에 적힌 기준으로 재현합니다.

```powershell
go mod download
python run.py "00. operator/main.go"
# 별도 터미널에서 검증
python verify.py
```


공백·&가 들어간 장 폴더는 Go import 경로로 쓰지 않습니다. 실행기는 `go run`에 파일 경로를, 검증기는 `go test`에 두 파일 경로를 전달합니다. Gin과 Spring Boot가 모두 8080을 사용하므로 동시에 실행하지 마세요.

서버 예제는 로컬 `127.0.0.1`에 바인딩합니다. Ctrl+C로 종료한 뒤 다른 장을 실행하세요. Flask 개발 서버와 단일 Uvicorn·Go·Boot 실습 구성은 운영 배포 설계를 대신하지 않습니다. FastAPI의 `/docs`에서 해당 앱의 입력·응답 계약도 확인할 수 있습니다.

## 구문별 목차

| 번호 | 구문·함수 |
|---|---|
| 00 | [operator](00.%20operator/README.md) |
| 01 | [Context.JSON & Context.String](01.%20Context.JSON%20%26%20Context.String/README.md) |
| 02 | [Context.Query & DefaultQuery](02.%20Context.Query%20%26%20DefaultQuery/README.md) |
| 03 | [if & AbortWithStatusJSON](03.%20if%20%26%20AbortWithStatusJSON/README.md) |
| 04 | [for & range](04.%20for%20%26%20range/README.md) |
| 05 | [GET & POST & DELETE](05.%20GET%20%26%20POST%20%26%20DELETE/README.md) |
| 06 | [Context.Param](06.%20Context.Param/README.md) |
| 07 | [ShouldBindJSON & binding](07.%20ShouldBindJSON%20%26%20binding/README.md) |
| 08 | [ShouldBindQuery](08.%20ShouldBindQuery/README.md) |
| 09 | [Group](09.%20Group/README.md) |
| 10 | [Use & Next](10.%20Use%20%26%20Next/README.md) |
| 11 | [Set & Get](11.%20Set%20%26%20Get/README.md) |
| 12 | [Error & error middleware](12.%20Error%20%26%20error%20middleware/README.md) |
| 13 | [NoRoute & NoMethod](13.%20NoRoute%20%26%20NoMethod/README.md) |
| 14 | [Context.HTML & template](14.%20Context.HTML%20%26%20template/README.md) |
| 15 | [Request.Context & timeout](15.%20Request.Context%20%26%20timeout/README.md) |
| 16 | [http.Server & Shutdown](16.%20http.Server%20%26%20Shutdown/README.md) |
| 17 | [httptest & NewRecorder](17.%20httptest%20%26%20NewRecorder/README.md) |

## 종합 실습

학생 생성·목록 조회·단건 조회·삭제 API를 작성하세요. 이름 공백, 점수 범위 0~100, 없는 ID, 잘못된 Content-Type, 허용하지 않은 메서드를 확인합니다. 상태 코드·응답 형식을 정하고 정상 요청뿐 아니라 실패 요청도 테스트하세요. 전역 리스트를 영구 DB로 간주하지 마세요.

[HTTP·설계 공통 안내](../HTTP.md) · [공식 문서](https://gin-gonic.com/en/docs/) · [Backend 목차](../README.md) · [전체 목차](../../../README.md)
