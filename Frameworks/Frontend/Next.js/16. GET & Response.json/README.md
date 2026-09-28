# GET & Response.json

## 개념과 사용 시점

route.ts의 GET 같은 HTTP 메서드 함수로 Route Handler를 만듭니다. 페이지 JSX와 HTTP 응답의 역할을 구분합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Next.js 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# http://localhost:3000/lessons/16
```

## 코드 읽기

```tsx
export default function Page() { return <a href="/api/students">Read JSON response</a>; }
```

[실행 파일](page.tsx)

## 예상 결과

/api/students는 students 배열의 JSON 응답을 반환합니다.

## 주의사항

실제 코드는 app/api/students/route.ts입니다. 입력 검증·인증·권한 확인은 API 경계에서도 필요합니다.

## 연습

POST를 추가할 경우 요청 본문 타입을 런타임에 검사하세요.

[과정 목차](../README.md)
