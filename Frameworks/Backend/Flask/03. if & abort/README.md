# if & abort

## 개념과 사용 시점

if로 조건을 검사하고 abort로 적절한 오류 응답을 발생시킵니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "03. if & abort/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:5000/?score=80"
```

## 코드 읽기

```python
from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.get("/")
def index():
    score = request.args.get("score", type=int)
    if score is None or not 0 <= score <= 100:
        abort(400, description="score must be 0..100")
    return {"result": "pass" if score >= 70 else "retry"}
```

[실행 파일](app.py)

## 요청·예상 결과

/?score=80은 pass, abc·101·누락은 400

## 주의사항

기본 오류 응답은 HTML입니다. API의 JSON 오류 형식은 errorhandler 장에서 통일합니다.

## 연습

경계값 0·70·100을 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
