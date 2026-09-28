# Link

## 개념과 사용 시점

next/link의 Link는 앱 내부 경로 이동을 표현합니다. a처럼 목적지를 제공하면서 클라이언트 탐색을 지원합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/08
```

## 코드 읽기

```tsx
import Link from "next/link";
export default function Page() { return <Link href="/lessons/00">Open operator lesson</Link>; }
```

[실행 파일](page.tsx)

## 예상 결과

링크를 누르면 00번 예제로 이동합니다.

## 주의사항

버튼 동작과 링크 탐색을 구분하세요. 외부 URL이나 다운로드에는 일반 a의 의미도 검토하세요.

## 연습

메인 목차로 돌아가는 링크를 추가하세요.

[과정 목차](../README.md)
