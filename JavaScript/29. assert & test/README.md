# 순수 함수와 자동 테스트

## 핵심 개념

입출력 부작용을 분리하면 같은 입력에 같은 결과를 주는 계산을 쉽게 테스트할 수 있습니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
import test from "node:test";
import assert from "node:assert/strict";

function average(values) {
  if (values.length === 0) throw new RangeError("empty values");
  return values.reduce((sum, value) => sum + value, 0) / values.length;
}
test("average and empty input", () => {
  assert.equal(average([2, 4]), 3);
  assert.equal(average([5]), 5);
  assert.throws(() => average([]), RangeError);
});
```

## 예상 결과

```text
테스트 1개 통과. 보고 형식과 실행 시간은 Node.js 버전에 따라 다릅니다.
```

## 동작 원리와 주의사항

Node.js 내장 test runner 예제입니다. `node --test example.mjs`로 실행할 수 있습니다. 브라우저 UI 테스트와 수치 함수 단위 테스트는 검증 범위가 다릅니다. 비동기 테스트는 Promise를 반환하거나 await해야 완료를 기다립니다. 테스트가 구현 코드를 그대로 복제하기보다 입력·출력 계약을 확인하도록 만드세요.

## 직접 확인하기

음수·큰 값·숫자가 아닌 원소에 대한 동작 정책을 정하고 테스트를 추가하세요.

---

---

---

[전체 목차](../README.md) · [이전](../28.%20localStorage/README.md) · [다음](../30.%20node%20%26%20script/README.md)
