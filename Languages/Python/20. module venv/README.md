# 모듈, 패키지, 가상 환경

## 모듈 나누기

`calc.py`:

```python
def add(a, b):
    return a + b
```

같은 폴더의 `main.py`:

```python
from calc import add

def main():
    print(add(2, 3))

if __name__ == "__main__":
    main()
```

`python main.py`의 결과는 `5`입니다. main 보호 구문은 import할 때 실행 진입 코드가 자동 실행되는 것을 막습니다. import도 모듈의 최상위 코드를 실행하므로 부작용을 줄이세요.

## 패키지와 환경

일반 패키지는 폴더에 `__init__.py`를 두어 구성합니다. namespace package처럼 예외도 있습니다. `json.py`, `typing.py`처럼 표준 라이브러리를 가리는 파일명은 피하세요.

Windows PowerShell에서 프로젝트별 환경을 만들고 활성화 없이 해당 인터프리터를 사용할 수 있습니다.

```powershell
python -m venv .venv
.\.venv\Scripts\python.exe --version
.\.venv\Scripts\python.exe -m pip --version
```

Linux/macOS에서는 `.venv/bin/python` 경로를 사용합니다. 패키지 설치는 해당 환경의 `python -m pip install 패키지명`으로 수행합니다. `.venv`는 Git에 올리지 않습니다. 의존성은 프로젝트의 `pyproject.toml`과 사용하는 도구의 잠금 파일 등으로 관리하세요.

## 직접 확인하기

`python -c "import main"`을 실행했을 때 5가 출력되지 않는지 확인하세요. 모듈을 불러오는 일과 프로그램 실행을 분리한 효과입니다.

---

[언어 목차](../README.md) · [이전](../19.%20iterator%20generator/README.md) · [다음](../21.%20typing%20dataclass/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[calc.py](calc.py) · [main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
