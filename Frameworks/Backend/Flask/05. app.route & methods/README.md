# app.route & methods

## 개념과 사용 시점

route의 methods로 같은 경로의 허용 HTTP 메서드를 지정합니다. GET은 조회, POST는 처리 요청 같은 의미를 가집니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "05. app.route & methods/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:5000/"
```

## 코드 읽기

```python
from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.route("/", methods=["GET", "POST"])
def index():
    return {"method": request.method}
```

[실행 파일](app.py)

## 요청·예상 결과

GET은 GET, POST는 POST; DELETE는 405

## 주의사항

같은 경로라도 HTTP 메서드가 다르면 다른 작업입니다. GET 요청으로 데이터 변경을 설계하지 마세요.

## 연습

PUT을 추가하고 허용되지 않은 메서드를 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
