# Node에서 변수·자료형·연산자 시작

## 핵심 개념

Node.js는 JavaScript 실행 환경입니다. 서버 API 이전에 JavaScript의 값·타입·계산을 같은 방식으로 익힙니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
const priceText = "1000";
const price = Number(priceText);
let quantity = 2;
quantity += 1;
const total = price * quantity;
console.log(typeof priceText, typeof price);
console.log(total, quantity >= 3 ? "discount" : "normal");
console.log(total > 0 && Number.isFinite(total));
```

## 예상 결과

```text
string number
3000 discount
true
```

## 동작 원리와 주의사항

Node 전용 연산자는 따로 없습니다. +·-·*·/·%·**·===·&&·?? 등은 JavaScript 문법입니다. process·Buffer·fs는 Node가 제공하는 API입니다. 먼저 JavaScript의 산술·비교·논리·비트·타입 변환 장을 학습하고 이 예제로 런타임 차이를 확인하세요.



## 직접 확인하기

priceText를 bad로 바꾸고 계산 전에 Number.isFinite로 거부하세요. document가 Node에 기본 제공되지 않는 이유를 설명하세요.

---

---

---

[전체 목차](../README.md) · [다음](../01.%20console.log%20%26%20stdout.write/README.md)
