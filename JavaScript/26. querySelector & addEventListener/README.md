# DOM과 이벤트

## 핵심 개념

DOM API로 요소를 선택하고 이벤트 리스너로 사용자 동작에 반응합니다.

## 실행 방법

example.html을 브라우저에서 여세요. document와 DOM 이벤트는 브라우저 API입니다.

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
<h1>카운터</h1><button id="increment" type="button">증가</button><p id="count" role="status">0</p>
<script type="module">const button = document.querySelector("#increment");
const output = document.querySelector("#count");
let count = 0;
button.addEventListener("click", () => {
  count += 1;
  output.textContent = String(count);
});</script>
</body>
</html>
```

## 예상 결과

처음 0이며 증가 버튼을 누를 때마다 1씩 증가합니다.

## 동작 원리와 주의사항

querySelector는 없으면 null을 반환합니다. 모듈 스크립트는 파싱 이후 실행되어 위 요소를 찾을 수 있습니다. 일반 사용자 문자열은 innerHTML보다 textContent로 넣어 코드로 해석되지 않게 합니다. removeEventListener는 등록한 같은 함수 참조가 필요합니다.

## 직접 확인하기

감소 버튼을 추가하되 0 아래로 내려가지 않게 하세요.

---

---

---

[전체 목차](../README.md) · [이전](../25.%20Promise%20%26%20async%20%26%20await/README.md) · [다음](../27.%20fetch%20%26%20AbortController/README.md)
