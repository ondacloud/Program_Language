# 이벤트 핸들러

## 핵심 개념

사용자의 클릭·입력 같은 동작은 이벤트 핸들러에서 처리합니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
import { useState } from "react";

export default function App() {
  const [message, setMessage] = useState("준비");
  function handleClick() { setMessage("클릭 완료"); }
  return <main><button type="button" onClick={handleClick}>실행</button><p role="status">{message}</p></main>;
}
```

## 예상 결과

실행 버튼을 누르면 준비가 클릭 완료로 바뀝니다.

## 동작 원리와 주의사항

onClick={handleClick}는 함수를 전달하고 onClick={handleClick()}는 렌더링 중 호출합니다. 인수를 전달할 때는 () => handleClick(value)를 사용할 수 있습니다. 이벤트가 처리하는 사용자 동작과 렌더링 결과로 외부 시스템을 동기화하는 Effect를 구분하세요.

## 직접 확인하기

다른 버튼을 추가해 message를 준비로 되돌리세요.

---

---

---

[전체 목차](../README.md) · [이전](../08.%20key%20%26%20array%20spread/README.md) · [다음](../10.%20useState%20%26%20updater/README.md)
