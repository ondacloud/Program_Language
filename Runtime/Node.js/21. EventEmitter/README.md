# EventEmitter와 리스너 수명

## 핵심 개념

EventEmitter는 이름 있는 이벤트를 리스너에 전달합니다. 일반 emit은 등록된 리스너를 동기적으로 호출합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
import { EventEmitter } from "node:events";
const events = new EventEmitter();
const listener = value => console.log(`value=${value}`);
events.on("data", listener);
events.once("ready", () => console.log("ready"));
events.emit("ready");
events.emit("ready");
events.emit("data", 3);
events.off("data", listener);
console.log(events.listenerCount("data"));
```

## 예상 결과

```text
ready
value=3
0
```

## 동작 원리와 주의사항

once는 한 번 실행 뒤 제거됩니다. off에는 등록한 함수 참조가 필요합니다. EventEmitter의 error 이벤트는 리스너가 없으면 예외가 될 수 있습니다. 비동기 리스너를 등록했다고 emit이 자동으로 Promise 완료를 기다리지는 않습니다. 리스너 누적 경고를 제한만 높여 숨기기보다 수명을 확인하세요.



## 직접 확인하기

on과 once를 바꿔 ready 출력 횟수를 비교하세요.

---

---

---

[전체 목차](../README.md) · [이전](../20.%20Readable%20%26%20Transform%20%26%20pipeline/README.md) · [다음](../22.%20http.createServer/README.md)
