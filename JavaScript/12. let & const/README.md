# let, const, 타입

## 핵심 개념

const는 이름의 재대입을 제한하고 let은 재대입을 허용합니다. 객체 내부 변경까지 막는 것은 아닙니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
const user = { name: "Alice" };
user.name = "Bob";
let count = 1;
count += 1;
console.log(user.name, count);
console.log(typeof null, typeof undefined);
console.log(Number.isNaN(Number("abc")));
```

## 예상 결과

```text
Bob 2
object undefined
true
```

## 동작 원리와 주의사항

원시 타입은 string, number, bigint, boolean, undefined, symbol, null입니다. typeof null이 object인 것은 역사적 동작입니다. let/const는 블록 범위이며 선언 전 접근은 오류입니다. const를 기본으로 쓰고 재대입이 필요한 곳에 let을 씁니다. Number 정수 정밀도 범위는 Number.MAX_SAFE_INTEGER를 확인하세요.

## 직접 확인하기

user 자체를 새 객체로 대입하면 왜 오류인지 설명하세요.

---

---

---

[전체 목차](../README.md) · [이전](../11.%20Array/README.md) · [다음](../13.%20Number%20%26%20Boolean%20%26%20typeof/README.md)
