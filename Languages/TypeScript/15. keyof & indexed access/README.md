# keyof & indexed access

## 개념과 사용 시점

keyof는 객체의 키 집합을 타입으로 만들고 T[K]는 해당 키의 값 타입을 구합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "15. keyof & indexed access/main.ts"
```

## 코드 읽기

```typescript
function get<T, K extends keyof T>(obj: T, key: K): T[K] { return obj[key]; }
console.log(get({ name: "Mina", score: 80 }, "score"));
export {};
```

[실행 파일](main.ts)

## 예상 결과

80

## 주의사항

문자열 키 전체를 허용하면 오타를 잡기 어렵습니다. 실제 키로 범위를 제한하세요.

## 연습

존재하지 않는 키를 전달해 타입 오류를 확인하세요.

[과정 목차](../README.md)
