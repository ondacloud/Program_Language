# 함수 전달·이벤트·state 갱신

## 핵심 개념

이벤트 prop에는 함수를 전달합니다. 사용자가 동작했을 때 함수를 실행하여 state를 갱신합니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
import { useState } from "react";
export default function App() {
  const [count, setCount] = useState(0);
  function increment() { setCount(value => value + 1); }
  return <main><h1>이벤트 함수</h1><button onClick={increment}>증가</button><p id="result">{count}</p></main>;
}
```

## 예상 결과

```text
처음 0이며 증가 버튼을 한 번 누르면 1입니다.
```

## 동작 원리와 주의사항

onClick={increment}는 함수를 전달하고 onClick={increment()}는 렌더링 중 호출하므로 다릅니다. state는 직접 count++로 변경하지 않습니다. 이전 값에 의존하면 함수형 갱신을 사용합니다. Hook은 컴포넌트 최상위에서 동일한 순서로 호출합니다.



## 직접 확인하기

버튼 클릭 한 번에 두 번 증가하도록 updater를 두 번 호출하세요. setCount(count + 1)을 두 번 호출할 때와 비교하세요.

---

---

---

[전체 목차](../README.md) · [이전](../09.%20onClick/README.md) · [다음](../11.%20useState/README.md)
