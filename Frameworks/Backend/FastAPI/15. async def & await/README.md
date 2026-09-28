# async def & await

## 개념과 사용 시점

비동기 라이브러리의 I/O는 async def 안에서 await로 기다립니다. 동기 블로킹 작업과 구분해야 합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "15. async def & await/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8000/"
```

## 코드 읽기

```python
from fastapi import FastAPI, HTTPException
import asyncio
app = FastAPI()

@app.get("/")
async def index():
    await asyncio.sleep(0.01)
    return {"message": "done"}
```

[실행 파일](app.py)

## 요청·예상 결과

잠시 뒤 message=done

## 주의사항

async 경로에서 time.sleep이나 블로킹 DB 드라이버를 직접 호출하면 이벤트 루프가 막힙니다. CPU 병렬 처리와 async는 다릅니다.

## 연습

독립된 두 비동기 작업을 gather로 기다리세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
