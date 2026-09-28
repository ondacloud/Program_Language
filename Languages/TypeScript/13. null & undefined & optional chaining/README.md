# null & undefined & optional chaining

## 개념과 사용 시점

?.는 대상이 null 또는 undefined일 때 접근을 멈추고 ??는 그 경우에만 기본값을 선택합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "13. null & undefined & optional chaining/main.ts"
```

## 코드 읽기

```typescript
function city(user?: { address?: { city: string } }): string { return user?.address?.city ?? "unknown"; }
console.log(city(), city({ address: { city: "Seoul" } }));
export {};
```

[실행 파일](main.ts)

## 예상 결과

unknown Seoul

## 주의사항

! 단언은 런타임 검사를 추가하지 않습니다. 가능하면 검사나 기본값으로 처리하세요.

## 연습

빈 문자열에는 ?? 기본값이 적용되지 않음을 확인하세요.

[과정 목차](../README.md)
