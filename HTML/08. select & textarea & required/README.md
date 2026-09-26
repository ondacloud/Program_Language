# 입력 종류와 제약 조건

## 핵심 개념

입력의 타입·범위·필수 여부를 선언하면 기본 검증과 모바일 입력 UI에 도움을 줍니다.

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
  <title>입력 종류와 제약 조건</title>

</head>
<body>
<h1>예약 옵션</h1>
<form action="#">
  <fieldset><legend>참여 방식</legend>
    <label><input type="radio" name="mode" value="online" checked> 온라인</label>
    <label><input type="radio" name="mode" value="offline"> 오프라인</label>
  </fieldset>
  <p><label for="count">인원 (1~5)</label><input id="count" name="count" type="number" min="1" max="5" value="1" required></p>
  <p><label for="level">난이도</label><select id="level" name="level"><option value="basic">기초</option><option value="advanced">심화</option></select></p>
  <button>확인</button>
</form>

</body>
</html>
```

## 예상 결과

같은 name의 라디오 중 하나만 선택됩니다. 인원 0 또는 6은 기본 검증을 통과하지 못합니다.

## 동작 원리와 주의사항

fieldset·legend는 관련 입력을 그룹화합니다. form 내부 button은 기본 submit이므로 단순 동작 버튼에는 type="button"을 씁니다. 브라우저 검증은 우회할 수 있어 서버 검증이 반드시 별도로 필요합니다. number도 JavaScript의 value로 읽으면 문자열입니다.

## 직접 확인하기

radio의 name이 서로 다르면 둘 다 선택 가능한지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../07.%20label%20%26%20input%20%26%20button/README.md) · [다음](../09.%20details%20%26%20summary/README.md)
