# while & do while

## 개념과 사용 시점

while은 실행 전에, do while은 실행 후 조건을 확인합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "06. while & do while/main.ts"
```

## 코드 읽기

```typescript
let n = 2;
while (n > 0) { console.log(n); n--; }
do { console.log("once"); } while (false);
export {};
```

[실행 파일](main.ts)

## 예상 결과

2, 1, once

## 주의사항

조건을 바꾸는 코드가 없으면 무한 반복이 될 수 있습니다.

## 연습

초기 n이 0일 때 차이를 확인하세요.

[과정 목차](../README.md)
