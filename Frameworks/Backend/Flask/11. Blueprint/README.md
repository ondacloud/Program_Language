# Blueprint

## 개념과 사용 시점

Blueprint로 관련 경로를 묶고 앱에 접두사를 지정해 등록합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "11. Blueprint/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:5000/api/students"
```

## 코드 읽기

```python
from flask import Flask, request, jsonify, abort
from flask import Blueprint
app = Flask(__name__)

api = Blueprint("students", __name__, url_prefix="/api")

@api.get("/students")
def students():
    return {"students": ["Mina"]}

app.register_blueprint(api)
```

[실행 파일](app.py)

## 요청·예상 결과

/api/students에서 학생 목록 반환

## 주의사항

Blueprint 자체는 실행 서버가 아닙니다. 앱에 등록해야 경로가 활성화됩니다.

## 연습

버전 접두사 /api/v1을 사용하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
