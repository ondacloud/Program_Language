# 컴포넌트 정체성과 상태 보존

## 핵심 개념

React는 렌더 트리의 위치·타입·key에 따라 상태를 연결합니다. key를 바꾸면 해당 컴포넌트의 상태를 새로 만들 수 있습니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
import { useState } from "react";

function Draft({ user }) {
  const [text, setText] = useState("");
  return <label>{user}의 메모<input value={text} onChange={event => setText(event.target.value)} /></label>;
}
export default function App() {
  const [user, setUser] = useState("Alice");
  return <main>
    <button onClick={() => setUser(value => value === "Alice" ? "Bob" : "Alice")}>사용자 변경</button>
    <Draft key={user} user={user} />
  </main>;
}
```

## 예상 결과

Alice의 메모에 입력한 뒤 사용자를 바꾸면 Bob의 입력은 빈 값으로 시작합니다.

## 동작 원리와 주의사항

key 변경을 임의의 렌더링 강제 도구로 쓰지 말고 의도적인 상태 초기화에 사용하세요. 부모 함수 안에 자식 컴포넌트 함수를 정의하면 렌더마다 새 타입으로 인식되어 상태가 재설정될 수 있습니다. 목록 key는 형제 사이에서 고유하면 됩니다.

## 직접 확인하기

key를 제거했을 때 입력 상태가 다음 사용자에게 남는지 비교하세요.

---

---

---

[전체 목차](../README.md) · [이전](../16.%20custom%20Hook/README.md) · [다음](../18.%20useEffect/README.md)
