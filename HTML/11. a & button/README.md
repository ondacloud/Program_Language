# 링크·버튼·경로의 기본 규칙

## 핵심 개념

링크는 다른 위치로 이동하고 버튼은 동작을 실행합니다. 파일 경로와 URL, 문서 내 앵커를 구별합니다.

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
<h1>이동과 동작</h1>
<a href="#details">설명으로 이동</a>
<button type="button">동작용 버튼</button>
<section id="details"><h2>설명</h2><p>같은 문서 안의 목적지입니다.</p></section>

</body>
</html>
```

## 예상 결과

```text
링크를 누르면 주소에 #details가 붙습니다. 버튼에는 아직 스크립트 동작이 없습니다.
```

## 동작 원리와 주의사항

href="guide.html"은 현재 문서 기준, ../는 상위 경로, /는 사이트 루트 기준입니다. 파일 시스템 절대 경로와 웹 URL을 혼동하지 마세요. 폼 안의 button은 기본 submit일 수 있으므로 일반 동작에는 type="button"을 명시합니다. 클릭 가능한 div보다 목적에 맞는 기본 요소를 사용하세요.



## 직접 확인하기

Tab과 Enter로 링크를 사용해 보세요. 같은 폴더의 문서를 연결하고 잘못된 경로는 어떻게 표시되는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../10.%20ul%20%26%20ol%20%26%20li%20%26%20table/README.md) · [다음](../12.%20href%20%26%20path/README.md)
