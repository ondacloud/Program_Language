# use server & form action

## 개념과 사용 시점

Server Action으로 폼 제출을 서버 함수에 연결합니다. FormData 값은 서버에서 다시 검사합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/17
```

## 코드 읽기

```tsx
import { greet } from "./actions";
export default function Page() { return <form action={greet}><label>Name <input name="name" required maxLength={30} /></label><button>Greet on server</button><p>결과는 검색 예제의 Query에 표시됩니다.</p></form>; }
```

[실행 파일](page.tsx)

## 예상 결과

Mina를 제출하면 서버 검증 뒤 /lessons/11?q=Mina로 이동합니다. 이 예제는 데이터를 영구 저장하지 않습니다.

## 주의사항

브라우저 required만 믿지 마세요. 실제 변경 작업에는 서버 인증·권한 검사가 필요합니다.

## 연습

공백뿐인 이름을 제출하여 서버 검증을 확인하세요.

[과정 목차](../README.md)
