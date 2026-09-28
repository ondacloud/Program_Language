# class & implements

## 개념과 사용 시점

클래스는 상태와 동작을 묶고 implements는 인스턴스가 인터페이스 계약을 만족하는지 검사합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "17. class & implements/main.ts"
```

## 코드 읽기

```typescript
interface Named { name: string }
class Student implements Named { constructor(public name: string, private score: number) {} summary() { return `${this.name}: ${this.score}`; } }
console.log(new Student("Mina", 80).summary());
export {};
```

[실행 파일](main.ts)

## 예상 결과

Mina: 80

## 주의사항

TypeScript private 접근 제한과 JavaScript #field의 런타임 비공개는 서로 다른 기능입니다.

## 연습

점수를 올리는 메서드를 추가하세요.

[과정 목차](../README.md)
