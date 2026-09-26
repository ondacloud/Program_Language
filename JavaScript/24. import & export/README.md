# ES 모듈 — import와 export

## 핵심 개념

모듈은 파일별 범위를 제공하며 공개한 값을 다른 파일에서 가져옵니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
import { add } from "./math.mjs";
console.log(add(2, 3));
```

## 예상 결과

```text
5
```

## 동작 원리와 주의사항

math.mjs도 같은 폴더에 동봉되어 있습니다. named export와 default export의 import 문법은 다릅니다. Node.js의 .mjs는 ES 모듈로 처리됩니다. 브라우저 모듈은 HTTP 서버로 제공하는 편이 명확하며 파일 경로·CORS 조건을 확인하세요. 모듈 최상위 부작용은 import 시 실행됩니다.

## 함께 사용하는 math.mjs

```javascript
export function add(a, b) {
  return a + b;
}
```

## 직접 확인하기

subtract를 named export로 추가하고 호출하세요.

---

---

---

[전체 목차](../README.md) · [이전](../23.%20try%20%26%20catch%20%26%20throw/README.md) · [다음](../25.%20Promise%20%26%20async%20%26%20await/README.md)
