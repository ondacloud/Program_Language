# switch & case

## 개념과 사용 시점

switch는 하나의 값을 여러 후보와 비교합니다. break로 다음 case 실행을 막습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "04. switch & case/main.ts"
```

## 코드 읽기

```typescript
function label(code: number): string { switch (code) { case 200: return "ok"; case 404: return "missing"; default: return "other"; } }
console.log(label(404));
export {};
```

[실행 파일](main.ts)

## 예상 결과

missing

## 주의사항

case 비교는 엄격한 동등성입니다. return은 함수까지 종료합니다.

## 연습

500에 error를 반환하세요.

[과정 목차](../README.md)
