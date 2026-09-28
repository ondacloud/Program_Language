# 입력 타입 변환과 객체 복사

## 핵심 개념

HTML input의 value는 문자열입니다. 숫자 계산 전에 변환하고 객체 state는 새 객체로 교체합니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
import { useState } from "react";
export default function App() {
  const [form, setForm] = useState({ quantity: "2" });
  const amount = Number(form.quantity);
  const valid = form.quantity.trim() !== "" && Number.isInteger(amount) && amount >= 0;
  return <main><h1>수량 입력</h1>
    <label>수량 <input value={form.quantity} onChange={event => setForm({ ...form, quantity: event.target.value })} /></label>
    <p id="result">{valid ? `${amount * 1000}원` : "수량을 확인하세요"}</p>
  </main>;
}
```

## 예상 결과

```text
초기에는 2000원, 수량을 3으로 바꾸면 3000원입니다. 빈 값·음수·문자는 오류 안내입니다.
```

## 동작 원리와 주의사항

입력 중 빈 문자열도 표현해야 하므로 원본 문자열을 state로 유지하고 계산값을 파생합니다. {...form}은 얕은 복사이며 중첩 객체까지 깊게 복사하지 않습니다. setForm은 객체 속성을 자동 병합하지 않으므로 유지할 속성을 복사해야 합니다.



## 직접 확인하기

빈 문자열·0·-1·abc를 넣어 결과를 확인하세요. 다른 필드를 추가한 뒤 수량 변경에도 유지되는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../04.%20input%20%26%20onChange/README.md) · [다음](../06.%20if%20%26%20conditional%20rendering/README.md)
