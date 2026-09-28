# JavaScript와 실행 환경

## 핵심 개념

JavaScript 언어와 브라우저·Node.js가 제공하는 API는 구별합니다. 같은 문법을 써도 document는 일반 Node.js에 없습니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
console.log("Hello JavaScript");
console.log(typeof globalThis);
console.log(typeof document);
```

## 예상 결과

```text
Hello JavaScript
object
undefined (Node.js 기준)
```

## 동작 원리와 주의사항

예제는 ES 모듈인 .mjs 파일로 저장합니다. 브라우저에서는 script type="module"을 사용할 수 있습니다. 모듈은 엄격 모드로 실행됩니다. console은 디버깅 출력이며 사용자 화면 UI와 다릅니다. 최신 문법과 실행 환경의 지원 범위를 함께 확인하세요.

## 직접 확인하기

브라우저 콘솔에서 typeof document를 실행해 Node.js와 차이를 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../29.%20assert%20%26%20test/README.md)
