# errorhandler

## 개념과 사용 시점

오류를 잡아 일관된 JSON 형식과 상태 코드로 변환합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "13. errorhandler/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:5000/"
```

## 코드 읽기

```python
from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.errorhandler(404)
def missing(error):
    return {"error": "not_found"}, 404

@app.get("/")
def index():
    abort(404)
```

[실행 파일](app.py)

## 요청·예상 결과

404와 {"error":"not_found"}

## 주의사항

오류를 200으로 감추지 마세요. 내부 스택이나 DB 비밀 정보를 응답에 노출하지 않습니다.

## 연습

400과 405도 일관된 형식으로 처리하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
