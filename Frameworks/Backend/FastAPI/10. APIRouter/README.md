# APIRouter

## 개념과 사용 시점

관련 경로를 APIRouter에 묶어 접두사·태그와 함께 앱에 등록합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "10. APIRouter/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8000/api/students"
```

## 코드 읽기

```python
from fastapi import FastAPI, HTTPException
from fastapi import APIRouter
app = FastAPI()

router = APIRouter(prefix="/api", tags=["students"])

@router.get("/students")
def students():
    return {"students": ["Mina"]}

app.include_router(router)
```

[실행 파일](app.py)

## 요청·예상 결과

/api/students의 학생 목록; /docs에도 그룹 표시

## 주의사항

라우터 파일 분리 시 순환 import를 피하세요. 앱 생성과 라우터 선언의 방향을 일관되게 유지합니다.

## 연습

/api/v1 접두사를 적용하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
