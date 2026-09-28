# position과 쌓임 맥락

## 핵심 개념

일반 흐름에서의 배치와 relative·absolute·fixed·sticky 위치 지정을 구별합니다.

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
  <title>position과 쌓임 맥락</title>
  <style>.card { position: relative; width: 18rem; padding: 2rem; background: #eef2ff; }
.badge { position: absolute; top: .5rem; right: .5rem; background: #1d4ed8; color: white; padding: .25rem; }</style>
</head>
<body>
<article class="card"><span class="badge">NEW</span><h1>수업 안내</h1><p>배지는 카드 오른쪽 위에 놓입니다.</p></article>

</body>
</html>
```

## 예상 결과

NEW 배지가 카드의 오른쪽 위를 기준으로 배치됩니다.

## 동작 원리와 주의사항

absolute의 기준 포함 블록을 이해해야 합니다. position 외에도 transform 등이 포함 블록·쌓임 맥락에 영향을 줄 수 있습니다. z-index를 무작정 크게 해도 부모 쌓임 맥락을 탈출하지 못합니다. sticky는 top 같은 임계값과 스크롤 조상 조건을 확인하세요.

## 직접 확인하기

부모의 position:relative를 제거했을 때 배지의 기준이 바뀌는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../15.%20margin%20%26%20padding%20%26%20border%20%26%20box-sizing/README.md) · [다음](../17.%20transition%20%26%20animation%20%26%20keyframes/README.md)
