# for & list comprehension

## 개념과 사용 시점

Python 반복으로 응답 자료를 만들고 API 응답으로 전달합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "04. for & list comprehension/app.py"
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
    return {"passed": [s for s in [60, 80, 90] if s >= 70]}
```

[실행 파일](app.py)

## 요청·예상 결과

passed=[80,90]

## 주의사항

큰 데이터의 전체 조회 대신 제한된 페이지를 반환하세요.

## 연습

정렬 옵션을 허용 목록으로 검증하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
