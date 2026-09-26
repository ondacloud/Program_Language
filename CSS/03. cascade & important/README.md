# CSS 문법과 캐스케이드

## 핵심 개념

선택자가 대상을 고르고 선언 블록의 속성:값이 표현을 정합니다. 여러 규칙은 캐스케이드 규칙으로 해결됩니다.

## 실행 방법

동봉한 `example.html`을 브라우저로 여세요. CSS 효과를 바로 볼 수 있도록 HTML과 style을 한 파일에 넣었습니다. 실제 프로젝트에서는 .css 파일로 분리할 수 있습니다.

[실습 파일](example.html)

## 실행 예제

```html
<!doctype html>
<html lang="ko">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>CSS 문법과 캐스케이드</title>
  <style>p { color: navy; }
.note { color: darkgreen; }
.note { color: purple; }</style>
</head>
<body>
<p class="note">캐스케이드 연습</p>

</body>
</html>
```

## 예상 결과

문단은 보라색입니다.

## 동작 원리와 주의사항

같은 출처·중요도·레이어 조건에서 명시도가 비교되고 동률이면 뒤 선언이 이깁니다. 단순히 언제나 마지막 CSS가 우선하는 것은 아닙니다. !important를 기본 해결책으로 쓰기보다 규칙의 출처와 명시도를 확인하세요. 모든 속성이 부모에서 상속되지는 않습니다.

## 직접 확인하기

p 규칙을 마지막으로 옮겨도 class 규칙이 우선하는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../02.%20combinator%20%26%20pseudo-class/README.md) · [다음](../04.%20inherit%20%26%20specificity/README.md)
