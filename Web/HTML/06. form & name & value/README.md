# 폼의 name·value·label·전송

## 핵심 개념

폼은 입력 요소의 name과 현재 값을 묶어 전송합니다. id는 label 연결용이며 전송 키는 name입니다.

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
  <title>학습 예제</title>

</head>
<body>
<h1>폼 데이터</h1>
<form method="get">
  <label for="name">이름</label>
  <input id="name" name="name" value="Kim" required>
  <label><input type="checkbox" name="subscribe" value="yes" checked>구독</label>
  <input name="ignored" value="hidden by disabled" disabled>
  <button type="submit">조회</button>
</form>

</body>
</html>
```

## 예상 결과

```text
이름 Kim과 선택된 구독 체크박스가 표시됩니다. 제출 시 같은 페이지 URL에 name=Kim과 subscribe=yes가 포함됩니다.
```

## 동작 원리와 주의사항

GET은 데이터를 URL 쿼리에 넣으므로 비밀번호 전송에 쓰지 않습니다. POST는 본문으로 보내지만 그 자체가 암호화는 아닙니다. disabled 입력·선택되지 않은 체크박스는 일반적으로 폼 데이터에 포함되지 않습니다. 브라우저 검증은 서버 검증을 대체하지 않습니다.



## 직접 확인하기

name을 제거하거나 체크박스를 해제한 뒤 URL 차이를 확인하세요. 입력을 비우고 required 동작을 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../05.%20img%20%26%20picture/README.md) · [다음](../07.%20label%20%26%20input%20%26%20button/README.md)
