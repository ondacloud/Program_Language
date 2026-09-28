# 배열·객체·구조 분해·JSON

## 핵심 개념

API와 파일에서 받는 데이터를 처리하려면 배열과 객체, JSON 문자열의 차이를 알아야 합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
const text = '[{"name":"A","price":10},{"name":"B","price":20}]';
const items = JSON.parse(text);
const names = items.filter(({ price }) => price >= 15).map(({ name }) => name);
const [first] = items;
const copy = { ...first, price: first.price + 1 };
console.log(names.join(","));
console.log(first.price, copy.price);
console.log(JSON.stringify(copy));
```

## 예상 결과

```text
B
10 11
{"name":"A","price":11}
```

## 동작 원리와 주의사항

JSON은 텍스트 형식이고 객체 자체가 아닙니다. JSON.parse는 구문이 잘못되면 예외를 던지며 성공해도 데이터 구조가 올바르다는 뜻은 아닙니다. 객체 spread는 얕은 복사입니다. JSON.stringify는 모든 JavaScript 값을 원형 그대로 보존하는 복제 도구가 아닙니다.



## 직접 확인하기

잘못된 JSON과 필수 price가 없는 객체를 넣고 파싱 오류와 구조 검증 오류를 분리하세요.

---

---

---

[전체 목차](../README.md) · [이전](../10.%20function%20%26%20return/README.md) · [다음](../12.%20Number%20%26%20isInteger/README.md)
