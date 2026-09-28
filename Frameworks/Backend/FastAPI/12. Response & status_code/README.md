# Response & status_code

## 개념과 사용 시점

상태 코드·헤더를 명시하고 반환 데이터를 응답 모델과 함께 사용할 수 있습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "12. Response & status_code/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8000/"
```

## 코드 읽기

```python
from fastapi import FastAPI, HTTPException
from fastapi import Response
app = FastAPI()

@app.post("/", status_code=201)
def create(response: Response):
    response.headers["Location"] = "/students/1"
    return {"id": 1}
```

[실행 파일](app.py)

## 요청·예상 결과

POST는 201, Location: /students/1, id=1. GET은 405

## 주의사항

예제는 응답 형식만 보여 주며 실제 영구 저장을 하지 않습니다. 상태 코드의 의미와 실제 동작을 맞추세요.

## 연습

조회 경로를 추가하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
