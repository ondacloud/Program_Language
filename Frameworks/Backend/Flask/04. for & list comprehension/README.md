# for & list comprehension

## 개념과 사용 시점

여러 데이터로 응답 목록을 만들 때 Python 반복이나 컴프리헨션을 사용합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "04. for & list comprehension/app.py"
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
    scores = [60, 80, 90]
    return {"passed": [score for score in scores if score >= 70]}
```

[실행 파일](app.py)

## 요청·예상 결과

passed는 [80,90]

## 주의사항

큰 목록을 한 응답에 무제한으로 담지 말고 페이지 크기를 제한하세요.

## 연습

점수 합계와 인원 수를 추가하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
