# set.add

## 핵심 개념

집합에 hashable 원소 하나를 추가합니다.

## 실행 예제

```python
values = {1, 2}
result = values.add(2)
values.add(3)
print(sorted(values), result)
```

## 실행 결과

```text
[1, 2, 3] None
```

## 동작 원리와 주의사항

원본을 바꾸고 None을 반환합니다. 중복 원소는 늘어나지 않습니다. list처럼 hash 불가능한 값을 넣으면 TypeError입니다. set 출력 순서는 보장하지 않습니다.

## 직접 확인하기

예제의 입력을 빈 값 또는 중복 값으로 바꾸어 반환값과 원본 변경 여부를 확인하세요.

---

[언어 목차](../../README.md) · [상위 주제](../README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
