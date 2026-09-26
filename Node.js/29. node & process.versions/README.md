# Node.js 런타임과 표준 모듈

## 핵심 개념

Node.js는 브라우저 밖에서 JavaScript를 실행하는 런타임입니다. 파일·프로세스·네트워크 API와 이벤트 루프를 제공합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
import { platform } from "node:os";
console.log("Hello Node.js");
console.log(process.versions.node.split(".")[0]);
console.log(platform());
console.log(typeof document);
```

## 예상 결과

```text
Hello Node.js
24 (실행 중인 Node의 주 버전)
win32 또는 linux 또는 darwin 등
undefined
```

## 동작 원리와 주의사항

node: 접두사는 내장 모듈을 명확하게 표시합니다. JavaScript 문법, V8 엔진, Node의 API, npm 패키지를 구분하세요. 브라우저 DOM은 기본 제공하지 않습니다. 이 과정은 Node 24.x를 학습 기준으로 하며 특정 패치가 최신이라고 가정하지 않습니다. 설치한 버전과 해당 API 문서 버전을 맞추세요.



## 직접 확인하기

process.versions에서 JavaScript 엔진과 다른 구성 요소의 버전을 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../28.%20process.env/README.md)
