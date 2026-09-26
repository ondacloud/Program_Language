# 이미지, 대체 텍스트, 크기

## 핵심 개념

img의 alt는 이미지의 목적을 텍스트로 전달합니다. 장식과 정보 이미지의 대체 텍스트 정책은 다릅니다.

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
  <title>이미지, 대체 텍스트, 크기</title>

</head>
<body>
<h1>학습 흐름</h1>
<figure>
  <img src="flow.svg" width="320" height="100" alt="HTML 다음 CSS, 다음 JavaScript 순서로 학습합니다.">
  <figcaption>웹 기초 학습 순서</figcaption>
</figure>

</body>
</html>
```

## 예상 결과

HTML → CSS → JavaScript 그림과 설명이 표시됩니다. flow.svg는 같은 폴더에 동봉되어 있습니다.

## 동작 원리와 주의사항

정보 이미지의 alt는 파일명보다 의미를 설명합니다. 순수 장식은 alt=""로 보조 기술에서 제외할 수 있습니다. width·height는 공간을 미리 확보해 레이아웃 이동을 줄입니다. 실제 반응형 자산이 있다면 srcset·sizes로 후보를 제공하며 중요하지 않은 아래쪽 이미지는 loading="lazy"를 고려합니다.

## 직접 확인하기

이미지 파일 경로를 잠시 잘못 지정하고 대체 텍스트가 어떤 역할을 하는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../04.%20h1%20%26%20p%20%26%20strong%20%26%20em/README.md) · [다음](../06.%20form%20%26%20name%20%26%20value/README.md)
