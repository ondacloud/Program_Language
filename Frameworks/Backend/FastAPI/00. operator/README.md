# operator

## 개념과 사용 시점

경로 함수 안의 계산은 Python 연산자입니다. 반환한 dict는 JSON 응답으로 직렬화됩니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "00. operator/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8000/"
```

## 코드 읽기

```python
from fastapi import FastAPI, HTTPException

app = FastAPI()

@app.get("/")
def index():
    return {"sum": 7 + 2, "passed": 80 >= 70}
```

[실행 파일](app.py)

## 요청·예상 결과

sum=9, passed=true

## 주의사항

응답 값은 JSON으로 표현 가능한 구조여야 합니다.

## 연습

나눗셈 결과를 추가하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
