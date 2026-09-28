# app.config & create_app

## 개념과 사용 시점

앱 팩토리는 구성·확장 초기화를 실행 시점으로 미뤄 테스트별 앱을 만들기 쉽게 합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "15. app.config & create_app/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:5000/"
```

## 코드 읽기

```python
from flask import Flask, request, jsonify, abort

app = Flask(__name__)

def create_app(testing=False):
    instance = Flask(__name__)
    instance.config.update(TESTING=testing, COURSE_LABEL="Flask")
    @instance.get("/")
    def index():
        return {"label": instance.config["COURSE_LABEL"]}
    return instance

app = create_app()
```

[실행 파일](app.py)

## 요청·예상 결과

label=Flask

## 주의사항

테스트·운영 설정을 분리하고 비밀번호는 소스 코드에 넣지 마세요.

## 연습

팩토리 매개변수로 label을 주입하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
