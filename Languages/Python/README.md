# Python 학습 가이드

문법을 읽고 직접 실행하면서 동작 원리와 실패 조건을 확인하는 한국어 학습 노트입니다. 기본 설명 기준은 **Python 3.10 이상**입니다. 이는 최신 버전이라는 뜻이 아니라 예제의 학습 기준입니다.

## 권장 학습 순서

자료형·입출력 → 조건·반복 → 함수·리스트 → dict·tuple·set → 예외·파일·클래스 → 모듈·컴프리헨션·제너레이터 → 타입 힌트·테스트

폴더 번호는 기존 경로를 유지하기 위한 번호입니다. 새로 보강된 기초 주제는 뒤 번호에 있어도 위 순서에 맞춰 함께 읽으세요. 각 문서는 독립적인 예제이므로 같은 이름의 클래스나 함수를 한 파일에 모두 붙이지 않습니다.

## 첫 프로그램 실행

`main.py` 파일에 저장하세요.

```python
print("Hello Python")
```

```sh
python main.py
```

`python --version`을 확인하세요. `match`와 `T | None` 표기는 3.10 이상이 필요합니다. 프로젝트별 가상 환경은 모듈·가상 환경 문서를 참고하세요.

## 문서 읽는 방법

1. 핵심 개념을 읽고 실행 결과를 먼저 예상합니다.
2. 예제를 실행하고 출력과 원본 데이터 변경을 관찰합니다.
3. 빈 값, 경계값, 잘못된 입력도 시도합니다.
4. 직접 확인하기 문제로 코드를 바꿔 봅니다.

전체 프로그램과 부분 예제를 구별하세요. 부분 예제는 해당 설명에 나온 위치에 넣고, 다중 파일 예제는 파일별로 저장합니다. 주소·스레드 순서·현재 시간 등은 실행마다 다를 수 있습니다.

## 전체 목차

| 번호 | 주제 |
|---|---|
| 00 | [자료형과 연산자](00.%20operator/README.md) |
| 01 | [출력 — print와 문자열 서식](01.%20print/README.md) |
| 02 | [조건문 — if / elif / else](02.%20if/README.md) |
| 03 | [패턴 매칭 — match / case](03.%20match%20%26%20case/README.md) |
| 04 | [for — 순회](04.%20for/README.md) |
| 05 | [while — 조건 반복](05.%20while/README.md) |
| 06 | [break와 반복문의 else](06.%20break/README.md) |
| 07 | [continue — 현재 반복 건너뛰기](07.%20continue/README.md) |
| 08 | [함수 — 인수, 반환값, 기본값](08.%20function/README.md) |
| 09 | [리스트 — 인덱스, 슬라이싱, 복사](09.%20list/README.md) |
| 10 | [lambda — 짧은 함수 표현식](10.%20lambda/README.md) |
| 11 | [nonlocal과 클로저](11.%20nonlocal/README.md) |
| 12 | [global과 이름 검색](12.%20global/README.md) |
| 13 | [클래스 — 인스턴스와 상태](13.%20class/README.md) |
| 14 | [예외 — try / except / else / finally](14.%20try/README.md) |
| 15 | [함수·메서드·문법 빠른 찾기](15.%20functions/README.md) |
| 16 | [파일 — with, 인코딩, 모드](16.%20open%20file/README.md) |
| 17 | [dict, tuple, set 선택](17.%20dict%20tuple%20set/README.md) |
| 18 | [컴프리헨션](18.%20comprehension/README.md) |
| 19 | [이터레이터와 제너레이터](19.%20iterator%20generator/README.md) |
| 20 | [모듈, 패키지, 가상 환경](20.%20module%20venv/README.md) |
| 21 | [타입 힌트와 dataclass](21.%20typing%20dataclass/README.md) |
| 22 | [데코레이터와 컨텍스트 매니저](22.%20decorator%20context%20manager/README.md) |
| 23 | [표준 라이브러리로 테스트하기](23.%20testing/README.md) |
| 24 | [JSON과 pathlib](24.%20json%20pathlib/README.md) |

## 공식 참고 자료

- [공식 튜토리얼](https://docs.python.org/3/tutorial/)
- [내장 함수](https://docs.python.org/3/library/functions.html)
- [내장 타입](https://docs.python.org/3/library/stdtypes.html)
- [제어 흐름](https://docs.python.org/3/tutorial/controlflow.html)

[전체 언어 가이드](../../README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.

## 동봉 파일 안내

각 주제 문서의 **동봉 실행 파일과 실행 방법**에서 소스 파일과 실행 명령을 확인하세요. 각 주제 문서의 실행 방법을 확인하세요.
