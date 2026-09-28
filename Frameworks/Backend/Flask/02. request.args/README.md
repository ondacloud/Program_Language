# request.args

## 개념과 사용 시점

URL 쿼리 문자열은 request.args에서 읽습니다. 기본값과 빈 문자열 정책을 정합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "02. request.args/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:5000/?name=Mina"
```

## 코드 읽기

```python
from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.get("/")
def index():
    name = request.args.get("name", "guest").strip() or "guest"
    return {"name": name}
```

[실행 파일](app.py)

## 요청·예상 결과

/?name=Mina → {"name":"Mina"}; 누락 시 guest

## 주의사항

외부 입력은 신뢰하지 않습니다. 숫자 입력은 변환 오류와 범위를 검사하세요.

## 연습

page를 양의 정수로 검증하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
