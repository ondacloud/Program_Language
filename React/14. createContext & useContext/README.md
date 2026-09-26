# Context로 값 전달

## 핵심 개념

Context는 깊은 하위 컴포넌트가 공통 값을 읽도록 전달 경로를 줄입니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
import { createContext, useContext, useState } from "react";

const ThemeContext = createContext("light");
function Preview() {
  const theme = useContext(ThemeContext);
  return <p>theme={theme}</p>;
}
export default function App() {
  const [theme, setTheme] = useState("light");
  return <ThemeContext.Provider value={theme}>
    <button onClick={() => setTheme(value => value === "light" ? "dark" : "light")}>테마 전환</button>
    <Preview />
  </ThemeContext.Provider>;
}
```

## 예상 결과

버튼을 누르면 theme=light에서 theme=dark로 바뀝니다.

## 동작 원리와 주의사항

Context 자체가 상태 저장소인 것은 아닙니다. 위 예제의 상태는 App의 useState가 소유합니다. 기본값은 일치하는 Provider가 없을 때 사용합니다. Provider 값의 참조가 바뀌면 소비자 업데이트에 영향을 줄 수 있으므로 거대한 변경 객체 하나에 모든 상태를 넣는 설계를 주의하세요.

## 직접 확인하기

Preview를 중간 컴포넌트 아래로 옮겨도 별도 props 전달 없이 값을 읽는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../13.%20useRef/README.md) · [다음](../15.%20useReducer/README.md)
