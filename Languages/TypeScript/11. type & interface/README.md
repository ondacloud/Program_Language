# type & interface

## 개념과 사용 시점

type과 interface로 객체 구조의 계약을 표현합니다. 선택적 속성에는 ?를 붙입니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "11. type & interface/main.ts"
```

## 코드 읽기

```typescript
interface Student { name: string; score?: number }
type Team = "A" | "B";
const student: Student = { name: "Mina" };
const team: Team = "A";
console.log(student.name, student.score ?? 0, team);
export {};
```

[실행 파일](main.ts)

## 예상 결과

Mina 0 A

## 주의사항

구조적 타입은 필드 구조를 검사합니다. 외부 JSON이 선언한 타입을 만족하는지는 실행 중 별도 검증이 필요합니다.

## 연습

필수 id와 readonly name을 추가하세요.

[과정 목차](../README.md)
