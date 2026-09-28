# Flask

실제 연산자·함수·데코레이터·애너테이션 이름 순서로 구성했습니다. 기초 연산 → 응답 출력 → 요청 입력 → 조건 → 반복 → 프레임워크 주요 기능으로 이어집니다. 선행 언어는 Flask·FastAPI의 Python, Gin의 Go, Spring 계열의 Java입니다.

## 준비와 실행

학습 기준: **Python 3.10 이상, Flask 3.1.3**. 최신 버전 전체를 의미하지 않으며 프로젝트 의존성에 적힌 기준으로 재현합니다.

```powershell
python -m venv .venv
.venv\Scripts\python -m pip install -r requirements.txt
.venv\Scripts\python run.py "00. operator/app.py"
# 별도 터미널에서 검증
.venv\Scripts\python verify.py
```

Flask·FastAPI 장의 `python` 명령은 가상환경을 활성화한 상태를 가정합니다. 활성화하지 않으려면 `.venv\Scripts\python`으로 대체하세요. macOS/Linux에서는 `.venv/bin/python`을 사용합니다.

서버 예제는 로컬 `127.0.0.1`에 바인딩합니다. Ctrl+C로 종료한 뒤 다른 장을 실행하세요. Flask 개발 서버와 단일 Uvicorn·Go·Boot 실습 구성은 운영 배포 설계를 대신하지 않습니다. FastAPI의 `/docs`에서 해당 앱의 입력·응답 계약도 확인할 수 있습니다.

## 구문별 목차

| 번호 | 구문·함수 |
|---|---|
| 00 | [operator](00.%20operator/README.md) |
| 01 | [jsonify & return](01.%20jsonify%20%26%20return/README.md) |
| 02 | [request.args](02.%20request.args/README.md) |
| 03 | [if & abort](03.%20if%20%26%20abort/README.md) |
| 04 | [for & list comprehension](04.%20for%20%26%20list%20comprehension/README.md) |
| 05 | [app.route & methods](05.%20app.route%20%26%20methods/README.md) |
| 06 | [route converter](06.%20route%20converter/README.md) |
| 07 | [request.get_json](07.%20request.get_json/README.md) |
| 08 | [request.form](08.%20request.form/README.md) |
| 09 | [render_template](09.%20render_template/README.md) |
| 10 | [url_for & redirect](10.%20url_for%20%26%20redirect/README.md) |
| 11 | [Blueprint](11.%20Blueprint/README.md) |
| 12 | [before_request & after_request](12.%20before_request%20%26%20after_request/README.md) |
| 13 | [errorhandler](13.%20errorhandler/README.md) |
| 14 | [session](14.%20session/README.md) |
| 15 | [app.config & create_app](15.%20app.config%20%26%20create_app/README.md) |
| 16 | [sqlite3 & parameter binding](16.%20sqlite3%20%26%20parameter%20binding/README.md) |
| 17 | [test_client](17.%20test_client/README.md) |

## 종합 실습

학생 생성·목록 조회·단건 조회·삭제 API를 작성하세요. 이름 공백, 점수 범위 0~100, 없는 ID, 잘못된 Content-Type, 허용하지 않은 메서드를 확인합니다. 상태 코드·응답 형식을 정하고 정상 요청뿐 아니라 실패 요청도 테스트하세요. 전역 리스트를 영구 DB로 간주하지 마세요.

[HTTP·설계 공통 안내](../HTTP.md) · [공식 문서](https://flask.palletsprojects.com/en/stable/) · [Backend 목차](../README.md) · [전체 목차](../../../README.md)
