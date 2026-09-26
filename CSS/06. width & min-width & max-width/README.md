# 단위, 최소·최대 크기, clamp

## 핵심 개념

고정 px과 상대 rem·%·뷰포트 단위를 목적에 맞게 선택합니다.

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
  <title>단위, 최소·최대 크기, clamp</title>
  <style>.card { width: min(90%, 40rem); margin-inline: auto; padding: 1rem; background: #eef2ff; }
h1 { font-size: clamp(1.5rem, 4vw, 3rem); }</style>
</head>
<body>
<article class="card"><h1>유연한 크기</h1><p>화면 너비를 바꿔 보세요.</p></article>

</body>
</html>
```

## 예상 결과

카드는 컨테이너 너비의 90%와 40rem 중 작은 값을 사용하고 제목 크기는 1.5~3rem 범위에서 변합니다.

## 동작 원리와 주의사항

rem은 루트 글꼴 크기 기준이며 em은 문맥과 속성에 따라 기준이 달라질 수 있습니다. %는 속성별 기준을 확인하세요. 모바일의 주소 표시줄 변화를 고려하면 svh·dvh 같은 단위가 필요할 수 있습니다. 텍스트 확대를 막는 고정 높이를 피하세요.

## 직접 확인하기

브라우저 글꼴 크기와 줌을 키워 내용이 잘리지 않는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../05.%20px%20%26%20rem%20%26%20rgb%20%26%20hsl/README.md) · [다음](../07.%20font%20%26%20line-height%20%26%20text/README.md)
