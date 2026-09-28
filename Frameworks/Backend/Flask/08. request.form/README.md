# request.form

## 개념과 사용 시점

HTML 폼의 URL-encoded 입력은 request.form으로 읽습니다. JSON 본문과 구분합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "08. request.form/app.py"
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
def form():
    if request.method == "POST":
        return {"name": request.form.get("name", "guest")}
    return '<form method="post"><label>Name <input name="name"></label><button>Send</button></form>'
```

[실행 파일](app.py)

## 요청·예상 결과

브라우저에서 이름을 입력하고 Send를 누르면 JSON 이름을 반환합니다.

## 주의사항

상태를 변경하는 실제 폼에는 CSRF 방어를 구성하세요. name 속성이 전송 필드 이름입니다.

## 연습

빈 값을 검증하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
