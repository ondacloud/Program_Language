# Path

## 개념과 사용 시점

경로 매개변수는 URL의 일부를 파싱합니다. Path로 숫자 범위와 설명을 선언할 수 있습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "05. Path/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8000/students/3"
```

## 코드 읽기

```python
from fastapi import FastAPI, HTTPException
from typing import Annotated
from fastapi import Path
app = FastAPI()

@app.get("/students/{student_id}")
def student(student_id: Annotated[int, Path(gt=0)]):
    return {"id": student_id}
```

[실행 파일](app.py)

## 요청·예상 결과

/students/3은 id=3, abc·0은 422

## 주의사항

Flask converter의 경로 미일치 404와 FastAPI의 입력 검증 422를 구분하세요.

## 연습

DB에 없는 양의 ID는 404로 처리하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
