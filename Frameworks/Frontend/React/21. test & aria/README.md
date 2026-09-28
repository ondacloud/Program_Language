# 컴포넌트 검증과 접근성

## 핵심 개념

사용자가 보는 문구·역할·입력·클릭 결과를 기준으로 확인하면 내부 구현 변경에 덜 취약합니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
import { useState } from "react";

export default function App() {
  const [accepted, setAccepted] = useState(false);
  return <main>
    <label><input type="checkbox" checked={accepted} onChange={event => setAccepted(event.target.checked)} />약관 동의</label>
    <button disabled={!accepted}>계속</button>
    <p role="status">{accepted ? "진행 가능" : "동의 필요"}</p>
  </main>;
}
```

## 예상 결과

초기에는 계속 버튼이 비활성화됩니다. 체크하면 버튼이 활성화되고 진행 가능이 표시됩니다.

## 동작 원리와 주의사항

최소 확인 항목은 초기 상태, 클릭 후 상태, 되돌리기, 키보드 탐색입니다. Testing Library 같은 도구를 도입하면 역할·접근 가능한 이름으로 요소를 찾고 이벤트 결과를 검사할 수 있습니다. 구체적인 테스트 runner와 DOM 환경 의존성은 별도 설치·설정해야 하며 이 장의 App만으로 테스트 라이브러리가 설치되지는 않습니다.

## 직접 확인하기

Space 키로 체크박스를 바꾸고 버튼의 disabled 속성이 바뀌는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../20.%20memo%20%26%20useMemo%20%26%20useCallback/README.md) · [다음](../22.%20createRoot%20%26%20StrictMode/README.md)
