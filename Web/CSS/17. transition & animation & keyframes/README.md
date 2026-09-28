# 전환, 애니메이션, 움직임 감소

## 핵심 개념

transition은 상태 간 변화를 보간하고 animation은 키프레임으로 시간 흐름을 정의합니다.

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
  <title>전환, 애니메이션, 움직임 감소</title>
  <style>button { padding: 1rem; transition: transform .15s ease, background-color .15s ease; }
button:hover { transform: translateY(-2px); background: #dbeafe; }
button:focus-visible { outline: 3px solid #1d4ed8; }
@media (prefers-reduced-motion: reduce) { button { transition: none; } button:hover { transform: none; } }</style>
</head>
<body>
<button type="button">마우스를 올려 보세요</button>

</body>
</html>
```

## 예상 결과

기본 환경에서는 버튼이 살짝 이동하고 배경이 바뀝니다. 움직임 감소 환경에서는 이동과 전환을 없앱니다.

## 동작 원리와 주의사항

transition:all보다 필요한 속성을 명시합니다. 움직임만으로 상태를 전달하지 마세요. transform과 opacity가 성능에 유리한 경우가 많지만 실제 렌더링은 측정해야 합니다. 과도한 will-change는 자원을 낭비할 수 있습니다.

## 직접 확인하기

개발자 도구에서 prefers-reduced-motion을 모방하여 차이를 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../16.%20position%20%26%20z-index/README.md) · [다음](../18.%20DevTools%20%26%20computed%20style/README.md)
