# 선택자와 상태

## 핵심 개념

class·속성·의사 클래스·의사 요소를 조합해 대상과 상태를 지정합니다.

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
  <title>선택자와 상태</title>
  <style>.list > li { padding: .5rem; }
.list > li:first-child { font-weight: 700; }
button:hover { background: #dbeafe; }
button:focus-visible { outline: 3px solid #1d4ed8; outline-offset: 3px; }
.tag::before { content: "#"; }</style>
</head>
<body>
<ul class="list"><li class="tag">HTML</li><li>CSS</li></ul><button type="button">초점 확인</button>

</body>
</html>
```

## 예상 결과

첫 항목이 굵게 표시되고 #이 붙습니다. 키보드 초점에는 파란 윤곽선이 나타납니다.

## 동작 원리와 주의사항

공백 선택자는 모든 후손, >는 직계 자식을 고릅니다. :hover만으로 중요한 기능을 제공하면 터치·키보드 사용자가 접근하기 어렵습니다. ::before 내용은 중요한 정보의 유일한 전달 수단으로 쓰지 않습니다.

## 직접 확인하기

두 번째 항목에만 다른 배경을 적용하고 Tab으로 버튼 초점을 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../00.%20selector%20%26%20property%20%26%20value/README.md) · [다음](../02.%20combinator%20%26%20pseudo-class/README.md)
