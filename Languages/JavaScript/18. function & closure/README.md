# 함수와 클로저

## 핵심 개념

함수는 값으로 전달할 수 있으며 클로저는 생성된 바깥 범위의 변수에 접근합니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
function makeCounter(start = 0) {
  let count = start;
  return () => ++count;
}
const next = makeCounter();
console.log(next(), next());
const add = (...values) => values.reduce((sum, value) => sum + value, 0);
console.log(add(1, 2, 3));
```

## 예상 결과

```text
1 2
6
```

## 동작 원리와 주의사항

return을 생략한 일반 함수는 undefined를 반환합니다. 화살표 함수의 중괄호 본문은 명시적인 return이 필요합니다. 객체 리터럴을 바로 반환할 때는 ()로 감쌉니다. 함수는 객체 참조값을 전달받으므로 객체 내부 변경과 매개변수 재대입을 구분해야 합니다.

## 직접 확인하기

두 카운터를 따로 만들어 상태가 독립적인지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../17.%20for%20of%20%26%20switch/README.md) · [다음](../19.%20Object%20%26%20destructuring/README.md)
