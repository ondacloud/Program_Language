# const & let

## 개념과 사용 시점

const는 재할당 불가, let은 재할당 가능한 바인딩을 만듭니다. 타입 추론을 기본으로 사용하고 공개 경계에는 명확한 타입을 붙입니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "08. const & let/main.ts"
```

## 코드 읽기

```typescript
const student = { name: "Mina", score: 80 };
student.score += 5;
let attempts: number = 1; attempts++;
console.log(student.score, attempts);
export {};
```

[실행 파일](main.ts)

## 예상 결과

85 2

## 주의사항

const 객체의 속성은 기본적으로 변경할 수 있습니다. const가 깊은 불변성을 뜻하지 않습니다.

## 연습

readonly 타입을 적용한 뒤 속성 변경 오류를 확인하세요.

[과정 목차](../README.md)
