# 배열 상태와 key

## 핵심 개념

배열·객체 상태는 직접 수정하지 않고 새 값을 만들어 setter로 전달합니다. key는 형제 목록 항목의 정체성을 표현합니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
import { useState } from "react";

export default function App() {
  const [items, setItems] = useState([
    { id: 1, text: "HTML", done: false },
    { id: 2, text: "React", done: false }
  ]);
  function toggle(id) {
    setItems(previous => previous.map(item => item.id === id ? { ...item, done: !item.done } : item));
  }
  return <ul>{items.map(item => <li key={item.id}>
    <label><input type="checkbox" checked={item.done} onChange={() => toggle(item.id)} />{item.text}</label>
    <span>{item.done ? "완료" : "대기"}</span>
  </li>)}</ul>;
}
```

## 예상 결과

체크하면 해당 항목만 완료로 바뀝니다.

## 동작 원리와 주의사항

push·sort 등으로 원본 상태를 직접 바꾸지 마세요. 바뀌는 객체 수준도 복사해야 합니다. key는 렌더링 중 생성하는 난수 대신 데이터의 안정적인 ID를 사용합니다. 추가·삭제·정렬되는 목록에서 배열 인덱스 key는 상태가 엉뚱한 항목에 연결될 수 있습니다. key는 일반 prop으로 자식에게 전달되지 않습니다.

## 직접 확인하기

항목을 삭제하는 버튼을 filter로 구현하세요.

---

---

---

[전체 목차](../README.md) · [이전](../07.%20map%20%26%20filter/README.md) · [다음](../09.%20onClick/README.md)
