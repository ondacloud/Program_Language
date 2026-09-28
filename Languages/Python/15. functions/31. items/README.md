# dict.items

## 핵심 개념

키와 값 쌍을 제공하는 동적 view입니다.

## 실행 예제

```python
scores = {"a": 1, "b": 2}
for key, value in scores.items():
    print(key, value)
```

## 실행 결과

```text
a 1
b 2
```

## 동작 원리와 주의사항

dict는 삽입 순서를 유지합니다. 순회 중 키를 추가·삭제하면 RuntimeError가 날 수 있습니다. 고정된 목록은 list(d.items())로 만듭니다.

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
