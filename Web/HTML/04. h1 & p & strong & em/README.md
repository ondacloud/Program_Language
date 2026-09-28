# 제목, 문단, 텍스트 의미

## 핵심 개념

제목 수준은 문서의 계층이고 글자 크기는 CSS의 역할입니다. 강조와 중요성을 구별해 의미를 전달합니다.

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
  <title>제목, 문단, 텍스트 의미</title>

</head>
<body>
<h1>학습 안내</h1>
<section>
  <h2>준비물</h2>
  <p><strong>파일을 저장한 뒤</strong> 브라우저를 새로 고치세요.</p>
  <p>코드에서 <code>const</code>는 재대입을 제한합니다.</p>
  <blockquote><p>작은 예제를 직접 바꾸며 학습합니다.</p></blockquote>
</section>

</body>
</html>
```

## 예상 결과

하나의 최상위 제목과 준비물 소제목, 두 문단, 인용문이 표시됩니다.

## 동작 원리와 주의사항

strong은 중요성, em은 강세를 나타냅니다. 단순 굵기·기울임은 스타일로 처리할 수 있습니다. 제목 수준을 시각적 크기 때문에 건너뛰지 마세요. 여러 공백·줄바꿈은 일반 텍스트에서 합쳐지며 코드 보존은 pre/code를 사용합니다.

## 직접 확인하기

준비물 다음에 h2 실습 방법을 추가하고 하위 h3를 구성하세요.

---

---

---

[전체 목차](../README.md) · [이전](../03.%20entity%20%26%20pre%20%26%20code/README.md) · [다음](../05.%20img%20%26%20picture/README.md)
