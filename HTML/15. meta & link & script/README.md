# 메타데이터와 리소스 로딩

## 핵심 개념

문서 메타데이터는 검색·공유·뷰포트 정보를 제공하고 CSS·JavaScript는 별도 리소스로 연결할 수 있습니다.

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
  <title>메타데이터와 리소스 로딩</title>

</head>
<body>
<h1>리소스 연결</h1>
<p>동봉된 전체 파일의 head에서 charset, viewport, title을 확인하세요.</p>
<pre><code>&lt;link rel="stylesheet" href="styles.css"&gt;
&lt;script type="module" src="app.js"&gt;&lt;/script&gt;</code></pre>

</body>
</html>
```

## 예상 결과

실제로 요청하지 않는 CSS·JavaScript 연결 예시가 코드 텍스트로 보입니다.

## 동작 원리와 주의사항

고전 스크립트의 defer는 문서 파싱 후 순서대로 실행하는 데 사용합니다. 모듈 스크립트는 기본적으로 지연 실행되며 별도 모듈 범위를 가집니다. async는 준비되는 즉시 실행하여 의존 스크립트 순서에 주의해야 합니다. 파일이 존재할 때만 실제 리소스 태그를 추가하세요.

## 직접 확인하기

연습 폴더에 styles.css를 만들고 실제 link 태그로 연결해 제목 색을 바꾸세요.

---

---

---

[전체 목차](../README.md) · [이전](../14.%20alt%20%26%20aria%20%26%20tabindex/README.md) · [다음](../16.%20DevTools%20%26%20validator/README.md)
