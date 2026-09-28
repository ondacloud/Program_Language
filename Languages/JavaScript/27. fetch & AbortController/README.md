# Fetch와 응답·취소 처리

## 핵심 개념

fetch는 HTTP 오류 상태만으로 Promise를 거부하지 않으므로 response.ok를 검사해야 합니다.

## 실행 방법

이 폴더에서 `python -m http.server 8000 --bind 127.0.0.1`을 실행한 뒤 브라우저에서 `http://127.0.0.1:8000/example.html`을 여세요. 종료는 Ctrl+C입니다.

[실습 파일](example.html)

## 실행 예제

```html
<!doctype html>
<html lang="ko">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>학습 예제</title>

</head>
<body>
<h1>데이터 읽기</h1><button id="load">불러오기</button><p id="status" role="status">준비</p>
<script type="module">const status = document.querySelector("#status");
let controller;
document.querySelector("#load").addEventListener("click", async () => {
  controller?.abort();
  const current = new AbortController();
  controller = current;
  status.textContent = "불러오는 중";
  try {
    const response = await fetch("./data.json", { signal: current.signal });
    if (!response.ok) throw new Error(`HTTP ${response.status}`);
    const data = await response.json();
    if (typeof data.name !== "string") throw new Error("잘못된 데이터");
    if (!current.signal.aborted) status.textContent = data.name;
  } catch (error) {
    if (error.name !== "AbortError") status.textContent = error.message;
  }
});</script>
</body>
</html>
```

## 예상 결과

HTTP 서버로 실행한 뒤 버튼을 누르면 Alice가 표시됩니다. 파일이 없으면 HTTP 상태 오류가 나타납니다.

## 동작 원리와 주의사항

data.json은 동봉했습니다. file:// 직접 열기는 fetch 정책 때문에 동작하지 않을 수 있습니다. JSON 파싱과 스키마 검증을 구별하세요. CORS는 서버의 교차 출처 허용 정책이며 no-cors로 응답 데이터를 읽을 수 있게 우회하지 못합니다. 새 요청 전에 이전 요청을 취소해 오래된 결과가 UI를 덮는 것을 줄입니다.

## 직접 확인하기

data.json의 name을 숫자로 바꾸고 잘못된 데이터 메시지를 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../26.%20querySelector%20%26%20addEventListener/README.md) · [다음](../28.%20localStorage/README.md)
