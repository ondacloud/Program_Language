# 오류 경계와 자원 정리

## 핵심 개념

비동기 실패는 Promise를 await하거나 catch하여 처리합니다. 오류 코드·원인을 유지하고 정리 책임을 명확히 합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
function parsePort(text) {
  const value = Number(text);
  if (!Number.isInteger(value) || value < 1 || value > 65535) {
    throw new RangeError("invalid port");
  }
  return value;
}
try {
  parsePort("70000");
} catch (cause) {
  const error = new Error("configuration failed", { cause });
  console.log(error.message);
  console.log(error.cause.message);
}
```

## 예상 결과

```text
configuration failed
invalid port
```

## 동작 원리와 주의사항

오류 메시지 문자열보다 안정적인 code나 오류 타입을 활용하세요. 전역 uncaughtException 처리로 정상 운용을 무조건 계속하는 설계는 손상된 상태를 숨길 수 있습니다. 요청별 예상 오류와 프로세스를 종료해야 하는 치명 오류를 구별하세요. finally에서 정리 오류가 원래 오류를 덮는 경우도 고려해야 합니다.



## 직접 확인하기

빈 문자열·소수·음수·65535를 입력해 포트 검증 경계를 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../23.%20fetch%20%26%20AbortController/README.md) · [다음](../25.%20execFile%20%26%20Worker/README.md)
