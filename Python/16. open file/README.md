# 파일 — with, 인코딩, 모드

## 핵심 개념

with 블록을 사용하면 블록을 벗어날 때 파일을 닫습니다. 텍스트 파일에는 인코딩을 명시합니다.

## 실행 예제

```python
from tempfile import TemporaryDirectory
from pathlib import Path

with TemporaryDirectory() as directory:
    path = Path(directory) / "example.txt"
    with open(path, "w", encoding="utf-8") as file:
        file.write("Hello Python\n")
    with open(path, "r", encoding="utf-8") as file:
        print(file.read(), end="")
```

## 실행 결과

```text
Hello Python
```

## 동작 원리와 주의사항

예제는 임시 폴더에서 실행되어 기존 파일을 덮어쓰지 않습니다. `open`의 세 번째 위치 인수는 encoding이 아니라 buffering입니다. `encoding="utf-8"`처럼 키워드로 쓰세요. 큰 파일은 `for line in file`로 순회하면 전체 내용을 메모리에 올리지 않아도 됩니다.

## 모드 비교

| 모드 | 동작 |
|---|---|
| `r` | 읽기, 파일이 없으면 FileNotFoundError |
| `w` | 쓰기, 생성 또는 기존 내용 삭제 |
| `a` | 끝에 추가, 없으면 생성 |
| `x` | 새로 생성, 이미 있으면 FileExistsError |
| `rb`, `wb` | bytes를 읽고 쓰는 바이너리 모드 |
| `r+` | 기존 파일 읽기·쓰기, 현재 위치 주의 |

바이너리 모드에서는 encoding을 지정하지 않습니다. with의 역할은 파일 자원의 확실한 해제이며 메모리 관리 일반을 대신하는 것은 아닙니다.

## 직접 확인하기

쓰기 모드를 a로 바꾸고 두 번 쓰면 내용이 추가되는지 확인하세요.

---

[언어 목차](../README.md) · [이전](../15.%20functions/README.md) · [다음](../17.%20dict%20tuple%20set/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
