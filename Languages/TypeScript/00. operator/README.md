# operator

## 개념과 사용 시점

산술·비교·논리 연산자는 JavaScript와 같은 실행 규칙을 사용합니다. 타입 검사는 계산 전에 피연산자의 타입을 확인합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "00. operator/main.ts"
```

## 코드 읽기

```typescript
const a = 7; const b = 2;
console.log(a + b, a / b, a % b);
console.log(a > b && b > 0);
export {};
```

[실행 파일](main.ts)

## 예상 결과

9 3.5 1, 다음 줄 true

## 주의사항

===는 타입 변환 없이 비교합니다. number의 큰 정수 정밀도에는 한계가 있습니다.

## 연습

??와 ||가 0을 처리하는 차이를 확인하세요.

[과정 목차](../README.md)
