# useRouter & usePathname

## 개념과 사용 시점

App Router의 클라이언트 탐색 훅은 next/navigation에서 가져옵니다. 현재 경로를 읽고 이벤트에서 이동할 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/09
```

## 코드 읽기

```tsx
"use client";
import { usePathname, useRouter } from "next/navigation";
export default function Page() { const router = useRouter(); const path = usePathname(); return <><p>{path}</p><button onClick={() => router.push("/lessons/00")}>Go</button></>; }
```

[실행 파일](page.tsx)

## 예상 결과

현재 경로 /lessons/09를 표시하고 Go로 이동합니다.

## 주의사항

외부 입력 URL을 검증 없이 router.push에 전달하지 마세요. 정적인 탐색에는 Link가 더 직접적입니다.

## 연습

router.back 버튼을 추가하세요.

[과정 목차](../README.md)
