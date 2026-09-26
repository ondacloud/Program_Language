# HTML 문서와 요소

## 핵심 개념

HTML은 문서의 의미와 구조를 표현하는 마크업 언어입니다. 태그·속성·내용으로 요소를 구성하며 브라우저는 이를 DOM으로 해석합니다.

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
  <title>HTML 문서와 요소</title>

</head>
<body>
<h1>나의 첫 문서</h1>
<p>HTML은 콘텐츠의 <strong>의미</strong>를 표현합니다.</p>

</body>
</html>
```

## 예상 결과

문서 제목 아래 한 문단이 표시되고 ‘의미’가 강조됩니다. 탭 제목은 HTML 문서와 요소입니다.

## 동작 원리와 주의사항

doctype은 현대 HTML 표준 모드를 요청합니다. html의 lang은 언어 정보를, charset은 문자 인코딩을 제공합니다. title은 탭·검색·보조 기술에서 문서를 식별합니다. div로만 구성하기보다 콘텐츠에 맞는 요소를 선택하세요.

## 직접 확인하기

lang, title, h1의 역할이 어떻게 다른지 설명하고 문서 제목을 바꾸세요.

---

---

---

[전체 목차](../README.md) · [다음](../01.%20tag%20%26%20attribute/README.md)
