# HTTP 클라이언트와 취소

## 핵심 개념

fetch는 응답 객체를 반환하며 네트워크 실패와 HTTP 오류 상태를 구별합니다. AbortSignal로 요청 수명을 제한할 수 있습니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
const controller = new AbortController();
controller.abort();
try {
  await fetch("data:application/json,%7B%22ok%22%3Atrue%7D", {
    signal: controller.signal
  });
} catch (error) {
  console.log(error.name);
}
const response = await fetch("data:application/json,%7B%22ok%22%3Atrue%7D");
if (!response.ok) throw new Error(`HTTP ${response.status}`);
console.log((await response.json()).ok);
```

## 예상 결과

```text
AbortError
true
```

## 동작 원리와 주의사항

외부 네트워크 없이 재현하기 위해 data URL을 사용했습니다. 실제 HTTP 호출에서는 AbortSignal.timeout(ms)나 호출자 취소 신호를 검토합니다. HTTP 404/500을 자동 예외로 생각하지 마세요. 재시도는 무조건 반복하지 말고 멱등성·최대 횟수·지연을 함께 설계합니다. 요청 취소가 서버 작업의 롤백을 의미하지는 않습니다.



## 직접 확인하기

HTTP 서버 장의 /missing을 호출해 response.ok가 false인 경우를 처리하세요.

---

---

---

[전체 목차](../README.md) · [이전](../22.%20http.createServer/README.md) · [다음](../24.%20Error%20%26%20cause/README.md)
