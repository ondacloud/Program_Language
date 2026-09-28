# details와 data-*

## 핵심 개념

기본 펼침 UI는 details/summary로 구현할 수 있고 요소별 사용자 데이터는 data-* 속성에 둘 수 있습니다.

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
  <title>details와 data-*</title>

</head>
<body>
<h1>자주 묻는 질문</h1>
<details data-topic="html">
  <summary>HTML과 CSS의 차이는?</summary>
  <p>HTML은 의미와 구조, CSS는 표현과 배치를 담당합니다.</p>
</details>

</body>
</html>
```

## 예상 결과

질문을 클릭하거나 키보드로 활성화하면 답변이 펼쳐집니다.

## 동작 원리와 주의사항

summary는 details의 제목 역할을 합니다. data-topic은 JavaScript에서 dataset.topic으로 문자열로 읽습니다. data-*는 비밀 저장소가 아니며 브라우저에서 볼 수 있습니다. 기본 컨트롤의 열린 상태를 CSS [open] 선택자로 표현할 수 있습니다.

## 직접 확인하기

open 속성을 추가하면 처음부터 열리는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../08.%20select%20%26%20textarea%20%26%20required/README.md) · [다음](../10.%20ul%20%26%20ol%20%26%20li%20%26%20table/README.md)
