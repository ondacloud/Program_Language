# 제어 입력과 폼

## 핵심 개념

제어 입력은 value 또는 checked를 state와 연결하고 onChange에서 상태를 갱신합니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
import { useState } from "react";

export default function App() {
  const [name, setName] = useState("");
  const [message, setMessage] = useState("");
  function handleSubmit(event) {
    event.preventDefault();
    setMessage(name.trim() ? `Hello ${name.trim()}` : "이름을 입력하세요");
  }
  return <form onSubmit={handleSubmit}>
    <label htmlFor="name">이름</label>
    <input id="name" value={name} onChange={event => setName(event.target.value)} />
    <button type="submit">확인</button><p role="status">{message}</p>
  </form>;
}
```

## 예상 결과

이름을 입력하고 확인하면 인사 문구가 나옵니다. 공백만 입력하면 오류 문구가 표시됩니다.

## 동작 원리와 주의사항

value만 지정하고 onChange를 빠뜨리면 입력할 수 없는 상태가 됩니다. 처음 undefined였다가 문자열로 바뀌는 제어/비제어 전환을 피하려면 초기값을 ""로 두세요. checkbox는 value보다 checked를 제어합니다. label·오류 메시지 연결과 서버 검증도 별개로 필요합니다.

## 직접 확인하기

입력 길이 제한과 오류 설명을 aria-describedby로 연결하세요.

---

---

---

[전체 목차](../README.md) · [이전](../03.%20props%20%26%20children/README.md) · [다음](../05.%20Number%20%26%20object%20spread/README.md)
