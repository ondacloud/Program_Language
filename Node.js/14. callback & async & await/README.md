# 콜백·Promise·async의 기본 흐름

## 핵심 개념

함수를 값으로 전달하는 콜백과 비동기 완료를 표현하는 Promise를 연결해 이해합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
import { setTimeout as delay } from "node:timers/promises";
function apply(value, transform) { return transform(value); }
async function doubleLater(value) {
  await delay(1);
  return value * 2;
}
console.log(apply(3, n => n + 1));
console.log(await doubleLater(3));
console.log("done");
```

## 예상 결과

```text
4
6
done
```

## 동작 원리와 주의사항

apply의 콜백은 동기 실행이므로 모든 콜백이 비동기인 것은 아닙니다. async 함수는 Promise를 반환합니다. 이 .mjs 예제는 ESM이므로 최상위 await를 사용합니다. await는 해당 비동기 흐름을 기다리게 하며 CPU 계산을 자동으로 다른 스레드에 보내지 않습니다.



## 직접 확인하기

doubleLater가 오류를 던지게 만들고 호출부 try/catch로 처리하세요. await를 제거했을 때 반환값 타입을 관찰하세요.

---

---

---

[전체 목차](../README.md) · [이전](../13.%20process.argv%20%26%20parseArgs/README.md) · [다음](../15.%20Buffer/README.md)
