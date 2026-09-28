# 동등성, null 병합, 단락 평가

## 핵심 개념

===는 타입 변환 없는 동등 비교이고 ??는 null 또는 undefined일 때만 기본값을 선택합니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
console.log(0 === "0");
console.log(0 || 10, 0 ?? 10);
const user = null;
console.log(user?.name ?? "guest");
console.log(Boolean([]), Boolean(""));
```

## 예상 결과

```text
false
10 0
guest
true false
```

## 동작 원리와 주의사항

==는 타입 강제 변환이 있어 예상하기 어려울 수 있습니다. ||와 &&는 bool만이 아니라 선택한 피연산자를 반환합니다. 빈 배열·빈 객체는 truthy입니다. ?.는 nullish에서 접근을 멈추며 선언되지 않은 식별자 참조까지 안전하게 만들지는 않습니다. 객체끼리 ===는 구조가 아니라 참조를 비교합니다.

## 직접 확인하기

기본값 10을 주되 0은 유지하려면 ||와 ?? 중 무엇을 써야 할까요?

---

---

---

[전체 목차](../README.md) · [이전](../14.%20comparison%20%26%20logical%20operator/README.md) · [다음](../16.%20bitwise%20operator%20%26%20BigInt/README.md)
