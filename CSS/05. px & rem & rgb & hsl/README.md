# 길이·비율·색상·키워드

## 핵심 개념

CSS 값에는 단위가 있는 길이, 백분율, 색상, auto 같은 키워드가 있습니다. %의 기준은 속성마다 다릅니다.

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
  <style>html { font-size: 16px; }
.parent { width: 400px; max-width: 100%; background: #eee; }
.child { box-sizing: border-box; width: 50%; margin: 0; padding: 1rem; font-size: 1.25rem; color: rgb(20 40 60); background: hsl(50 90% 80%); }</style>
</head>
<body>
<main><h1>단위</h1><div class="parent"><p class="child">절반 너비</p></div></main>

</body>
</html>
```

## 예상 결과

```text
넓은 화면에서 부모 400px, 자식 200px이며 자식 글자 크기는 20px입니다.
```

## 동작 원리와 주의사항

px는 CSS 픽셀로 물리 화면 픽셀과 항상 같지 않습니다. rem은 루트 글자 크기 기준이고 em은 속성 문맥에 따라 해당 요소 또는 부모 글자 크기에 연관됩니다. width의 %는 포함 블록 너비 기준입니다. 단위 없는 0은 길이에도 쓰지만 다른 숫자에 무조건 단위를 생략할 수 없습니다.



## 직접 확인하기

루트 글자 크기를 20px로 바꾸어 rem 변화를 확인하세요. 부모 너비를 바꾸고 자식 백분율 너비를 측정하세요.

---

---

---

[전체 목차](../README.md) · [이전](../04.%20inherit%20%26%20specificity/README.md) · [다음](../06.%20width%20%26%20min-width%20%26%20max-width/README.md)
