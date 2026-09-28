# Array & map & filter

## 개념과 사용 시점

배열의 원소 타입을 지정하고 map으로 변환, filter로 선택합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "10. Array & map & filter/main.ts"
```

## 코드 읽기

```typescript
const scores: number[] = [60, 80, 90];
console.log(scores.filter(n => n >= 70).map(n => n + 1).join(","));
export {};
```

[실행 파일](main.ts)

## 예상 결과

81,91

## 주의사항

map과 filter는 새 배열을 반환합니다. noUncheckedIndexedAccess 설정에서는 인덱스 접근에 undefined 가능성이 포함됩니다.

## 연습

reduce로 점수 합계를 계산하세요.

[과정 목차](../README.md)
