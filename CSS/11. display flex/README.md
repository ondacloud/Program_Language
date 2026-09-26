# Flexbox — 한 방향 배치

## 핵심 개념

Flexbox는 주축 방향의 흐름을 중심으로 항목의 크기·간격·정렬을 조절합니다.

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
  <title>Flexbox — 한 방향 배치</title>
  <style>.toolbar { display: flex; gap: .75rem; align-items: center; flex-wrap: wrap; padding: 1rem; background: #eef2ff; }
.title { margin-right: auto; }
button { padding: .5rem 1rem; }</style>
</head>
<body>
<div class="toolbar"><strong class="title">문서</strong><button>저장</button><button>미리보기</button></div>

</body>
</html>
```

## 예상 결과

제목은 왼쪽, 버튼은 오른쪽에 배치되고 좁아지면 줄바꿈합니다.

## 동작 원리와 주의사항

justify-content는 주축, align-items는 교차축 정렬입니다. flex-direction을 바꾸면 축도 바뀝니다. 긴 콘텐츠 때문에 줄어들지 않는 flex 자식은 min-width:0이 필요한지 확인하세요. 시각적 order로 DOM 읽기 순서를 뒤집지 마세요.

## 직접 확인하기

flex-direction:column을 적용하고 정렬 축이 바뀌는 것을 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../10.%20media/README.md) · [다음](../12.%20display%20grid/README.md)
