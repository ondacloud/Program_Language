# 사용자 정의 속성과 테마

## 핵심 개념

--이름 속성과 var()로 반복되는 디자인 값을 공유합니다.

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
  <title>사용자 정의 속성과 테마</title>
  <style>:root { --accent: #1d4ed8; --surface: #eff6ff; --space: 1rem; }
.card { color: var(--accent); background: var(--surface); padding: var(--space); }
.alternate { --accent: #065f46; --surface: #ecfdf5; }</style>
</head>
<body>
<article class="card">기본 테마</article><article class="card alternate">다른 테마</article>

</body>
</html>
```

## 예상 결과

첫 카드는 파란 계열, 두 번째는 초록 계열입니다.

## 동작 원리와 주의사항

사용자 정의 속성은 보통 상속되고 요소 범위에서 재정의할 수 있습니다. var(--x, fallback)은 변수가 없거나 무효인 경우의 대체값이지 모든 속성 문법 오류를 고쳐 주는 것은 아닙니다. 테마 변경 후에도 대비와 초점 표시를 확인합니다.

## 직접 확인하기

--space만 바꾸어 두 카드의 간격이 함께 변하는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../13.%20calc%20%26%20min%20%26%20max%20%26%20clamp/README.md) · [다음](../15.%20margin%20%26%20padding%20%26%20border%20%26%20box-sizing/README.md)
