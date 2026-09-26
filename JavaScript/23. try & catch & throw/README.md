# 예외 처리와 사용자 정의 오류

## 핵심 개념

throw로 실패를 알리고 try/catch로 처리 가능한 범위에서 대응합니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
function divide(a, b) {
  if (b === 0) throw new RangeError("zero divisor");
  return a / b;
}
try {
  console.log(divide(10, 0));
} catch (error) {
  console.log(error.name, error.message);
} finally {
  console.log("cleanup");
}
```

## 예상 결과

```text
RangeError zero divisor
cleanup
```

## 동작 원리와 주의사항

실패를 조용히 숨기는 빈 catch를 피합니다. finally에서 return하면 기존 반환·예외를 덮을 수 있습니다. 비동기 Promise 오류는 해당 Promise를 await하거나 catch해야 하며 나중에 실행되는 콜백의 예외를 바깥 동기 try가 잡지 못할 수 있습니다.

## 직접 확인하기

분모 2의 정상 경로에서도 finally가 실행되는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../22.%20this%20%26%20class/README.md) · [다음](../24.%20import%20%26%20export/README.md)
