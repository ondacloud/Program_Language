# calc·min·max·clamp·사용자 정의 속성

## 핵심 개념

CSS 계산 함수는 레이아웃 값과 단위를 조합합니다. 사용자 정의 속성은 재사용할 값을 전달합니다.

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
  <title>학습 예제</title>
  <style>:root { --space: 16px; }
.card { box-sizing: border-box; width: min(400px, calc(100% - 2 * var(--space))); padding: var(--space); font-size: clamp(16px, 2vw, 24px); border: 1px solid black; }</style>
</head>
<body>
<h1>값 계산</h1><div class="card">계산된 너비</div>

</body>
</html>
```

## 예상 결과

```text
넓은 화면에서 카드 너비는 400px입니다. 창이 좁아지면 여백을 제외한 너비까지 줄어듭니다.
```

## 동작 원리와 주의사항

calc의 +·- 양쪽에는 공백을 넣으세요. 서로 다른 길이 단위는 계산식에서 조합할 수 있으나 차원이 맞아야 합니다. var(--name, fallback)은 사용자 정의 속성이 없거나 적절히 해석되지 않는 경우의 대체 값을 지정하며 임의의 속성값 오류까지 모두 해결하지는 않습니다. clamp는 최소·선호·최대 순서입니다.



## 직접 확인하기

--space를 24px로 바꾸고 320px·1280px 화면을 비교하세요. calc(100% - 32px)과 같은지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../12.%20display%20grid/README.md) · [다음](../14.%20var%20%26%20custom%20property/README.md)
