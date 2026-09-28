# error.tsx & reset

## 개념과 사용 시점

error.tsx는 경로 하위의 렌더 오류를 잡아 대체 UI와 재시도를 제공합니다. 오류 UI는 클라이언트 컴포넌트입니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/14
```

## 코드 읽기

```tsx
"use client";
import { useState } from "react";
export default function Page() { const [failed, setFailed] = useState(false); if (failed) throw new Error("Practice render error"); return <button onClick={() => setFailed(true)}>Trigger render error</button>; }
```

[실행 파일](page.tsx)

## 예상 결과

버튼을 누르면 오류 경계의 안내와 Retry 버튼이 표시됩니다. 개발 모드에서는 오류 오버레이도 보일 수 있습니다.

## 주의사항

이벤트 핸들러 내부에서 직접 throw한 오류는 렌더 오류 경계와 다르게 처리됩니다. 예상 가능한 검증 오류는 일반 상태로 표현하세요.

## 연습

Retry를 눌러 예제가 복구되는지 확인하세요.

[과정 목차](../README.md)
