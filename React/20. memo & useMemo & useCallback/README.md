# 렌더링과 메모이제이션

## 핵심 개념

정확한 동작을 먼저 확보한 뒤 측정된 병목을 최적화합니다. useMemo는 계산 결과를 의존성 기준으로 재사용하는 도구입니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
import { useMemo, useState } from "react";

const lessons = ["HTML", "CSS", "JavaScript", "React"];
export default function App() {
  const [query, setQuery] = useState("");
  const filtered = useMemo(() => lessons.filter(name => name.toLowerCase().includes(query.toLowerCase())), [query]);
  return <main><label>검색<input value={query} onChange={event => setQuery(event.target.value)} /></label>
    <ul>{filtered.map(name => <li key={name}>{name}</li>)}</ul>
  </main>;
}
```

## 예상 결과

검색어 react를 입력하면 React만 남습니다.

## 동작 원리와 주의사항

이 작은 배열에는 useMemo가 필수는 아니며 문법 설명용입니다. useMemo·useCallback·memo는 정확성을 보장하는 상태 저장 수단이 아닙니다. 객체·함수 참조와 의존성 안정성을 이해하고 Profiler로 실제 효과를 확인하세요. React Compiler 사용 여부에 따라 수동 메모이제이션 필요성도 달라질 수 있습니다.

## 직접 확인하기

useMemo를 제거해도 결과는 동일해야 합니다. 큰 데이터에서만 성능 차이를 측정하세요.

---

---

---

[전체 목차](../README.md) · [이전](../19.%20useEffect%20%26%20fetch/README.md) · [다음](../21.%20test%20%26%20aria/README.md)
