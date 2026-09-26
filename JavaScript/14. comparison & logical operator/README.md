# 비교·논리·조건 연산자

## 핵심 개념

비교식은 boolean을 만들고 논리 연산자는 조건을 결합합니다. 조건 연산자는 두 값 중 하나를 선택합니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
const age = 20;
console.log(age >= 19, age < 65, age !== 20);
console.log(age >= 19 && age < 65, age < 0 || age > 120, !(age < 19));
console.log(age >= 19 ? "adult" : "minor");
console.log(0 == false, 0 === false);
console.log(null ?? "fallback", "" || "fallback");
```

## 예상 결과

```text
true true false
true false true
adult
true false
fallback fallback
```

## 동작 원리와 주의사항

===와 !==는 타입 변환 없는 비교입니다. &&와 ||는 단락 평가하며 실제 피연산자 값을 반환합니다. ??는 null·undefined만 대체합니다. ??를 && 또는 ||와 섞을 때 괄호가 필요합니다. 객체의 ===는 내용이 아니라 동일 참조인지 검사합니다.

## 문법 한눈에 보기

| 분류 | 문법 |
|---|---|
| 비교 | `=== !== > >= < <=` |
| 논리 | `&& || !` |
| 선택 | `조건 ? 참값 : 거짓값` |
| 기본값 | `??`와 `||`의 조건 차이 확인 |

## 직접 확인하기

나이 18·19·65의 결과를 예측하세요. 0을 보존하는 기본값과 빈 문자열도 대체하는 기본값을 각각 작성하세요.

---

---

---

[전체 목차](../README.md) · [이전](../13.%20Number%20%26%20Boolean%20%26%20typeof/README.md) · [다음](../15.%20optional%20chaining%20%26%20nullish%20coalescing/README.md)
