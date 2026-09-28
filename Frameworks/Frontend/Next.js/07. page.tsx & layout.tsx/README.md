# page.tsx & layout.tsx

## 개념과 사용 시점

App Router는 폴더와 예약 파일 이름으로 경로와 공유 레이아웃을 구성합니다. page는 경로의 화면, layout은 자식 경로를 감쌉니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/07
```

## 코드 읽기

```tsx
export default function Page() { return <p>This page is inside the shared root layout.</p>; }
```

[실행 파일](page.tsx)

## 예상 결과

공통 머리글·목차 링크 아래 문구가 보입니다.

## 주의사항

공통 app/layout.tsx에서 html·body를 구성합니다. 일반 컴포넌트 파일을 만들기만 해서는 경로가 생기지 않습니다.

## 연습

중첩 app/lessons/layout.tsx를 추가하고 공유 영역을 확인하세요.

[과정 목차](../README.md)
