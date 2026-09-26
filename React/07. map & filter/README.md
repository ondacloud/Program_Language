# 배열·객체·map·filter로 목록 만들기

## 핵심 개념

목록 UI는 데이터를 선택하고 각 값을 JSX로 변환해서 만듭니다. 반복마다 안정적인 key가 필요합니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
export default function App() {
  const items = [{ id: "a", name: "사과", stock: 2 }, { id: "b", name: "배", stock: 0 }];
  return <main><h1>재고 목록</h1><ul>
    {items.filter(item => item.stock > 0).map(({ id, name, stock }) =>
      <li key={id}>{name}: {stock}</li>)}
  </ul></main>;
}
```

## 예상 결과

```text
사과: 2 항목 하나가 표시됩니다.
```

## 동작 원리와 주의사항

filter는 조건에 맞는 새 배열, map은 변환한 새 배열을 반환합니다. key는 형제 사이에서 고유하고 삽입·삭제·정렬에도 안정적이어야 합니다. 데이터 순서가 바뀌는 목록에 배열 인덱스나 매 렌더링 난수를 key로 쓰지 마세요. key는 일반 prop처럼 자식에서 읽을 수 없습니다.



## 직접 확인하기

재고를 0·1로 바꾸고 항목을 추가하세요. map 콜백에 중괄호를 쓰면 return이 왜 필요한지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../06.%20if%20%26%20conditional%20rendering/README.md) · [다음](../08.%20key%20%26%20array%20spread/README.md)
