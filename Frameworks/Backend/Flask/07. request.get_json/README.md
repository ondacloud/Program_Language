# request.get_json

## 개념과 사용 시점

JSON 요청 본문을 읽고 객체·필드 타입을 명시적으로 검증합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "07. request.get_json/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:5000/"
```

## 코드 읽기

```python
from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.post("/")
def create():
    data = request.get_json()
    if not isinstance(data, dict) or not isinstance(data.get("name"), str) or not data["name"].strip():
        abort(400, description="name required")
    return {"name": data["name"].strip()}, 201
```

[실행 파일](app.py)

## 요청·예상 결과

POST JSON {"name":"Mina"} → 201. PowerShell:
```powershell
Invoke-RestMethod http://127.0.0.1:5000/ -Method Post -ContentType application/json -Body '{"name":"Mina"}'
```
GET은 405입니다.

## 주의사항

Content-Type이 JSON이 아니거나 문법이 잘못된 본문도 오류입니다. 배열·null도 검증하세요.

## 연습

이름 길이를 30자로 제한하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
