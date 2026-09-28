# Promise & async & await

## 개념과 사용 시점

Promise는 나중에 완료될 결과를 표현합니다. async 함수는 Promise를 반환하고 await로 완료를 기다립니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "18. Promise & async & await/main.ts"
```

## 코드 읽기

```typescript
async function loadScore(): Promise<number> { return 80; }
const [a, b] = await Promise.all([loadScore(), loadScore()]);
console.log(a + b);
export {};
```

[실행 파일](main.ts)

## 예상 결과

160

## 주의사항

await는 현재 async 흐름을 멈춥니다. await를 썼다고 CPU 작업이 별도 스레드로 이동하지 않습니다.

## 연습

실패하는 Promise를 try/catch로 처리하세요.

[과정 목차](../README.md)
