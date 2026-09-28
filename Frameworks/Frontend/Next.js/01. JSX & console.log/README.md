# JSX & console.log

## 개념과 사용 시점

JSX는 화면 구조를 반환하고 console.log는 진단 메시지를 남깁니다. App Router의 페이지는 기본적으로 서버 컴포넌트입니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/01
```

## 코드 읽기

```tsx
export default function Page() { const name = "Mina"; console.log("server lesson:", name); return <h2>Hello, {name}</h2>; }
```

[실행 파일](page.tsx)

## 예상 결과

화면에는 Hello, Mina, 서버 터미널에는 진단 로그가 나타납니다.

## 주의사항

서버 로그에 비밀번호나 토큰을 남기지 마세요. React는 텍스트 삽입을 escape합니다.

## 연습

문자열과 숫자를 함께 표시하세요.

[과정 목차](../README.md)
