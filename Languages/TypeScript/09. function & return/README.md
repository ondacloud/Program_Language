# function & return

## 개념과 사용 시점

매개변수와 반환 타입을 선언하여 함수 경계를 검사합니다. 기본 매개변수는 인자 생략을 처리합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "09. function & return/main.ts"
```

## 코드 읽기

```typescript
function greet(name: string, prefix = "Hi"): string { return `${prefix}, ${name}`; }
console.log(greet("Mina"));
export {};
```

[실행 파일](main.ts)

## 예상 결과

Hi, Mina

## 주의사항

반환 타입 void는 유용한 반환값을 사용하지 않는 함수에 적합합니다.

## 연습

점수 배열의 평균을 반환하는 함수를 작성하세요.

[과정 목차](../README.md)
