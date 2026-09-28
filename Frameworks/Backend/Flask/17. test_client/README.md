# test_client

## 개념과 사용 시점

실제 포트를 열지 않고 HTTP 요청·상태·응답을 검사할 수 있습니다. 쿠키와 앱 상태 범위도 테스트합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "17. test_client/app.py"
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
    return {"message": "hello"}

def test_response():
    with app.test_client() as client:
        response = client.get("/")
        assert response.status_code == 200
        assert response.json == {"message": "hello"}
```

[실행 파일](app.py)

## 요청·예상 결과

서버 GET은 hello. 테스트는 과정 루트에서 python verify.py로 전체 실행합니다.

## 주의사항

테스트 클라이언트 성공만으로 실제 프록시·TLS·운영 서버 배포 검증이 끝나는 것은 아닙니다.

## 연습

없는 경로의 404 검사를 추가하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
