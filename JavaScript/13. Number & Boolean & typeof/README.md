# 리터럴·타입 변환·스코프

## 핵심 개념

리터럴은 코드에 직접 쓴 값입니다. let과 const는 블록 스코프이며 문자열 입력은 목적에 맞게 변환해야 합니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
const raw = "12";
const value = Number(raw);
console.log(typeof raw, typeof value, value + 1);
console.log(Number(""), Number.isNaN(Number("bad")));
console.log(Boolean("false"), Boolean(0));
let name = "outer";
{ const name = "inner"; console.log(name); }
console.log(name);
```

## 예상 결과

```text
string number 13
0 true
true false
inner
outer
```

## 동작 원리와 주의사항

Boolean("false")는 비어 있지 않은 문자열이므로 true입니다. const는 재대입을 막지만 객체 속성 변경까지 막지 않습니다. 선언 전 let·const 접근은 오류입니다. var는 함수 스코프여서 차이를 알고 사용해야 합니다. // 한 줄과 /* 여러 줄 */ 주석으로 설명을 남깁니다.



## 직접 확인하기

공백만 있는 입력을 먼저 거부하는 숫자 변환 함수를 작성하세요. undefined·null·빈 문자열의 차이를 설명하세요.

---

---

---

[전체 목차](../README.md) · [이전](../12.%20let%20%26%20const/README.md) · [다음](../14.%20comparison%20%26%20logical%20operator/README.md)
