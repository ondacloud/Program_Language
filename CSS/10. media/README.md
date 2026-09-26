# 반응형 디자인과 미디어 쿼리

## 핵심 개념

작은 화면의 기본 흐름을 먼저 만들고 필요한 지점에서 레이아웃을 확장합니다.

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
  <title>반응형 디자인과 미디어 쿼리</title>
  <style>body { margin: 0; padding: 1rem; font-family: system-ui; }
.layout { display: grid; gap: 1rem; }
nav, main { padding: 1rem; background: #f1f5f9; }
@media (min-width: 48rem) { .layout { grid-template-columns: 14rem minmax(0,1fr); } }</style>
</head>
<body>
<div class="layout"><nav aria-label="강좌"><a href="#content">목차</a></nav><main id="content"><h1>반응형 문서</h1><p>화면을 줄여 보세요.</p></main></div>

</body>
</html>
```

## 예상 결과

좁은 화면은 위아래, 48rem 이상은 탐색과 본문이 나란히 배치됩니다.

## 동작 원리와 주의사항

기기 이름보다 콘텐츠가 깨지는 지점을 기준으로 breakpoint를 잡습니다. viewport 메타 태그도 필요합니다. 가로 넘침, 긴 번역 문자열, 200% 확대를 함께 확인하세요. 미디어 쿼리는 viewport 등 환경 기준이며 container query는 컨테이너 기준입니다.

## 직접 확인하기

폭 375px과 1280px에서 가로 스크롤 없이 내용이 보이는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../09.%20focus%20%26%20focus-visible/README.md) · [다음](../11.%20display%20flex/README.md)
