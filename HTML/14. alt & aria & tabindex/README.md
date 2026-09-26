# 키보드와 접근 가능한 이름

## 핵심 개념

기본 HTML 컨트롤은 키보드·역할·상태를 이미 제공합니다. ARIA는 필요한 정보를 보충할 때 사용합니다.

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
  <title>키보드와 접근 가능한 이름</title>

</head>
<body>
<h1>도움말</h1>
<button type="button" aria-describedby="help">저장</button>
<p id="help">이 예제의 버튼에는 저장 동작이 연결되어 있지 않습니다.</p>
<label for="query">검색어</label><input id="query" type="search">
<p role="status">검색 준비</p>

</body>
</html>
```

## 예상 결과

Tab으로 버튼과 검색 입력을 순서대로 탐색할 수 있습니다.

## 동작 원리와 주의사항

클릭 가능한 div보다 button을 사용하세요. tabindex 양수로 순서를 억지 변경하지 마세요. aria-label은 보이는 문구를 덮어쓸 수 있으므로 기본 텍스트·label로 충분하면 추가하지 않습니다. role="status"는 상태 갱신 알림에 사용할 수 있지만 실제 읽힘은 보조 기술로도 확인해야 합니다.

## 직접 확인하기

마우스를 쓰지 않고 모든 컨트롤에 접근되는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../13.%20header%20%26%20nav%20%26%20main%20%26%20footer/README.md) · [다음](../15.%20meta%20%26%20link%20%26%20script/README.md)
