# url_for & redirect

## 개념과 사용 시점

url_for는 endpoint 이름으로 URL을 만들고 redirect는 이동 응답을 반환합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "10. url_for & redirect/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:5000/"
```

## 코드 읽기

```python
from flask import Flask, request, jsonify, abort
from flask import url_for, redirect
app = Flask(__name__)

@app.get("/")
def index():
    return redirect(url_for("hello", name="Mina"))

@app.get("/hello")
def hello():
    return {"name": request.args.get("name")}
```

[실행 파일](app.py)

## 요청·예상 결과

/는 302와 Location 헤더, 이동 목적지는 /hello?name=Mina

## 주의사항

사용자 입력을 검증 없이 외부 redirect 목적지로 쓰지 마세요.

## 연습

POST 후 303 redirect를 구성해 보세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
