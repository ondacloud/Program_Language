# map & key

## 개념과 사용 시점

배열을 map으로 JSX 목록으로 변환합니다. key는 React가 항목의 동일성을 판단하는 기준입니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/04
```

## 코드 읽기

```tsx
export default function Page() { const students = [{ id: 1, name: "Mina" }, { id: 2, name: "Jin" }]; return <ul>{students.map(s => <li key={s.id}>{s.name}</li>)}</ul>; }
```

[실행 파일](page.tsx)

## 예상 결과

Mina·Jin 목록

## 주의사항

목록 순서가 바뀌면 인덱스 key로 입력 상태가 다른 항목에 붙을 수 있습니다. 안정적인 id를 사용하세요.

## 연습

점수로 filter한 뒤 목록을 출력하세요.

[과정 목차](../README.md)
