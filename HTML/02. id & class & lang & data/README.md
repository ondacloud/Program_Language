# id·class·lang·data·불리언 속성

## 핵심 개념

전역 속성은 여러 요소에서 사용할 수 있습니다. 이름이 같은 속성도 목적과 값 규칙을 구별해야 합니다.

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
<main id="content" class="panel featured" data-level="beginner">
  <h1>속성 실습</h1>
  <p lang="en">Hello</p>
  <button type="button" disabled>준비 중</button>
  <p hidden>현재 숨겨진 안내</p>
</main>

</body>
</html>
```

## 예상 결과

```text
Hello와 비활성 버튼이 보이며 hidden 문장은 보이지 않습니다.
```

## 동작 원리와 주의사항

id는 문서 안에서 고유해야 하고 class는 공백으로 여러 토큰을 지정합니다. data-*는 사용자 정의 데이터이며 보안 저장소가 아닙니다. disabled 같은 불리언 속성은 존재하면 참이므로 disabled="false"도 비활성입니다. false로 하려면 속성을 제거합니다. lang은 발음·언어 해석에 도움을 줍니다.



## 직접 확인하기

disabled와 hidden을 제거해 동작을 비교하세요. 같은 class를 여러 요소에 적용하고 id 중복은 피하세요.

---

---

---

[전체 목차](../README.md) · [이전](../01.%20tag%20%26%20attribute/README.md) · [다음](../03.%20entity%20%26%20pre%20%26%20code/README.md)
