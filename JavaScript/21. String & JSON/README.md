# 문자열, 숫자 변환, JSON

## 핵심 개념

문자열은 불변이며 JSON은 데이터 교환 형식입니다. 파싱과 데이터 유효성 검증을 구별합니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
const text = "  Alice  ";
console.log(text.trim().toUpperCase());
console.log(Number("12"), Number.isFinite(Number("x")));
const parsed = JSON.parse('{"name":"Alice","score":90}');
console.log(`${parsed.name}:${parsed.score}`);
console.log("😀".length);
```

## 예상 결과

```text
ALICE
12 false
Alice:90
2
```

## 동작 원리와 주의사항

문자열 length는 UTF-16 코드 단위 수입니다. 코드 포인트 순회는 for...of 등을 사용하고 화면 글자 묶음은 별도 문제입니다. JSON.parse는 잘못된 문법에 SyntaxError를 던지지만 필요한 키·범위는 검증하지 않습니다. Number("")는 0이므로 빈 입력을 먼저 구분하세요.

## 직접 확인하기

score가 문자열 또는 누락일 때 거부하도록 검사하세요.

---

---

---

[전체 목차](../README.md) · [이전](../20.%20Map%20%26%20Set/README.md) · [다음](../22.%20this%20%26%20class/README.md)
