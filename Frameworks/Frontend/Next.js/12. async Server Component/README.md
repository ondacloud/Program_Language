# async Server Component

## 개념과 사용 시점

서버 컴포넌트는 비동기 데이터 작업을 await하고 결과를 렌더할 수 있습니다. 이 예제는 외부 서비스 없이 로컬 Promise로 동작합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/12
```

## 코드 읽기

```tsx
async function loadStudents() { return [{ id: 1, name: "Mina" }, { id: 2, name: "Jin" }]; }
export default async function Page() { const students = await loadStudents(); return <ul>{students.map(s => <li key={s.id}>{s.name}</li>)}</ul>; }
```

[실행 파일](page.tsx)

## 예상 결과

Mina·Jin 목록

## 주의사항

실제 fetch에는 오류 상태 검사와 명시적 캐시 정책이 필요합니다. Next.js 버전별 캐시 기본값을 이전 튜토리얼에서 추정하지 마세요.

## 연습

데이터 없음 상태를 처리하세요.

[과정 목차](../README.md)
