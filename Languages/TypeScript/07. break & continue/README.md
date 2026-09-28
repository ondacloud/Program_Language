# break & continue

## 개념과 사용 시점

break는 반복을 끝내고 continue는 현재 회차의 나머지를 건너뜁니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "07. break & continue/main.ts"
```

## 코드 읽기

```typescript
for (let n = 1; n <= 5; n++) { if (n === 2) continue; if (n === 4) break; console.log(n); }
export {};
```

[실행 파일](main.ts)

## 예상 결과

1, 3

## 주의사항

중첩 반복에서는 가장 가까운 반복에 적용됩니다.

## 연습

짝수를 건너뛰어 1·3·5를 출력하세요.

[과정 목차](../README.md)
