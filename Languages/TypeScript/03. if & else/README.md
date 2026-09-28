# if & else

## 개념과 사용 시점

if는 조건에 맞는 블록을 실행합니다. 조건 검사로 타입을 좁히는 narrowing도 할 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "03. if & else/main.ts"
```

## 코드 읽기

```typescript
const value: unknown = "hello";
if (typeof value === "string") { console.log(value.toUpperCase()); } else { console.log("not a string"); }
export {};
```

[실행 파일](main.ts)

## 예상 결과

HELLO

## 주의사항

unknown은 확인 없이 속성을 사용할 수 없습니다. any로 우회하면 검사 이점이 사라집니다.

## 연습

number 입력에는 두 배를 출력하도록 분기를 추가하세요.

[과정 목차](../README.md)
