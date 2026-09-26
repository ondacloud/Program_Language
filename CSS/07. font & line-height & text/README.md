# 타이포그래피와 가독성

## 핵심 개념

글꼴 크기뿐 아니라 줄 높이, 줄 길이, 대비가 읽기 편함에 영향을 줍니다.

## 실행 방법

동봉한 `example.html`을 브라우저로 여세요. CSS 효과를 바로 볼 수 있도록 HTML과 style을 한 파일에 넣었습니다. 실제 프로젝트에서는 .css 파일로 분리할 수 있습니다.

[실습 파일](example.html)

## 실행 예제

```html
<!doctype html>
<html lang="ko">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>타이포그래피와 가독성</title>
  <style>body { font-family: system-ui, sans-serif; color: #172554; background: #fff; }
article { max-width: 65ch; margin: 2rem auto; padding: 1rem; }
p { font-size: 1rem; line-height: 1.7; overflow-wrap: anywhere; }
a { text-underline-offset: .2em; }</style>
</head>
<body>
<article><h1>읽기 좋은 문장</h1><p>긴 콘텐츠는 적절한 줄 길이와 줄 간격이 필요합니다. 반응형 화면에서 읽기 흐름을 확인하세요.</p><a href="#">링크 예시</a></article>

</body>
</html>
```

## 예상 결과

최대 줄 길이가 제한되고 문단 줄 간격이 넉넉해집니다.

## 동작 원리와 주의사항

line-height에 단위를 생략하면 상속 시 유연합니다. ch는 한글 글자 수가 아니라 글꼴의 0 글리프 폭 기준입니다. 색만으로 의미를 전달하지 말고 링크 밑줄이나 텍스트도 유지하세요. 웹폰트 로딩 실패 시 대체 글꼴에서도 레이아웃을 확인합니다.

## 직접 확인하기

길게 이어진 URL을 넣고 좁은 화면에서 넘침을 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../06.%20width%20%26%20min-width%20%26%20max-width/README.md) · [다음](../08.%20display%20%26%20visibility%20%26%20overflow/README.md)
