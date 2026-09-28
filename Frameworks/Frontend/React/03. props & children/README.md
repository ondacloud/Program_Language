# Props와 children

## 핵심 개념

부모는 props로 데이터를 전달하고 자식은 전달받은 값을 읽어 UI를 계산합니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
function Card({ title, children }) {
  return <section><h2>{title}</h2>{children}</section>;
}

function Greeting({ name = "guest" }) {
  return <p>Hello {name}</p>;
}

export default function App() {
  return <Card title="사용자"><Greeting name="Alice" /><Greeting /></Card>;
}
```

## 예상 결과

사용자 제목 아래 Hello Alice와 Hello guest가 표시됩니다.

## 동작 원리와 주의사항

props는 읽기 전용으로 취급합니다. 자식이 부모의 객체를 직접 수정하지 말고 이벤트 콜백으로 변경 의도를 전달하세요. children은 태그 사이 콘텐츠이며 구성 패턴에 유용합니다. 기본 매개변수는 undefined에 적용되고 null에는 적용되지 않습니다.

## 직접 확인하기

Card 안에 버튼을 children으로 넣어 재사용되는 외곽 구조를 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../02.%20JSX/README.md) · [다음](../04.%20input%20%26%20onChange/README.md)
