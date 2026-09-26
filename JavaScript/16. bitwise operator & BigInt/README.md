# 비트 연산과 숫자 표현

## 핵심 개념

비트 연산은 숫자를 비트 단위로 조합합니다. 일반 산술 연산과 변환 규칙이 다릅니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
console.log(5 & 3, 5 | 3, 5 ^ 3, ~5);
console.log(5 << 1, 5 >> 1, -1 >>> 1);
console.log(7n / 2n, 1n << 4n);
console.log(Number.isSafeInteger(9007199254740992));
```

## 예상 결과

```text
1 7 6 -6
10 2 2147483647
3n 16n
false
```

## 동작 원리와 주의사항

Number 비트 연산은 보통 32비트 정수 표현을 사용하고 >>> 결과는 부호 없는 값입니다. 이를 일반적인 큰 정수 절삭 도구로 쓰지 마세요. BigInt는 정수 계산용이며 Number와 산술식에서 직접 혼합할 수 없습니다. BigInt에는 >>>가 없습니다.

## 문법 한눈에 보기

| 연산 | 문법 |
|---|---|
| AND·OR·XOR·NOT | `&` · `|` · `^` · `~` |
| 이동 | `<< >> >>>` |
| 큰 정수 리터럴 | `123n` |

## 직접 확인하기

읽기 1·쓰기 2·실행 4 플래그를 OR로 합치고 AND로 권한 포함 여부를 검사하세요.

---

---

---

[전체 목차](../README.md) · [이전](../15.%20optional%20chaining%20%26%20nullish%20coalescing/README.md) · [다음](../17.%20for%20of%20%26%20switch/README.md)
