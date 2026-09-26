# 이터레이터와 제너레이터

## 핵심 개념

iterable에서 iter()로 iterator를 얻고 next()로 값을 꺼냅니다. yield를 가진 함수는 generator를 만듭니다.

## 실행 예제

```python
def countdown(start):
    while start > 0:
        yield start
        start -= 1

values = countdown(3)
print(next(values))
print(list(values))
print(list(values))
```

## 실행 결과

```text
3
[2, 1]
[]
```

## 동작 원리와 주의사항

yield는 상태를 보존하고 실행을 잠시 멈춥니다. 끝난 iterator의 next는 StopIteration을 발생시키며 for는 이를 처리합니다. 큰 데이터를 순차 처리할 때 전체 목록을 만들지 않아도 됩니다.

## 직접 확인하기

next(values, "done")을 마지막에 호출하세요. 기본값 done이 반환됩니다.

---

[언어 목차](../README.md) · [이전](../18.%20comprehension/README.md) · [다음](../20.%20module%20venv/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
