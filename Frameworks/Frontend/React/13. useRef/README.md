# useRef와 DOM 초점

## 핵심 개념

ref는 렌더링에 직접 사용하지 않는 변경 가능한 값을 보관합니다. DOM 접근이 필요한 경우에도 사용할 수 있습니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
import { useRef } from "react";

export default function App() {
  const inputRef = useRef(null);
  return <main>
    <label>이름<input ref={inputRef} /></label>
    <button onClick={() => inputRef.current?.focus()}>입력으로 이동</button>
  </main>;
}
```

## 예상 결과

버튼을 누르면 입력 칸으로 키보드 초점이 이동합니다.

## 동작 원리와 주의사항

ref.current 변경은 다시 렌더링을 요청하지 않습니다. 화면에 보여 줄 값은 보통 state에 둡니다. DOM은 마운트 이후 존재하므로 이벤트·Effect에서 접근합니다. React가 관리하는 DOM 자식을 수동으로 추가·삭제하면 React의 렌더링과 충돌할 수 있습니다.

## 직접 확인하기

버튼 클릭 후 document.activeElement가 입력인지 개발자 도구로 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../12.%20props%20%26%20callback/README.md) · [다음](../14.%20createContext%20%26%20useContext/README.md)
