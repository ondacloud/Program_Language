# input

## 핵심 개념

한 줄을 읽어 끝의 줄바꿈을 뺀 str을 반환합니다.

## 실행 예제

```python
text = input("Number: ")
print(text + text)
print(int(text) + int(text))
```

## 실행 결과

```text
입력 12 → 프롬프트 Number: 뒤 결과 1212, 24
```

## 동작 원리와 주의사항

입력은 항상 문자열입니다. 숫자 변환은 ValueError를 처리하세요. 입력 종료 시 EOFError가 발생할 수 있습니다.

## 직접 확인하기

예제의 입력을 빈 값 또는 중복 값으로 바꾸어 반환값과 원본 변경 여부를 확인하세요.

---

[언어 목차](../../README.md) · [상위 주제](../README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py) · [input.txt](input.txt)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.

입력을 요청하면 아래 내용을 순서대로 입력하세요. 같은 내용의 input.txt도 제공합니다.

```text
12
```
