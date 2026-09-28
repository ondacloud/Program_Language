# use client & onChange

## 개념과 사용 시점

입력 이벤트와 useState가 필요한 컴포넌트에는 use client 경계를 선언합니다. onChange에서 입력값을 상태로 저장합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/02
```

## 코드 읽기

```tsx
"use client";
import { useState } from "react";
export default function Page() { const [name, setName] = useState(""); return <><label>Name <input value={name} onChange={e => setName(e.target.value)} /></label><p>Hello, {name.trim() || "guest"}</p></>; }
```

[실행 파일](page.tsx)

## 예상 결과

입력에 따라 인사말이 바뀝니다.

## 주의사항

use client 아래에서 import되는 모듈도 클라이언트 번들 경계에 들어갈 수 있습니다. 서버 전용 비밀값을 가져오지 마세요.

## 연습

빈 입력에는 안내 문구를 표시하세요.

[과정 목차](../README.md)
