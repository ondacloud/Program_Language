# 함수·매개변수·반환·기본값

## 핵심 개념

함수는 입력을 받아 값을 반환합니다. 출력하는 것과 반환하는 것은 서로 다른 동작입니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
function add(a, b = 1) { return a + b; }
const multiply = (a, b) => a * b;
function sum(...values) { return values.reduce((total, n) => total + n, 0); }
console.log(add(2), add(2, 3), multiply(2, 3));
console.log(sum(), sum(1, 2, 3));
console.log([1, 2].map(n => n * 2).join(","));
```

## 예상 결과

```text
3 5 6
0 6
2,4
```

## 동작 원리와 주의사항

return 없는 함수는 undefined를 반환합니다. 기본 매개변수는 생략 또는 undefined에 적용되고 null에는 적용되지 않습니다. rest는 인수를 배열로 모으며 spread는 값을 펼칩니다. 화살표 함수는 자체 this를 갖지 않아 일반 함수와 용도가 다릅니다.



## 직접 확인하기

입력이 유효하지 않으면 조기 반환하는 함수를 추가하고 sum(...[1,2,3])을 실행하세요.

---

---

---

[전체 목차](../README.md) · [이전](../09.%20continue/README.md) · [다음](../11.%20Array/README.md)
