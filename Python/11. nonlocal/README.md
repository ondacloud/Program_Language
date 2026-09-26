# nonlocal과 클로저

## 핵심 개념

중첩 함수에서 가장 가까운 바깥 함수 범위의 기존 이름을 재바인딩합니다.

## 실행 예제

```python
def make_counter():
    count = 0
    def next_count():
        nonlocal count
        count += 1
        return count
    return next_count

counter = make_counter()
print(counter(), counter())
```

## 실행 결과

```text
1 2
```

## 동작 원리와 주의사항

nonlocal 대상은 바깥 함수에 이미 있어야 합니다. 모듈 전역 이름을 대상으로 하지 않습니다. 읽기만 하거나 참조한 리스트의 원소를 바꾸는 경우와 이름 자체를 재대입하는 경우를 구분하세요.

## 직접 확인하기

make_counter를 다시 호출해 만든 두 번째 카운터의 첫 값이 1인지 확인하세요.

---

[언어 목차](../README.md) · [이전](../10.%20lambda/README.md) · [다음](../12.%20global/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
