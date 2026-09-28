# 상태 끌어올리기

## 핵심 개념

여러 컴포넌트가 같은 상태를 공유하면 가장 가까운 공통 부모가 상태의 소유자가 되게 합니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
import { useState } from "react";

function Editor({ value, onChange }) {
  return <label>공유 이름<input value={value} onChange={event => onChange(event.target.value)} /></label>;
}

export default function App() {
  const [name, setName] = useState("Alice");
  return <main><Editor value={name} onChange={setName} /><p>Hello {name}</p></main>;
}
```

## 예상 결과

입력을 Bob으로 바꾸면 부모의 인사 문구도 Hello Bob으로 바뀝니다.

## 동작 원리와 주의사항

같은 의미의 상태를 부모·자식에 중복 보관하면 동기화가 필요해집니다. props에서 계산 가능한 값은 렌더링 중 계산하고 별도 state·Effect로 복제하지 않는 것이 보통 간단합니다. 모든 상태를 최상위로 올리지 말고 필요한 공유 범위에 두세요.

## 직접 확인하기

같은 name을 보여 주는 두 번째 자식을 추가하세요.

---

---

---

[전체 목차](../README.md) · [이전](../11.%20useState/README.md) · [다음](../13.%20useRef/README.md)
