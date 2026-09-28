# Next.js

실제 문법·함수·파일 규칙 이름을 번호순으로 배치했습니다. 기초 연산 → 출력 → 입력 → 조건 → 반복 → 함수·자료구조 → 해당 기술의 주요 기능 순서로 학습합니다. 프레임워크에서는 언어 문법과 UI·라우팅 API의 역할을 구분합니다.

## 준비와 실행

학습 기준: Next.js 16 App Router, React 19, TypeScript, Node.js 22.12 이상. React와 TypeScript 기초를 먼저 학습하세요. Pages Router의 getServerSideProps와 App Router 방식을 섞지 않습니다.

```powershell
npm ci
npm run dev
# http://localhost:3000
npm run build
npm start
```

각 장의 `page.tsx`는 공통 `app/lessons/번호/page.tsx`가 가져옵니다. 서버 컴포넌트의 console.log는 서버 터미널에, 클라이언트 이벤트 로그는 브라우저 콘솔에 나타납니다. `use client`는 브라우저 API나 훅이 필요한 경계를 표시하며 모든 렌더링이 브라우저에서만 이루어진다는 뜻은 아닙니다.

## 구문별 목차

| 번호 | 문법·함수 |
|---|---|
| 00 | [operator](00.%20operator/README.md) |
| 01 | [JSX & console.log](01.%20JSX%20%26%20console.log/README.md) |
| 02 | [use client & onChange](02.%20use%20client%20%26%20onChange/README.md) |
| 03 | [if & conditional JSX](03.%20if%20%26%20conditional%20JSX/README.md) |
| 04 | [map & key](04.%20map%20%26%20key/README.md) |
| 05 | [useState](05.%20useState/README.md) |
| 06 | [useEffect](06.%20useEffect/README.md) |
| 07 | [page.tsx & layout.tsx](07.%20page.tsx%20%26%20layout.tsx/README.md) |
| 08 | [Link](08.%20Link/README.md) |
| 09 | [useRouter & usePathname](09.%20useRouter%20%26%20usePathname/README.md) |
| 10 | [params & dynamic segment](10.%20params%20%26%20dynamic%20segment/README.md) |
| 11 | [searchParams](11.%20searchParams/README.md) |
| 12 | [async Server Component](12.%20async%20Server%20Component/README.md) |
| 13 | [loading.tsx & Suspense](13.%20loading.tsx%20%26%20Suspense/README.md) |
| 14 | [error.tsx & reset](14.%20error.tsx%20%26%20reset/README.md) |
| 15 | [notFound & redirect](15.%20notFound%20%26%20redirect/README.md) |
| 16 | [GET & Response.json](16.%20GET%20%26%20Response.json/README.md) |
| 17 | [use server & form action](17.%20use%20server%20%26%20form%20action/README.md) |
| 18 | [metadata & Image](18.%20metadata%20%26%20Image/README.md) |

## 종합 연습

학생 이름과 점수를 입력받아 70점 이상만 표시하는 성적 목록을 만들어 보세요. 빈 이름·숫자가 아닌 값·경계값 70을 확인하고, 각 항목 삭제와 합계 계산을 추가하세요. UI 과정에서는 목록 항목의 안정된 key와 상태 소유 위치도 설명하세요.

[공식 문서](https://nextjs.org/docs/app) · [전체 목차](../../../README.md)
