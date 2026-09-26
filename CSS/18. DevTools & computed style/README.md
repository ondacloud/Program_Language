# CSS 디버깅과 유지보수

## 핵심 개념

규칙이 적용되지 않을 때 선택자, 캐스케이드, 계산된 값, 박스 크기를 차례로 확인합니다.

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
  <title>CSS 디버깅과 유지보수</title>
  <style>.panel { max-width: 30rem; margin: 1rem auto; padding: 1rem; border: 2px solid #2563eb; }
.panel p { margin: 0; overflow-wrap: anywhere; }</style>
</head>
<body>
<section class="panel"><h1>스타일 점검</h1><p>개발자 도구의 Styles와 Computed에서 실제 적용값을 확인하세요.</p></section>

</body>
</html>
```

## 예상 결과

테두리와 내부 여백이 있는 패널이 중앙에 표시됩니다.

## 동작 원리와 주의사항

취소선 규칙은 다른 선언에 밀렸거나 무효일 수 있습니다. Computed에서 최종 값과 원인을 추적하세요. CSS가 파싱되어도 잘못된 속성값은 조용히 무시될 수 있습니다. 요소 수에 따라 강한 선택자를 계속 추가하는 대신 컴포넌트 class와 작은 규칙으로 정리합니다.

## 직접 확인하기

padding을 개발자 도구에서 0으로 바꾸고 박스 모델을 비교하세요.

---

---

---

[전체 목차](../README.md) · [이전](../17.%20transition%20%26%20animation%20%26%20keyframes/README.md)
