# Grid — 행과 열 배치

## 핵심 개념

Grid는 행과 열을 함께 설계하는 2차원 레이아웃입니다.

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
  <title>Grid — 행과 열 배치</title>
  <style>.grid { display: grid; grid-template-columns: repeat(3, minmax(0, 1fr)); gap: 1rem; }
.card { padding: 1rem; background: #dbeafe; }
@media (max-width: 40rem) { .grid { grid-template-columns: 1fr; } }</style>
</head>
<body>
<div class="grid"><article class="card">HTML</article><article class="card">CSS</article><article class="card">JavaScript</article></div>

</body>
</html>
```

## 예상 결과

넓은 화면은 같은 너비의 3열, 40rem 이하에서는 1열입니다.

## 동작 원리와 주의사항

fr은 남은 공간을 분배합니다. minmax(0,1fr)은 긴 콘텐츠 때문에 트랙이 최소 콘텐츠 크기로 늘어나는 문제를 줄입니다. gap은 항목 사이 간격입니다. 자동 열 개수는 repeat(auto-fit,minmax(...))를 검토하되 작은 화면에서 최소 너비가 넘치지 않도록 합니다.

## 직접 확인하기

열을 2개로 바꾸고 마지막 항목의 위치를 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../11.%20display%20flex/README.md) · [다음](../13.%20calc%20%26%20min%20%26%20max%20%26%20clamp/README.md)
