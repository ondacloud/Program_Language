# jsonify & return

## 개념과 사용 시점

뷰 함수의 반환값은 HTTP 응답으로 변환됩니다. jsonify로 JSON 응답을 명시적으로 만들고 상태 코드를 함께 반환할 수 있습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "01. jsonify & return/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:5000/"
```

## 코드 읽기

```python
from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.get("/")
def index():
    return jsonify(message="hello"), 200
```

[실행 파일](app.py)

## 요청·예상 결과

200과 JSON message=hello

## 주의사항

print는 서버 로그에 남을 뿐 클라이언트 응답이 아닙니다.

## 연습

201과 새 리소스 정보를 반환해 보세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
