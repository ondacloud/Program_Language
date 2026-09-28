# 브라우저 저장소

## 핵심 개념

localStorage는 origin별 문자열 저장소입니다. 저장·읽기는 실패할 수 있고 데이터는 신뢰할 수 없는 입력으로 취급합니다.

## 실행 방법

HTTP 서버로 example.html을 제공하세요. JavaScript Fetch 장의 로컬 서버 실행 방법을 사용할 수 있습니다.

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
<h1>저장소 연습</h1><button id="save">연습 값 저장</button><button id="clear">연습 값 삭제</button><p id="status" role="status">준비</p>
<script type="module">const key = "study-demo-preference";
const status = document.querySelector("#status");
document.querySelector("#save").addEventListener("click", () => {
  try {
    localStorage.setItem(key, JSON.stringify({ theme: "dark" }));
    const value = JSON.parse(localStorage.getItem(key));
    status.textContent = value.theme;
  } catch { status.textContent = "저장소 사용 불가"; }
});
document.querySelector("#clear").addEventListener("click", () => {
  try { localStorage.removeItem(key); status.textContent = "삭제 완료"; }
  catch { status.textContent = "삭제 실패"; }
});</script>
</body>
</html>
```

## 예상 결과

저장하면 dark, 삭제하면 삭제 완료가 표시됩니다. 이 예제는 study-demo-preference 키만 사용합니다.

## 동작 원리와 주의사항

localStorage는 동기 API이며 비밀번호·민감 토큰 보관소로 사용하지 않습니다. sessionStorage는 탭 세션 단위이며 쿠키와는 전송 방식이 다릅니다. origin은 scheme·host·port 조합이므로 포트를 바꾸면 저장소가 달라집니다. 브라우저 정책·용량 제한·손상된 JSON을 처리하세요.

## 직접 확인하기

새로고침 후 기존 값을 읽는 초기화 코드를 추가하고 값의 구조도 검사하세요.

---

---

---

[전체 목차](../README.md) · [이전](../27.%20fetch%20%26%20AbortController/README.md) · [다음](../29.%20assert%20%26%20test/README.md)
