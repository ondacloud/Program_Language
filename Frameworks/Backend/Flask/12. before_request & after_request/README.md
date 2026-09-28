# before_request & after_request

## 개념과 사용 시점

요청 전후 공통 처리를 훅으로 분리합니다. g는 현재 요청 처리에서 공유할 임시 데이터를 보관합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "12. before_request & after_request/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:5000/"
```

## 코드 읽기

```python
from flask import Flask, request, jsonify, abort
from flask import g
app = Flask(__name__)

@app.before_request
def begin():
    g.label = "course"

@app.after_request
def finish(response):
    response.headers["X-Course"] = g.label
    return response

@app.get("/")
def index():
    return {"ok": True}
```

[실행 파일](app.py)

## 요청·예상 결과

응답 JSON ok=true와 X-Course: course 헤더

## 주의사항

g는 전역 영구 저장소가 아닙니다. 응답 후 상태가 다음 요청으로 유지된다고 가정하지 마세요.

## 연습

처리 시간을 perf_counter로 측정하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
