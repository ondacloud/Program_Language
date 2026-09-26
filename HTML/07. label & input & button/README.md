# 폼, label, name

## 핵심 개념

폼은 사용자 입력을 묶습니다. label은 입력을 설명하고 name은 제출 데이터의 키가 됩니다.

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
  <title>폼, label, name</title>

</head>
<body>
<h1>연습용 신청서</h1>
<form action="#" method="get">
  <p><label for="name">이름</label><input id="name" name="name" autocomplete="name" required></p>
  <p><label for="email">이메일</label><input id="email" name="email" type="email" autocomplete="email" required></p>
  <button type="submit">입력 검증 후 제출</button>
</form>

</body>
</html>
```

## 예상 결과

이름·이메일 입력과 제출 버튼이 표시됩니다. 비어 있거나 형식이 잘못되면 브라우저가 제출을 막습니다. 유효한 값은 현재 URL의 query로 제출되며 저장 서버는 없습니다.

## 동작 원리와 주의사항

for와 id를 연결하면 label 클릭으로 입력에 초점이 갑니다. placeholder는 label을 대체하지 않습니다. GET은 값이 URL에 나타나므로 비밀번호·민감 정보에 쓰지 않습니다. disabled 입력은 제출되지 않습니다. 예제에는 실제 개인 정보 대신 테스트 값을 사용하세요.

## 직접 확인하기

name 속성을 제거하면 제출 데이터에서 해당 입력이 빠지는 이유를 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../06.%20form%20%26%20name%20%26%20value/README.md) · [다음](../08.%20select%20%26%20textarea%20%26%20required/README.md)
