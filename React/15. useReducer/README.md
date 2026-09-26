# useReducer로 상태 전이 정리

## 핵심 개념

여러 상태 변경 규칙을 순수 reducer 함수에 모으면 변경 원인을 action으로 표현할 수 있습니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
import { useReducer } from "react";

function reducer(state, action) {
  switch (action.type) {
    case "increment": return { count: state.count + 1 };
    case "reset": return { count: 0 };
    default: throw new Error("Unknown action");
  }
}
export default function App() {
  const [state, dispatch] = useReducer(reducer, { count: 0 });
  return <main><p>{state.count}</p>
    <button onClick={() => dispatch({ type: "increment" })}>증가</button>
    <button onClick={() => dispatch({ type: "reset" })}>초기화</button>
  </main>;
}
```

## 예상 결과

증가 버튼으로 1씩 오르고 초기화 버튼은 0으로 되돌립니다.

## 동작 원리와 주의사항

reducer는 이전 state를 수정하지 않고 새 state를 반환합니다. 네트워크 요청·타이머·난수 생성 등 부작용은 reducer 안에서 실행하지 마세요. useReducer가 자동으로 전역 상태를 만드는 것은 아닙니다. 단순한 값 하나에는 useState가 더 읽기 쉬울 수 있습니다.

## 직접 확인하기

감소 action을 추가하되 0 미만이 되지 않는 규칙을 reducer에 넣으세요.

---

---

---

[전체 목차](../README.md) · [이전](../14.%20createContext%20%26%20useContext/README.md) · [다음](../16.%20custom%20Hook/README.md)
