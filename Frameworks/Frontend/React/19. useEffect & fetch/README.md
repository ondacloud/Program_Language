# 비동기 데이터와 오래된 결과

## 핵심 개념

로딩·성공·실패 상태를 구분하고 이전 요청 결과가 새 선택의 화면을 덮지 않게 처리합니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
import { useEffect, useState } from "react";

function loadUser(id) {
  return new Promise(resolve => setTimeout(() => resolve({ name: id === "1" ? "Alice" : "Bob" }), 50));
}

export default function App() {
  const [id, setId] = useState("1");
  const [result, setResult] = useState({ status: "loading", name: "" });
  useEffect(() => {
    let ignore = false;
    setResult({ status: "loading", name: "" });
    loadUser(id).then(user => {
      if (!ignore) setResult({ status: "success", name: user.name });
    }).catch(() => {
      if (!ignore) setResult({ status: "error", name: "" });
    });
    return () => { ignore = true; };
  }, [id]);
  return <main>
    <label>사용자<select value={id} onChange={event => setId(event.target.value)}><option value="1">1</option><option value="2">2</option></select></label>
    <p role="status">{result.status === "success" ? result.name : result.status}</p>
  </main>;
}
```

## 예상 결과

처음 loading 후 Alice가 나타나고 사용자 2를 선택하면 Bob이 나타납니다. 실제 네트워크 대신 지연 Promise를 사용합니다.

## 동작 원리와 주의사항

ignore는 결과 적용만 막으며 작업 자체를 취소하지 않습니다. 실제 fetch에는 AbortController와 response.ok 확인을 추가할 수 있습니다. 캐시·중복 요청·서버 렌더링이 필요하면 프레임워크의 데이터 로딩이나 전용 라이브러리를 검토하세요. Effect를 async 함수로 직접 선언하면 정리 함수 대신 Promise를 반환하므로 피합니다.

## 직접 확인하기

loadUser가 실패하게 바꾸어 error 상태를 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../18.%20useEffect/README.md) · [다음](../20.%20memo%20%26%20useMemo%20%26%20useCallback/README.md)
