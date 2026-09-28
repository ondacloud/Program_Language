# 시맨틱 레이아웃과 랜드마크

## 핵심 개념

header·nav·main·article·aside·footer로 콘텐츠 역할을 표현하면 문서 탐색이 명확해집니다.

## 실행 방법

동봉한 `example.html`을 브라우저로 여세요. 아래 코드는 파일 전체입니다.

[실습 파일](example.html)

## 실행 예제

```html
<!doctype html>
<html lang="ko">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>시맨틱 레이아웃과 랜드마크</title>

</head>
<body>
<a href="#content">본문 바로가기</a>
<header><h1>학습 노트</h1><nav aria-label="주요 메뉴"><a href="#content">글</a></nav></header>
<main id="content">
  <article><h2>첫 수업</h2><p>문서 구조를 배웁니다.</p></article>
  <aside><h2>관련 자료</h2><p>공식 문서를 함께 읽으세요.</p></aside>
</main>
<footer><p>학습용 문서</p></footer>

</body>
</html>
```

## 예상 결과

사이트 머리말, 본문 글, 관련 자료, 바닥글이 순서대로 표시됩니다.

## 동작 원리와 주의사항

article은 독립적인 콘텐츠, section은 주제별 구역입니다. 의미 없는 스타일 래퍼는 div로 충분합니다. 화면에 표시되는 주요 main은 하나로 두는 것이 일반적입니다. 요소를 바꿨다고 자동으로 예쁜 레이아웃이 생기지는 않으며 배치는 CSS로 합니다.

## 직접 확인하기

키보드 Tab으로 본문 바로가기와 메뉴를 차례로 탐색하세요.

---

---

---

[전체 목차](../README.md) · [이전](../12.%20href%20%26%20path/README.md) · [다음](../14.%20alt%20%26%20aria%20%26%20tabindex/README.md)
