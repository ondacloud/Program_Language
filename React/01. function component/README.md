# React와 함수 컴포넌트

## 핵심 개념

React는 상태를 바탕으로 사용자 인터페이스를 구성하는 JavaScript 라이브러리입니다. 컴포넌트는 UI 조각을 반환하는 함수로 작성할 수 있습니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
function Greeting() {
  return <p>Hello React</p>;
}

export default function App() {
  return <main><h1>첫 컴포넌트</h1><Greeting /></main>;
}
```

## 예상 결과

첫 컴포넌트 제목과 Hello React 문단이 보입니다.

## 동작 원리와 주의사항

컴포넌트 이름은 대문자로 시작해 HTML 태그와 구별합니다. 렌더링 중에는 props·state로 UI를 계산하고 네트워크 요청이나 전역 변경 같은 부작용을 실행하지 않습니다. React는 라우팅·빌드·서버 렌더링을 모두 포함하는 프레임워크와 구별됩니다. 학습 프로젝트는 Vite 기반 클라이언트 앱입니다.

## 직접 확인하기

Greeting을 두 번 배치하고 각각 독립된 UI 위치를 가지는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../00.%20operator%20in%20JSX/README.md) · [다음](../02.%20JSX/README.md)
