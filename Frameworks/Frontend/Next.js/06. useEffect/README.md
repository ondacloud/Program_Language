# useEffect

## 개념과 사용 시점

useEffect는 브라우저의 외부 시스템과 상태를 동기화합니다. 타이머·구독은 cleanup에서 정리합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/06
```

## 코드 읽기

```tsx
"use client";
import { useEffect, useState } from "react";
export default function Page() { const [seconds, setSeconds] = useState(0); useEffect(() => { const timer = setInterval(() => setSeconds(n => n + 1), 1000); return () => clearInterval(timer); }, []); return <p>{seconds} seconds</p>; }
```

[실행 파일](page.tsx)

## 예상 결과

약 1초마다 숫자가 증가합니다.

## 주의사항

개발 모드에서 효과 setup과 cleanup이 추가 실행될 수 있습니다. 파생값 계산에는 보통 effect가 필요하지 않습니다.

## 연습

일시 정지 기능을 추가하고 의존성 배열을 설명하세요.

[과정 목차](../README.md)
