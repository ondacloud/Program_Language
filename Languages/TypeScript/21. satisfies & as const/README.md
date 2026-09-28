# satisfies & as const

## 개념과 사용 시점

satisfies는 타입 계약 충족 여부를 검사하면서 구체적인 추론을 유지합니다. as const는 리터럴 값을 readonly 타입으로 좁힙니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "21. satisfies & as const/main.ts"
```

## 코드 읽기

```typescript
const colors = { ok: "green", fail: "red" } as const satisfies Record<string, string>;
console.log(colors.ok.toUpperCase());
export {};
```

[실행 파일](main.ts)

## 예상 결과

GREEN

## 주의사항

as const 역시 런타임 Object.freeze가 아닙니다. 타입 단언 as로 검사를 덮어쓰는 것과 구분하세요.

## 연습

오타나 숫자 값을 추가해 검사 결과를 확인하세요.

[과정 목차](../README.md)
