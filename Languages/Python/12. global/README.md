# global과 이름 검색

## 핵심 개념

함수 안에서 모듈 수준 이름에 재대입할 때 global을 선언합니다.

## 실행 예제

```python
count = 0
def increment():
    global count
    count += 1

increment()
print(count)
```

## 실행 결과

```text
1
```

## 동작 원리와 주의사항

키워드는 소문자 `global`입니다. 일반적인 이름 검색은 지역 → 바깥 함수 → 모듈 전역 → 내장 범위 순서입니다. 함수 안에 대입이 있으면 기본적으로 지역 이름이 되어 대입 전 읽기에서 UnboundLocalError가 날 수 있습니다. 전역 상태보다 인수와 반환값으로 의존성을 표현하면 테스트가 쉽습니다.

## 직접 확인하기

전역 변수 없이 현재 값을 받아 1을 더해 반환하는 함수로 바꾸세요.

---

[언어 목차](../README.md) · [이전](../11.%20nonlocal/README.md) · [다음](../13.%20class/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
