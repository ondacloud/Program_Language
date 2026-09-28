# 얕은 복사 — copy

## 핵심 개념

바깥 컨테이너만 새로 만들고 내부 원소의 참조를 복사합니다.

## 실행 예제

```python
original = [[1]]
copied = original.copy()
copied[0].append(2)
print(original)
print(original is copied)
```

## 실행 결과

```text
[[1, 2]]
False
```

## 동작 원리와 주의사항

중첩 리스트는 공유합니다. 완전히 독립적인 중첩 상태가 필요하면 copy.deepcopy를 검토하되 객체별 복사 의미를 확인하세요.

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
