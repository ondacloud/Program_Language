# this, 클래스, 메서드

## 핵심 개념

일반 함수의 this는 호출 방식에 영향을 받고 화살표 함수는 바깥 this를 사용합니다. class는 객체 동작을 정의하는 문법입니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
class Counter {
  #value = 0;
  increment() { this.#value += 1; return this.#value; }
}
const counter = new Counter();
const increment = counter.increment.bind(counter);
console.log(increment(), increment());
```

## 예상 결과

```text
1 2
```

## 동작 원리와 주의사항

메서드를 꺼내 단독 함수로 호출하면 원래 수신 객체를 잃을 수 있습니다. bind는 this가 연결된 함수를 만듭니다. # 필드는 언어 차원의 private 필드입니다. React 함수 컴포넌트는 class·this 없이도 작성할 수 있지만 JavaScript의 객체 동작을 이해하면 라이브러리 사용에 도움이 됩니다.

## 직접 확인하기

bind를 제거하면 왜 실패하는지 확인한 뒤 복원하세요.

---

---

---

[전체 목차](../README.md) · [이전](../21.%20String%20%26%20JSON/README.md) · [다음](../23.%20try%20%26%20catch%20%26%20throw/README.md)
