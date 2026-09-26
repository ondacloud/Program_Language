# if·삼항·&&와 조건부 표시

## 핵심 개념

조건부 렌더링은 JavaScript 조건으로 어떤 JSX 값을 반환할지 선택합니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
export default function App() {
  const loggedIn = false;
  const count = 0;
  return <main><h1>조건부 표시</h1>
    <p id="status">{loggedIn ? "환영합니다" : "로그인이 필요합니다"}</p>
    {count > 0 && <p>알림 {count}개</p>}
  </main>;
}
```

## 예상 결과

```text
로그인이 필요합니다. 알림 문장은 표시되지 않습니다.
```

## 동작 원리와 주의사항

React는 false·null·undefined를 화면 내용으로 표시하지 않지만 숫자 0은 표시합니다. count && <p>는 count가 0이면 0이 나올 수 있어 count > 0을 사용합니다. 컴포넌트에서 return null로 아무것도 표시하지 않을 수 있습니다. Hook 호출을 조건문 안으로 옮기면 안 됩니다.



## 직접 확인하기

loggedIn과 count를 바꾸어 네 가지 경우를 확인하세요. 같은 결과를 if 조기 반환으로 작성하세요.

---

---

---

[전체 목차](../README.md) · [이전](../05.%20Number%20%26%20object%20spread/README.md) · [다음](../07.%20map%20%26%20filter/README.md)
