# operator

## 개념과 사용 시점

Next.js 페이지에서도 연산은 JavaScript·TypeScript의 식입니다. JSX의 중괄호에 계산 결과를 넣습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/00
```

## 코드 읽기

```tsx
export default function Page() { const score = 80; return <p>{score + 5} / {score >= 70 ? "pass" : "retry"}</p>; }
```

[실행 파일](page.tsx)

## 예상 결과

85 / pass

## 주의사항

서버 렌더링과 브라우저 첫 렌더링의 값이 달라지면 hydration 문제가 생길 수 있습니다. 렌더 중 무작위 값에 주의하세요.

## 연습

나머지 연산으로 짝수 여부를 표시하세요.

[과정 목차](../README.md)
