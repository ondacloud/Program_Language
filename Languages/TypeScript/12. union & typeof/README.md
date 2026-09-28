# union & typeof

## 개념과 사용 시점

유니온은 여러 타입 중 하나인 값을 나타냅니다. typeof 검사를 통해 가능한 타입을 좁힙니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "12. union & typeof/main.ts"
```

## 코드 읽기

```typescript
function show(value: string | number): string { return typeof value === "number" ? value.toFixed(1) : value.toUpperCase(); }
console.log(show(3), show("hi"));
export {};
```

[실행 파일](main.ts)

## 예상 결과

3.0 HI

## 주의사항

유니온의 모든 구성원이 지원하지 않는 메서드는 검사 전 호출할 수 없습니다.

## 연습

boolean도 처리하도록 확장하세요.

[과정 목차](../README.md)
