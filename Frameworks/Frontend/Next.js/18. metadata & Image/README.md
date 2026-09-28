# metadata & Image

## 개념과 사용 시점

metadata는 문서 제목 같은 페이지 정보를 정의하고 next/image는 이미지 표시와 최적화를 지원합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/18
```

## 코드 읽기

```tsx
import Image from "next/image";
export const metadata = { title: "Image lesson" };
export default function Page() { return <Image src="/course.svg" alt="Blue course card" width={240} height={120} unoptimized />; }
```

[실행 파일](page.tsx)

## 예상 결과

파란 카드 이미지와 브라우저 탭 제목 Image lesson이 표시됩니다.

## 주의사항

예제는 로컬 SVG라 unoptimized를 명시했습니다. 원격 이미지는 허용 호스트 설정과 적절한 크기·대체 텍스트를 제공하세요.

## 연습

페이지마다 의미 있는 제목과 대체 텍스트를 작성하세요.

[과정 목차](../README.md)
