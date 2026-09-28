# session

## 개념과 사용 시점

기본 Flask 세션은 서명된 쿠키에 저장됩니다. 암호화 저장과 다르며 클라이언트가 내용 자체를 읽을 수 있습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "14. session/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:5000/"
```

## 코드 읽기

```python
from flask import Flask, request, jsonify, abort
import secrets
from flask import session
app = Flask(__name__)

app.config.update(SECRET_KEY=secrets.token_hex(32), SESSION_COOKIE_HTTPONLY=True, SESSION_COOKIE_SAMESITE="Lax")

@app.post("/")
def count():
    session["count"] = session.get("count", 0) + 1
    return {"count": session["count"]}
```

[실행 파일](app.py)

## 요청·예상 결과

같은 쿠키로 POST하면 1, 2 순으로 증가합니다. GET은 405입니다.

## 주의사항

예제 키는 실행마다 바뀝니다. 실제 서비스는 비밀 관리로 안정된 키를 공급하고 HTTPS·CSRF 방어를 구성하세요. 인증 예제는 아닙니다.

## 연습

쿠키를 지우고 다시 요청하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
