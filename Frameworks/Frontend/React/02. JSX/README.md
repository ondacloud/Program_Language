# JSX와 표현식

## 핵심 개념

JSX는 JavaScript 안에서 UI 구조를 표현하는 문법이며 빌드 도구가 JavaScript로 변환합니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
export default function App() {
  const name = "Alice";
  const active = true;
  return (
    <>
      <h1 className="title">Hello {name}</h1>
      <p style={{ color: "darkgreen" }}>{active ? "활성" : "비활성"}</p>
      <label htmlFor="query">검색</label><input id="query" />
    </>
  );
}
```

## 예상 결과

Hello Alice와 활성 문구, label이 연결된 입력이 표시됩니다.

## 동작 원리와 주의사항

JSX의 className·htmlFor처럼 HTML 속성과 다른 이름을 확인하세요. 중괄호에는 표현식을 넣으며 if 문 자체를 바로 넣지 않습니다. 여러 형제 요소는 Fragment 등으로 묶고 태그를 닫아야 합니다. 텍스트 값은 기본적으로 이스케이프되지만 dangerouslySetInnerHTML은 별도의 신뢰·정제 정책이 필요합니다.

## 직접 확인하기

active를 false로 바꾸고 조건부 문구가 바뀌는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../01.%20function%20component/README.md) · [다음](../03.%20props%20%26%20children/README.md)
