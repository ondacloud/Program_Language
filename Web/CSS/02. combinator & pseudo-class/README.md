# 선택자 결합·속성 선택·상태

## 핵심 개념

같은 요소에 조건을 결합하는 것과 요소 사이의 관계를 지정하는 것은 다릅니다.

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
  <style>.items > li { padding: 4px; }
.items > li.active { color: rgb(0 128 0); }
.items > li + li { border-top: 1px solid gray; }
input[type="text"]:focus { outline: 3px solid blue; }
li:first-child::before { content: "★ "; }</style>
</head>
<body>
<main><h1>선택자</h1><ul class="items"><li>첫째</li><li class="active">둘째</li><li>셋째</li></ul>
<label>이름 <input type="text"></label><p>뒤 문단</p></main>

</body>
</html>
```

## 예상 결과

```text
둘째 항목은 녹색, 첫째에는 별 표시, 두 번째 이후 항목에는 위 테두리가 생깁니다.
```

## 동작 원리와 주의사항

공백은 자손, >는 직접 자식, +는 바로 다음 형제, ~는 뒤쪽 형제를 선택합니다. .a.b는 두 class를 가진 같은 요소이며 .a .b는 자손입니다. :focus는 상태를, ::before는 가상 요소를 표현합니다. 핵심 의미를 CSS 생성 콘텐츠에만 두지 마세요.



## 직접 확인하기

중첩 목록을 추가해 자식과 자손 선택자의 차이를 확인하세요. 키보드 Tab으로 초점을 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../01.%20class%20%26%20id%20selector/README.md) · [다음](../03.%20cascade%20%26%20important/README.md)
