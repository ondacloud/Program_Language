# for

## 개념과 사용 시점

for는 초기화·조건·갱신을 제어하는 반복문입니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "05. for/main.ts"
```

## 코드 읽기

```typescript
let sum = 0;
for (let i = 1; i <= 3; i++) { sum += i; }
console.log(sum);
export {};
```

[실행 파일](main.ts)

## 예상 결과

6

## 주의사항

let의 블록 범위를 활용하세요. 종료 조건과 경계 포함 여부를 확인합니다.

## 연습

1부터 10까지 합계를 구하세요.

[과정 목차](../README.md)
