# 조건, 반복, switch

## 핵심 개념

if·switch는 분기를, for·while·for...of는 반복을 표현합니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
const values = [1, 2, 3, 4];
let total = 0;
for (const value of values) {
  if (value % 2 !== 0) continue;
  total += value;
}
console.log(total);
switch (total) {
  case 6: console.log("six"); break;
  default: console.log("other");
}
```

## 예상 결과

```text
6
six
```

## 동작 원리와 주의사항

for...of는 iterable의 값, for...in은 열거 가능한 문자열 키를 순회합니다. 배열 값 순회에 for...in을 기본으로 사용하지 마세요. switch는 break가 없으면 다음 case로 흐를 수 있습니다. break는 가장 가까운 대상 반복 또는 switch를 끝냅니다.

## 직접 확인하기

홀수 합을 구하도록 조건을 바꾸세요. 답: 4.

---

---

---

[전체 목차](../README.md) · [이전](../16.%20bitwise%20operator%20%26%20BigInt/README.md) · [다음](../18.%20function%20%26%20closure/README.md)
