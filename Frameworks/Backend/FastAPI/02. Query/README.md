# Query

## 개념과 사용 시점

Query로 쿼리 매개변수의 기본값과 제약을 선언합니다. 타입 변환 실패는 검증 오류 응답으로 처리됩니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "02. Query/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8000/?limit=5"
```

## 코드 읽기

```python
from fastapi import FastAPI, HTTPException
from typing import Annotated
from fastapi import Query
app = FastAPI()

@app.get("/")
def index(limit: Annotated[int, Query(ge=1, le=100)] = 10):
    return {"limit": limit}
```

[실행 파일](app.py)

## 요청·예상 결과

/?limit=5는 5, 0·abc는 422

## 주의사항

사용자 입력 검증과 업무 규칙 검증은 함께 필요합니다.

## 연습

검색어 길이를 제한하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
