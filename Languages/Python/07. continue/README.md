# continue — 현재 반복 건너뛰기

## 핵심 개념

남은 본문을 생략하고 다음 반복으로 이동합니다.

## 실행 예제

```python
for number in range(1, 5):
    if number % 2 == 0:
        continue
    print(number)
```

## 실행 결과

```text
1
3
```

## 동작 원리와 주의사항

continue는 반복 전체를 끝내지 않습니다. while에서는 갱신 코드를 건너뛰어 무한 반복에 빠지지 않도록 조심합니다.

## 직접 확인하기

홀수를 건너뛰고 짝수만 출력하세요.

---

[언어 목차](../README.md) · [이전](../06.%20break/README.md) · [다음](../08.%20function/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
