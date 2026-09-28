# searchParams

## 개념과 사용 시점

서버 페이지의 searchParams로 URL 질의 매개변수를 읽습니다. 배열·누락 가능성을 타입과 코드에서 처리합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/11
```

## 코드 읽기

```tsx
export default async function Page({ searchParams }: { searchParams: Promise<{ q?: string | string[] }> }) { const params = await searchParams; const q = typeof params.q === "string" ? params.q : ""; return <><form><label>Search <input name="q" defaultValue={q} /></label><button>Search</button></form><p>Query: {q || "all"}</p></>; }
```

[실행 파일](page.tsx)

## 예상 결과

검색 폼에 Mina를 입력하면 URL에 ?q=Mina가 생기고 Query: Mina가 표시됩니다.

## 주의사항

searchParams를 읽는 경로의 렌더링·캐시 특성을 이해하세요. 사용자 입력은 DB 질의에 바인딩해야 합니다.

## 연습

page 매개변수를 숫자로 검증하세요.

[과정 목차](../README.md)
