# list.reverse

## 핵심 개념

리스트 자체의 원소 순서를 뒤집습니다.

## 실행 예제

```python
values = [1, 2, 3]
print(values.reverse())
print(values)
```

## 실행 결과

```text
None
[3, 2, 1]
```

## 동작 원리와 주의사항

새 리스트를 반환하지 않습니다. 원본 보존이 필요하면 values[::-1] 또는 list(reversed(values))를 사용합니다.

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
