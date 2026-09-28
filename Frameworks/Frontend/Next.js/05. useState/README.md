# useState

## 개념과 사용 시점

useState는 렌더 사이에 유지되는 클라이언트 상태를 만듭니다. 이전 값을 기반으로 갱신할 때 함수형 setter를 사용합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/05
```

## 코드 읽기

```tsx
"use client";
import { useState } from "react";
export default function Page() { const [count, setCount] = useState(0); return <button onClick={() => setCount(n => n + 1)}>Count: {count}</button>; }
```

[실행 파일](page.tsx)

## 예상 결과

클릭마다 숫자가 증가합니다.

## 주의사항

상태 객체를 직접 변경하지 말고 새 값을 setter에 전달하세요. 상태 변경은 다음 렌더에서 반영됩니다.

## 연습

한 번 클릭에 2를 더해 보세요.

[과정 목차](../README.md)
