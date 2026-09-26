# JSON과 pathlib

## 핵심 개념

JSON은 데이터 교환 형식이고 pathlib는 경로를 객체로 다룹니다.

## 실행 예제

```python
import json
from pathlib import Path
from tempfile import TemporaryDirectory

data = {"name": "Alice", "scores": [80, 90]}
with TemporaryDirectory() as directory:
    path = Path(directory) / "data.json"
    path.write_text(json.dumps(data, ensure_ascii=False, indent=2), encoding="utf-8")
    restored = json.loads(path.read_text(encoding="utf-8"))
    print(restored["name"], sum(restored["scores"]))
```

## 실행 결과

```text
Alice 170
```

## 동작 원리와 주의사항

loads/dumps는 문자열, load/dump는 파일 객체를 다룹니다. JSON 객체 키는 문자열입니다. 문법 오류는 JSONDecodeError이며 유효한 JSON이어도 필요한 키와 타입은 직접 검증해야 합니다. 외부 데이터를 eval로 읽지 마세요.

## 직접 확인하기

scores 키가 없거나 숫자 대신 문자열이 들어오는 경우를 검증하세요.

---

[언어 목차](../README.md) · [이전](../23.%20testing/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
