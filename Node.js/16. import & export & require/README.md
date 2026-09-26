# ESM과 CommonJS

## 핵심 개념

Node는 ES 모듈과 CommonJS를 지원합니다. 파일 확장자와 package.json의 type으로 해석 방식을 명확히 정합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
import { add } from "./math.mjs";
import legacy from "./legacy.cjs";
console.log(add(2, 3));
console.log(legacy.label);
```

## 예상 결과

```text
5
CommonJS
```

## 동작 원리와 주의사항

.mjs는 ESM, .cjs는 CommonJS로 명시합니다. .js의 의미는 가장 가까운 package.json의 type 등에 영향을 받으므로 type을 적어 두세요. ESM 상대 import는 확장자를 포함합니다. ESM에는 CommonJS의 require·__dirname이 같은 형태로 자동 제공되지 않습니다. CommonJS 모듈의 named export 추론에 의존하기보다 명확한 경계를 두세요.

## 동봉 파일

math.mjs는 `export function add(a, b) { return a + b; }`, legacy.cjs는 `module.exports = { label: "CommonJS" };`를 정의합니다.

## 직접 확인하기

math.mjs에 multiply를 추가해 named import로 불러오세요.

---

---

---

[전체 목차](../README.md) · [이전](../15.%20Buffer/README.md) · [다음](../17.%20setTimeout%20%26%20Promise/README.md)
