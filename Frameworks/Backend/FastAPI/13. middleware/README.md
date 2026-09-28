# middleware

## 개념과 사용 시점

middleware는 요청을 감싸 공통 헤더·시간 측정 등을 수행합니다. await call_next로 다음 처리를 호출합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "13. middleware/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8000/"
```

## 코드 읽기

```python
from fastapi import FastAPI, HTTPException
from fastapi import Request
app = FastAPI()

@app.middleware("http")
async def course_header(request: Request, call_next):
    response = await call_next(request)
    response.headers["X-Course"] = "FastAPI"
    return response

@app.get("/")
def index():
    return {"ok": True}
```

[실행 파일](app.py)

## 요청·예상 결과

ok=true와 X-Course 헤더

## 주의사항

CORS는 브라우저 출처 정책이며 인증 수단이 아닙니다. 쿠키 인증과 허용 출처는 따로 설계하세요.

## 연습

처리 시간을 응답 헤더에 추가하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
