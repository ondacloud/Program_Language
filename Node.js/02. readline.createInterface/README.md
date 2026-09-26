# 입력 — readline과 표준 입력

## 핵심 개념

readline 인터페이스는 입력 스트림을 줄 단위로 읽습니다. 입력이 끝나면 인터페이스를 닫아 자원을 정리합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
import { createInterface } from "node:readline";
const reader = createInterface({ input: process.stdin, crlfDelay: Infinity });
let received = false;
try {
  for await (const line of reader) {
    received = true;
    console.log(`Hello ${line}`);
    break;
  }
  if (!received) {
    console.error("no input");
    process.exitCode = 1;
  }
} finally {
  reader.close();
}
```

## 예상 결과

```text
Hello Alice
```

## 동작 원리와 주의사항

실행 후 Alice와 Enter를 입력하세요. 이 예제는 첫 줄만 처리하고 종료합니다. 명령줄 인수 process.argv와 실행 중 입력 process.stdin은 별도 경로입니다. 브라우저의 prompt·document는 Node의 입력 API가 아닙니다.



## 직접 확인하기

공백이 있는 이름·빈 줄·입력 종료를 시험하세요. 숫자를 받아 합계를 계산하도록 확장하세요.

---

---

[전체 목차](../README.md) · [이전](../01.%20console.log%20%26%20stdout.write/README.md) · [다음](../03.%20if%20%26%20else/README.md)
