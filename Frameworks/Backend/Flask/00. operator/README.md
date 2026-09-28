# operator

## 개념과 사용 시점

응답을 만들기 전 계산은 Python 연산자로 처리합니다. HTTP 응답에 담는 값과 서버 내부의 계산을 구분합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "00. operator/app.py"
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
    return {"sum": 7 + 2, "division": 7 / 2, "passed": 80 >= 70}
```

[실행 파일](app.py)

## 요청·예상 결과

{"sum":9,"division":3.5,"passed":true}

## 주의사항

JSON의 true·false는 Python의 True·False와 표기가 다릅니다.

## 연습

나머지 연산 결과를 추가하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
