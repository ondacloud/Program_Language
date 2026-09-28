# Record & Pick & Partial

## 개념과 사용 시점

유틸리티 타입은 기존 타입에서 필요한 모양을 계산합니다. 실행 코드의 객체를 자동 변환하지는 않습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "16. Record & Pick & Partial/main.ts"
```

## 코드 읽기

```typescript
type Student = { name: string; score: number };
const patch: Partial<Student> = { score: 90 };
const summary: Pick<Student, "name"> = { name: "Mina" };
const counts: Record<string, number> = { A: 2 };
console.log(summary.name, patch.score, counts["A"]);
export {};
```

[실행 파일](main.ts)

## 예상 결과

Mina 90 2

## 주의사항

Partial로 만든 업데이트 입력에도 실제 허용 필드와 값 검증이 필요합니다.

## 연습

Readonly<Student>와 Omit<Student, "score">를 만들어 보세요.

[과정 목차](../README.md)
