# 폼 스타일과 초점 표시

## 핵심 개념

컨트롤의 기본 의미를 유지하면서 크기·간격·오류 상태를 스타일링합니다.

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
  <title>폼 스타일과 초점 표시</title>
  <style>body { font-family: system-ui; }
label { display: block; margin-bottom: .5rem; }
input { font: inherit; padding: .6rem; border: 2px solid #64748b; border-radius: .3rem; }
input:focus-visible { outline: 3px solid #1d4ed8; outline-offset: 2px; }
.hint { color: #475569; }
button { margin-top: 1rem; padding: .6rem 1rem; font: inherit; }</style>
</head>
<body>
<form><label for="email">이메일</label><input id="email" name="email" type="email" aria-describedby="hint" required><p class="hint" id="hint">예: student@example.com</p><button>확인</button></form>

</body>
</html>
```

## 예상 결과

label과 도움말이 연결되고 키보드 초점을 쉽게 볼 수 있습니다.

## 동작 원리와 주의사항

outline:none만 적용하면 초점 위치가 사라집니다. 오류는 색뿐 아니라 텍스트로도 설명하세요. appearance:none은 기본 표시를 없애므로 체크·선택 상태를 직접 복원해야 합니다. 터치 대상 크기와 간격도 확인합니다.

## 직접 확인하기

Tab과 Shift+Tab으로 앞뒤 이동하며 초점이 보이는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../08.%20display%20%26%20visibility%20%26%20overflow/README.md) · [다음](../10.%20media/README.md)
