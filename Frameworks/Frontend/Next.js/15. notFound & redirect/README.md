# notFound & redirect

## 개념과 사용 시점

notFound는 찾을 수 없는 리소스 흐름을 종료하고 redirect는 다른 경로로 이동시킵니다. 둘은 단순 반환값 함수가 아닙니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/15
```

## 코드 읽기

```tsx
import Link from "next/link";
export default function Page() { return <><p><Link href="/lookup/missing">Missing student</Link></p><p><Link href="/go-home">Redirect home</Link></p></>; }
```

[실행 파일](page.tsx)

## 예상 결과

첫 링크는 Student not found, 두 번째는 메인 목차로 이동합니다.

## 주의사항

redirect를 일반 catch로 삼키지 마세요. 코드 실행 흐름을 중단하는 특성을 이해해야 합니다.

## 연습

실제 데이터 조회 결과가 없을 때만 notFound를 호출하세요.

[과정 목차](../README.md)
