# console.log

## 개념과 사용 시점

console.log는 값을 표준 출력에 표시합니다. 템플릿 문자열은 값을 문자열 안에 넣을 때 사용합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "01. console.log/main.ts"
```

## 코드 읽기

```typescript
const name: string = "Mina";
console.log(`Hello, ${name}`);
export {};
```

[실행 파일](main.ts)

## 예상 결과

Hello, Mina

## 주의사항

타입 주석 : string은 출력 문자열의 일부가 아니며 컴파일 후 제거됩니다.

## 연습

숫자 점수를 템플릿 문자열로 출력하세요.

[과정 목차](../README.md)
