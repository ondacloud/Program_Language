# Custom Hook과 로직 재사용

## 핵심 개념

Custom Hook은 use로 시작하는 함수에 Hook 로직을 묶습니다. 호출끼리 상태를 공유하는 것은 아닙니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
import { useState } from "react";

function useToggle(initial = false) {
  const [value, setValue] = useState(initial);
  function toggle() { setValue(previous => !previous); }
  return [value, toggle];
}
function Toggle({ name }) {
  const [enabled, toggle] = useToggle();
  return <button onClick={toggle}>{name}:{enabled ? "on" : "off"}</button>;
}
export default function App() {
  return <main><Toggle name="A" /><Toggle name="B" /></main>;
}
```

## 예상 결과

처음 A:off와 B:off이며 A 버튼을 눌러도 B는 바뀌지 않습니다.

## 동작 원리와 주의사항

재사용하는 것은 상태 관리 로직입니다. 공유 상태가 필요하면 공통 부모나 별도의 저장 구조를 선택합니다. custom Hook 안에서도 호출 순서 규칙을 지켜야 합니다. 작은 계산 함수까지 무조건 use 접두사로 만들지 마세요.

## 직접 확인하기

initial=true인 세 번째 토글을 추가할 수 있도록 초기값을 prop으로 전달하세요.

---

---

---

[전체 목차](../README.md) · [이전](../15.%20useReducer/README.md) · [다음](../17.%20key%20%26%20component%20state/README.md)
