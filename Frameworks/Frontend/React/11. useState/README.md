# useState와 상태 스냅샷

## 핵심 개념

상태 setter는 다음 렌더링을 요청합니다. 현재 핸들러가 가진 상태 값 자체를 즉시 바꾸는 것은 아닙니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
import { useState } from "react";

export default function App() {
  const [count, setCount] = useState(0);
  function addThree() {
    setCount(value => value + 1);
    setCount(value => value + 1);
    setCount(value => value + 1);
  }
  return <main><p role="status">{count}</p><button onClick={addThree}>3 증가</button></main>;
}
```

## 예상 결과

처음 0이며 버튼 한 번에 3이 됩니다.

## 동작 원리와 주의사항

이전 상태로 다음 상태를 계산할 때 함수형 updater를 사용합니다. setCount(count+1)를 같은 핸들러에서 세 번 호출하면 같은 스냅샷을 읽는다는 점을 비교하세요. Hooks는 컴포넌트나 custom Hook의 최상위에서 같은 순서로 호출하며 조건·반복 안에 넣지 않습니다.

## 직접 확인하기

setCount(count+1) 세 번으로 바꾸어 결과 차이를 관찰하고 복구하세요.

---

---

---

[전체 목차](../README.md) · [이전](../10.%20useState%20%26%20updater/README.md) · [다음](../12.%20props%20%26%20callback/README.md)
