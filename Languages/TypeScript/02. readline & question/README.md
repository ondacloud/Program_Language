# readline & question

## 개념과 사용 시점

Node.js의 readline/promises로 한 줄 입력을 비동기로 받습니다. TypeScript 자체에 input 함수가 있는 것은 아닙니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "02. readline & question/main.ts"
```

## 코드 읽기

```typescript
import { createInterface } from "node:readline/promises";
import { stdin, stdout } from "node:process";
const rl = createInterface({ input: stdin, output: stdout });
try { const name = await rl.question("Name: "); console.log(`Hello, ${name.trim() || "guest"}`); } finally { rl.close(); }
export {};
```

[실행 파일](main.ts)

## 예상 결과

Mina 입력 시 Hello, Mina. 공백만 입력하면 Hello, guest

## 주의사항

입력은 항상 문자열입니다. 숫자 변환 후 Number.isFinite로 검증하세요. 인터페이스를 닫아야 프로세스가 종료됩니다.

## 연습

나이 입력을 받아 잘못된 숫자를 거절하세요.

[과정 목차](../README.md)
