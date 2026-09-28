# params & dynamic segment

## 개념과 사용 시점

[slug] 폴더는 동적 경로를 나타냅니다. Next.js 16의 서버 페이지에서 params는 Promise이므로 await로 읽습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/10
```

## 코드 읽기

```tsx
import Link from "next/link";
export default function Page() { return <Link href="/students/mina">Open dynamic student page</Link>; }
```

[실행 파일](page.tsx)

## 예상 결과

링크를 누르면 Student: mina가 표시됩니다.

## 주의사항

실제 동적 페이지 코드는 app/students/[slug]/page.tsx에 있습니다. URL 문자열은 도메인 데이터의 유효성을 보장하지 않습니다.

## 연습

존재하지 않는 slug에 대한 처리 규칙을 추가하세요.

[과정 목차](../README.md)
