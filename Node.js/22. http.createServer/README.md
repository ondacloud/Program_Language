# 표준 HTTP 서버와 상태 코드

## 핵심 개념

node:http는 저수준 HTTP 서버를 제공합니다. 메서드·경로·상태·콘텐츠 타입을 명시해야 합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
import { createServer } from "node:http";

const server = createServer((request, response) => {
  const url = new URL(request.url ?? "/", "http://localhost");
  if (request.method === "GET" && url.pathname === "/health") {
    response.writeHead(200, { "content-type": "application/json; charset=utf-8" });
    response.end(JSON.stringify({ ok: true }));
    return;
  }
  response.writeHead(404, { "content-type": "text/plain; charset=utf-8" });
  response.end("not found");
});

await new Promise((resolve, reject) => {
  server.once("error", reject);
  server.listen(0, "127.0.0.1", resolve);
});
try {
  const response = await fetch(`http://127.0.0.1:${server.address().port}/health`);
  console.log(response.status, await response.text());
} finally {
  await new Promise((resolve, reject) => server.close(error => error ? reject(error) : resolve()));
}
```

## 예상 결과

```text
200 {"ok":true}
```

## 동작 원리와 주의사항

포트 0은 사용 가능한 임시 포트를 선택합니다. 예제는 로컬 주소에서 자체 요청 한 번 후 서버를 닫아 계속 실행되지 않습니다. request 본문은 스트림이므로 크기 제한·타임아웃·JSON 검증을 별도로 구현해야 합니다. response.end를 빠뜨리면 응답이 끝나지 않습니다. 이 예제만으로 인증·TLS·운영 보안이 구현되지는 않습니다.



## 직접 확인하기

/missing 경로에 요청하면 404와 not found가 반환되는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../21.%20EventEmitter/README.md) · [다음](../23.%20fetch%20%26%20AbortController/README.md)
