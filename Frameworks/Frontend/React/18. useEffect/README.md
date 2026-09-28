# useEffect와 정리 함수

## 핵심 개념

Effect는 외부 시스템과 동기화할 때 사용합니다. 설정과 정리는 짝을 이루고 의존성은 실제 사용한 반응형 값에 맞춥니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
import { useEffect, useState } from "react";

export default function App() {
  const [seconds, setSeconds] = useState(0);
  useEffect(() => {
    const timer = setInterval(() => setSeconds(value => value + 1), 1000);
    return () => clearInterval(timer);
  }, []);
  return <p role="status">seconds={seconds}</p>;
}
```

## 예상 결과

처음 seconds=0이고 대략 1초마다 증가합니다. 실제 간격은 브라우저 스케줄링에 따라 달라질 수 있습니다.

## 동작 원리와 주의사항

개발 StrictMode에서는 설정·정리·설정 검사를 추가로 볼 수 있습니다. 중복 실행을 숨기기보다 정리 함수가 설정을 되돌리도록 만드세요. 빈 의존성 배열은 컴포넌트 전체 앱 수명 동안 정확히 한 번만 실행된다는 보장이 아닙니다. 상태로부터 도출되는 계산이나 클릭 후 요청은 Effect가 필요 없는 경우가 많습니다.

## 직접 확인하기

컴포넌트를 숨겼다가 다시 표시할 때 이전 타이머가 정리되는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../17.%20key%20%26%20component%20state/README.md) · [다음](../19.%20useEffect%20%26%20fetch/README.md)
