# 폼 처리와 이벤트 위임

## 핵심 개념

폼 submit 이벤트에서 입력을 읽고 필요하면 기본 제출을 막습니다. 상위 요소의 이벤트로 여러 항목을 처리할 수 있습니다.

## 실행 방법

example.html을 브라우저에서 열고 테스트 이름을 입력하세요. 외부 서버로 제출하지 않습니다.

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
<h1>인사</h1>
<form id="greeting"><label for="name">이름</label><input id="name" name="name" required><button>확인</button></form>
<p id="result" role="status"></p>
<script type="module">const form = document.querySelector("#greeting");
form.addEventListener("submit", event => {
  event.preventDefault();
  const data = new FormData(form);
  const name = String(data.get("name") ?? "").trim();
  document.querySelector("#result").textContent = name ? `Hello ${name}` : "이름을 입력하세요";
});</script>
</body>
</html>
```

## 예상 결과

이름 Alice를 입력하고 확인하면 페이지 이동 없이 Hello Alice가 표시됩니다.

## 동작 원리와 주의사항

preventDefault는 기본 동작을 막고 stopPropagation은 전파를 막으므로 역할이 다릅니다. event.target은 발생 지점, currentTarget은 리스너가 붙은 요소입니다. 이벤트 위임은 버블링을 이용하며 필요하면 closest와 포함 범위 검사를 사용합니다. 공백 문자열도 별도 검증하세요.

## 직접 확인하기

동적으로 추가한 버튼을 목록 부모의 클릭 리스너로 처리하는 방식으로 확장하세요.

---

---

---

[전체 목차](../README.md) · [이전](../01.%20console.log/README.md) · [다음](../03.%20if%20%26%20else/README.md)
