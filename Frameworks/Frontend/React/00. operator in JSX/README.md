# JSX의 변수·계산·표현식

## 핵심 개념

React는 JavaScript 라이브러리이므로 계산·비교·함수 문법은 JavaScript를 사용합니다. JSX의 중괄호에는 표현식을 넣습니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
export default function App() {
  const price = 1000;
  const quantity = 3;
  const discount = quantity >= 3 ? 500 : 0;
  const total = price * quantity - discount;
  return <main><h1>가격 계산</h1><p id="result">합계: {total}원</p></main>;
}
```

## 예상 결과

```text
합계: 2500원
```

## 동작 원리와 주의사항

{price * quantity}는 표현식입니다. if·for 선언문 자체를 JSX 중괄호에 넣을 수는 없으므로 컴포넌트 본문에서 계산하거나 조건식·map으로 값을 만듭니다. 이벤트가 없는 이 예제는 useState가 필요 없습니다. 렌더링 중 외부 상태를 변경하지 마세요.



## 직접 확인하기

수량 2·3의 할인 경계값을 확인하세요. 문자열 가격을 받았다면 어디에서 숫자로 바꿀지 설계하세요.

---

---

---

[전체 목차](../README.md) · [다음](../01.%20function%20component/README.md)
