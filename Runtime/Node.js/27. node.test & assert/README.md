# 내장 테스트 runner와 비동기 검증

## 핵심 개념

node:test와 node:assert/strict로 외부 테스트 의존성 없이 동작을 확인할 수 있습니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
import test from "node:test";
import assert from "node:assert/strict";

async function readScore(text) {
  const value = Number(text);
  if (text.trim() === "" || !Number.isFinite(value)) throw new TypeError("invalid score");
  return value;
}

test("valid score", async () => {
  assert.equal(await readScore("90"), 90);
});
test("invalid score", async () => {
  await assert.rejects(readScore("abc"), TypeError);
  await assert.rejects(readScore(""), TypeError);
});
```

## 예상 결과

```text
테스트 2개 통과 (출력 형식과 시간은 환경에 따라 다름)
```

## 동작 원리와 주의사항

node --test example.mjs로 실행하세요. 비동기 assert.rejects는 await해야 합니다. 테스트끼리 환경 변수·파일·포트를 공유하면 병렬 실행에서 충돌할 수 있어 임시 자원을 사용하세요. 날짜·랜덤 값·외부 네트워크에 기대는 테스트는 의존성을 분리해 결정적으로 만들면 유지보수가 쉽습니다.



## 직접 확인하기

유효한 점수 범위를 0~100으로 제한하고 0,100,-1,101 테스트를 추가하세요.

---

---

---

[전체 목차](../README.md) · [이전](../26.%20package.json%20%26%20npm/README.md) · [다음](../28.%20process.env/README.md)
