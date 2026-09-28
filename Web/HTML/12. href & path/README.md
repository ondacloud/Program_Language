# 링크, 상대 경로, 버튼

## 핵심 개념

a는 다른 위치로 이동하고 button은 동작을 실행합니다. 목적에 따라 요소를 선택하면 키보드와 보조 기술도 의미를 알 수 있습니다.

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
  <title>링크, 상대 경로, 버튼</title>

</head>
<body>
<h1>링크 연습</h1>
<nav aria-label="문서 목차">
  <a href="#practice">실습으로 이동</a>
</nav>
<p><a href="https://developer.mozilla.org/ko/" target="_blank" rel="noopener noreferrer">MDN 문서 (새 탭)</a></p>
<section id="practice"><h2>실습</h2><p>이곳으로 이동합니다.</p></section>
<button type="button">동작을 연결할 버튼</button>

</body>
</html>
```

## 예상 결과

실습 링크를 누르면 같은 문서의 실습 영역으로 이동합니다. 마지막 버튼은 아직 동작이 연결되지 않았습니다.

## 동작 원리와 주의사항

상대 경로는 현재 문서 URL 기준이고 /로 시작하면 사이트 루트 기준입니다. #은 id를 가리킵니다. 링크 문구는 ‘여기’보다 목적을 설명하세요. noreferrer는 참조 출처 정보 전달도 막으므로 요구에 맞춰 사용합니다. JavaScript 동작을 위해 href="#"를 남용하지 마세요.

## 직접 확인하기

다른 id로 바꾼 뒤 href도 함께 바꿔 연결을 유지하세요.

---

---

---

[전체 목차](../README.md) · [이전](../11.%20a%20%26%20button/README.md) · [다음](../13.%20header%20%26%20nav%20%26%20main%20%26%20footer/README.md)
