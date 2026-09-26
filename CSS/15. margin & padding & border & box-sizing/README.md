# 박스 모델과 box-sizing

## 핵심 개념

콘텐츠, padding, border, margin이 요소 크기와 간격을 만듭니다.

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
  <title>박스 모델과 box-sizing</title>
  <style>* { box-sizing: border-box; }
.box { width: 240px; padding: 20px; border: 4px solid #2563eb; margin: 16px; }</style>
</head>
<body>
<div class="box">전체 너비 240px</div>

</body>
</html>
```

## 예상 결과

테두리까지 포함한 박스 너비가 240px입니다. margin은 그 너비 바깥의 간격입니다.

## 동작 원리와 주의사항

content-box에서는 width가 콘텐츠 너비이고 padding·border가 더해집니다. border-box는 설정한 width 안에 포함합니다. 세로 block margin은 조건에 따라 겹쳐질 수 있습니다. 간격은 임의의 공백 문자보다 CSS로 표현하세요.

## 직접 확인하기

content-box로 바꾸면 실제 테두리 너비가 288px이 되는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../14.%20var%20%26%20custom%20property/README.md) · [다음](../16.%20position%20%26%20z-index/README.md)
