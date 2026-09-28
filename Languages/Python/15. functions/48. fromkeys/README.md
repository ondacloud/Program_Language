# dict.fromkeys

## 핵심 개념

여러 키에 같은 기본값을 갖는 새 dict를 만듭니다.

## 실행 예제

```python
keys = ["a", "b"]
shared = dict.fromkeys(keys, [])
shared["a"].append(1)
print(shared)
independent = {key: [] for key in keys}
independent["a"].append(1)
print(independent)
```

## 실행 결과

```text
{'a': [1], 'b': [1]}
{'a': [1], 'b': []}
```

## 동작 원리와 주의사항

기본값 객체를 모든 키가 공유합니다. 독립적인 가변 값이 필요하면 컴프리헨션을 사용합니다. 기본값을 생략하면 None입니다.

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
