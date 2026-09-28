# 이벤트 루프와 비동기 I/O

## 핵심 개념

비동기 API는 대기 중 다른 작업을 처리할 수 있게 하지만 CPU 연산 자체를 자동 병렬화하지 않습니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
import { setTimeout as delay } from "node:timers/promises";
console.log("start");
const task = delay(10).then(() => "ready");
console.log("other work");
console.log(await task);
```

## 예상 결과

```text
start
other work
ready
```

## 동작 원리와 주의사항

긴 동기 반복은 이벤트 루프를 막아 다른 요청 처리도 지연시킵니다. 파일·네트워크 비동기 처리와 CPU 작업의 Worker 분리를 구별하세요. 타이머 지연은 정확한 실행 시각 보장이 아닙니다. process.nextTick·Promise·timer 순서를 문맥 없이 외우기보다 실행 환경과 I/O 단계에 따라 확인합니다.



## 직접 확인하기

두 독립 delay를 Promise.all로 기다리고 순차 await와 차이를 관찰하세요.

---

---

---

[전체 목차](../README.md) · [이전](../16.%20import%20%26%20export%20%26%20require/README.md) · [다음](../18.%20readFile%20%26%20writeFile/README.md)
