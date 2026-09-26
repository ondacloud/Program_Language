# HTML 검증과 개발자 도구

## 핵심 개념

브라우저는 잘못된 HTML도 복구하려고 하므로 화면이 나온다는 사실만으로 구조가 올바른 것은 아닙니다.

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
  <title>HTML 검증과 개발자 도구</title>

</head>
<body>
<h1>문서 검사</h1>
<ul><li>태그 중첩 확인</li><li>id 중복 확인</li><li>label 연결 확인</li></ul>
<p>특수 문자는 &lt;, &gt;, &amp;로 표현할 수 있습니다.</p>

</body>
</html>
```

## 예상 결과

검사 항목 목록과 <, >, & 문자가 표시됩니다.

## 동작 원리와 주의사항

개발자 도구 Elements에서 실제 DOM과 원본을 비교하고 Network에서 404 리소스를 확인합니다. HTML 검사 도구로 중첩·속성을 점검하되 키보드 탐색과 보조 기술 확인은 별도로 수행합니다. script를 넣지 않아도 잘못된 중첩 때문에 DOM 구조가 예상과 달라질 수 있습니다.

## 직접 확인하기

중복 id를 의도적으로 넣고 왜 연결 대상이 모호해지는지 설명한 뒤 수정하세요.

---

---

---

[전체 목차](../README.md) · [이전](../15.%20meta%20%26%20link%20%26%20script/README.md)
