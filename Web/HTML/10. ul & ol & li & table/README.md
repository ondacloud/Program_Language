# 목록과 데이터 표

## 핵심 개념

ul·ol은 항목 목록을, table은 행과 열의 관계가 있는 데이터를 나타냅니다.

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
  <title>목록과 데이터 표</title>

</head>
<body>
<h1>강좌 목록</h1>
<ol><li>HTML</li><li>CSS</li><li>JavaScript</li></ol>
<table>
  <caption>주차별 학습 시간</caption>
  <thead><tr><th scope="col">주차</th><th scope="col">시간</th></tr></thead>
  <tbody>
    <tr><th scope="row">1주</th><td>3시간</td></tr>
    <tr><th scope="row">2주</th><td>4시간</td></tr>
  </tbody>
</table>

</body>
</html>
```

## 예상 결과

번호 목록 3개와 2행의 학습 시간 표가 나타납니다.

## 동작 원리와 주의사항

caption은 표의 주제, th와 scope는 헤더 관계를 제공합니다. 화면 배치를 위해 표를 사용하지 마세요. 복잡한 병합 셀은 접근성을 어렵게 하므로 가능한 간단한 구조를 유지합니다. CSS를 추가하지 않으면 표 테두리가 보이지 않을 수 있습니다.

## 직접 확인하기

3주 행을 추가하고 행 헤더와 데이터 셀을 구분하세요.

---

---

---

[전체 목차](../README.md) · [이전](../09.%20details%20%26%20summary/README.md) · [다음](../11.%20a%20%26%20button/README.md)
