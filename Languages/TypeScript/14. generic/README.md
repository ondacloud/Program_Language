# generic

## 개념과 사용 시점

제네릭은 입력과 출력의 타입 관계를 보존하는 재사용 함수를 만듭니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "14. generic/main.ts"
```

## 코드 읽기

```typescript
function first<T>(items: readonly T[]): T | undefined { return items[0]; }
console.log(first([10, 20]), first<string>([]));
export {};
```

[실행 파일](main.ts)

## 예상 결과

10 undefined

## 주의사항

빈 배열 가능성을 반환 타입에 표현합니다. any와 달리 타입 관계가 유지됩니다.

## 연습

두 값을 묶는 pair<T, U> 함수를 만드세요.

[과정 목차](../README.md)
