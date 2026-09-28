# if & conditional JSX

## 개념과 사용 시점

조건에 따라 다른 JSX를 반환하거나 삼항 연산자로 일부 화면을 바꿉니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/03
```

## 코드 읽기

```tsx
export default function Page() { const score = 80; if (score < 0) return <p>invalid</p>; return <p>{score >= 70 ? "pass" : "retry"}</p>; }
```

[실행 파일](page.tsx)

## 예상 결과

pass

## 주의사항

훅을 사용하는 컴포넌트에서 훅 호출 순서가 조건에 따라 달라지면 안 됩니다.

## 연습

90점 이상 excellent를 추가하세요.

[과정 목차](../README.md)
