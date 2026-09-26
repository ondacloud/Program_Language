# Promise, async/await, 실행 순서

## 핵심 개념

Promise는 나중에 완료될 결과를 표현하고 async 함수는 항상 Promise를 반환합니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
console.log("start");
const task = Promise.resolve(3).then(value => {
  console.log("then");
  return value * 2;
});
console.log("sync");
console.log(await task);
```

## 예상 결과

```text
start
sync
then
6
```

## 동작 원리와 주의사항

then 콜백은 현재 동기 코드 이후 microtask로 실행됩니다. await는 해당 async 흐름을 멈추지만 전체 프로그램의 모든 작업을 막지는 않습니다. 독립 작업은 Promise.all로 묶을 수 있으나 하나가 거부되어도 다른 작업을 자동 취소하지 않습니다. forEach(async ...)는 완료 대기를 하지 않으므로 for...of 또는 map+Promise.all을 검토하세요.

## 직접 확인하기

then 안에서 throw한 오류를 await 주변 try/catch로 처리하세요.

---

---

---

[전체 목차](../README.md) · [이전](../24.%20import%20%26%20export/README.md) · [다음](../26.%20querySelector%20%26%20addEventListener/README.md)
