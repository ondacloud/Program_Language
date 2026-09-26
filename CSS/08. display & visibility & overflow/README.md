# display, visibility, overflow

## 핵심 개념

요소가 배치되는 방식과 보이는 방식을 구별합니다.

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
  <title>display, visibility, overflow</title>
  <style>.row { display: flex; gap: 1rem; }
.hidden { visibility: hidden; }
.removed { display: none; }
.scroll { width: 12rem; height: 4rem; overflow: auto; border: 1px solid; }</style>
</head>
<body>
<div class="row"><span>A</span><span class="hidden">B</span><span>C</span><span class="removed">D</span></div><p class="scroll">스크롤 영역입니다. 긴 문장을 여러 번 넣어 높이가 넘치도록 확인합니다. 키보드 접근성도 확인하세요.</p>

</body>
</html>
```

## 예상 결과

B는 공간을 남기고 숨겨지며 D는 배치에서 빠집니다. 작은 문단은 필요할 때 스크롤됩니다.

## 동작 원리와 주의사항

opacity:0은 투명해져도 포인터·초점 대상이 될 수 있습니다. overflow:hidden으로 문제를 가리면 필요한 내용이 잘릴 수 있습니다. display:none은 보통 접근성 트리에서도 제외됩니다. 스크롤 영역에 갇히지 않는지 키보드로 확인하세요.

## 직접 확인하기

hidden과 removed 클래스를 교환하여 공간의 차이를 관찰하세요.

---

---

---

[전체 목차](../README.md) · [이전](../07.%20font%20%26%20line-height%20%26%20text/README.md) · [다음](../09.%20focus%20%26%20focus-visible/README.md)
