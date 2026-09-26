# 상속·명시도·소스 순서

## 핵심 개념

같은 속성에 여러 규칙이 있으면 캐스케이드가 최종 값을 결정합니다. 상속은 부모 값을 전달하는 별도 과정입니다.

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
  <style>.panel { color: rgb(0 128 0); border: 2px solid black; }
p { color: red; }
.note { color: orange; }
#target { color: rgb(0 0 255); }
.note { color: purple; }</style>
</head>
<body>
<main class="panel"><h1>캐스케이드</h1><p id="target" class="note">최종 색상</p></main>

</body>
</html>
```

## 예상 결과

```text
제목은 상속된 녹색, 문단은 id 규칙의 파란색으로 표시됩니다. 부모 테두리는 자식에게 상속되지 않습니다.
```

## 동작 원리와 주의사항

이 예제처럼 같은 출처·중요도·레이어에서 비교할 때 id 선택자는 class보다 명시도가 높습니다. 명시도가 같으면 뒤 규칙이 이깁니다. 실제 캐스케이드는 출처·!important·레이어 등을 먼저 고려하므로 단순 id 우선 공식만으로 전체를 설명할 수 없습니다. color는 보통 상속되지만 margin·border는 보통 상속되지 않습니다.



## 직접 확인하기

id 규칙을 제거한 다음 마지막 .note를 제거하며 색상 변화를 예측하세요. inherit과 initial의 차이를 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../03.%20cascade%20%26%20important/README.md) · [다음](../05.%20px%20%26%20rem%20%26%20rgb%20%26%20hsl/README.md)
