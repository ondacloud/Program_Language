# loading.tsx & Suspense

## 개념과 사용 시점

loading.tsx는 경로의 로딩 UI 경계를 구성합니다. Suspense는 비동기 하위 UI가 준비될 때까지 fallback을 표시합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/13
```

## 코드 읽기

```tsx
import { Suspense } from "react";
async function Slow() { await new Promise(resolve => setTimeout(resolve, 500)); return <p>Loaded</p>; }
export default function Page() { return <Suspense fallback={<p>Loading...</p>}><Slow /></Suspense>; }
```

[실행 파일](page.tsx)

## 예상 결과

완료 후 Loaded를 표시합니다. 사전 렌더·prefetch·네트워크에 따라 로딩 문구가 짧거나 보이지 않을 수 있습니다.

## 주의사항

느린 작업을 Suspense 바깥에서 먼저 await하면 해당 경계가 로딩을 표시할 기회가 없습니다.

## 연습

느린 구성 요소를 두 개의 경계로 분리하세요.

[과정 목차](../README.md)
