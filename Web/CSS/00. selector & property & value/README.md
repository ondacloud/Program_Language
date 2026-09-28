# 선택자·속성·값·선언과 주석

## 핵심 개념

CSS 규칙은 선택자로 대상을 고르고 선언 블록에서 속성과 값을 지정합니다.

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
  <style>/* 특정 class에만 적용 */
.notice {
  color: rgb(0 80 160);
  font-weight: 700;
  padding: 12px;
  border: 1px solid currentColor;
}</style>
</head>
<body>
<h1>CSS 문법</h1><p class="notice">안내 문장</p><p>기본 문장</p>

</body>
</html>
```

## 예상 결과

```text
안내 문장만 파란색·굵은 글씨·여백·테두리로 표시됩니다.
```

## 동작 원리와 주의사항

속성과 값은 콜론, 선언 사이는 세미콜론으로 구분합니다. CSS의 주석은 /* ... */이며 //가 아닙니다. 유효하지 않은 선언은 보통 무시되므로 개발자 도구에서 취소선과 경고를 확인하세요. CSS는 JS 같은 일반 대입·if·for 문법을 제공하지 않습니다.

## 문법 한눈에 보기

| 구성 | 예 |
|---|---|
| 선택자 | `.notice` |
| 속성·값 | `color: blue;` |
| 규칙 | `선택자 { 선언 }` |

## 직접 확인하기

color 값을 잘못 적어 해당 선언과 다른 선언의 적용 여부를 비교하세요.

---

---

---

[전체 목차](../README.md) · [다음](../01.%20class%20%26%20id%20selector/README.md)
