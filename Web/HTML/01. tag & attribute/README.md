# 태그·요소·속성·중첩·주석

## 핵심 개념

HTML은 문서의 구조와 의미를 나타냅니다. 시작 태그·내용·종료 태그가 요소를 이루고 속성은 부가 정보를 지정합니다.

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
<!-- 화면에 보이지 않는 설명 -->
<main>
  <h1 id="title">HTML 기초</h1>
  <p class="intro">문장 안의 <strong>중요한 내용</strong>입니다.</p>
  <p>첫 줄<br>둘째 줄</p>
</main>

</body>
</html>
```

## 예상 결과

```text
제목, 중요하게 표시된 문장, 두 줄의 문장이 보입니다. 주석은 화면에 표시되지 않습니다.
```

## 동작 원리와 주의사항

<p> 안에 <strong>을 넣고 안쪽부터 닫습니다. br은 종료 태그가 없는 void 요소입니다. 모든 요소를 아무 위치에나 넣을 수 있는 것은 아닙니다. 잘못된 중첩은 브라우저가 DOM을 복구하면서 소스와 다른 구조를 만들 수 있습니다. HTML에 산술·반복문 문법은 없습니다.

## 문법 한눈에 보기

| 구성 | 예 | 역할 |
|---|---|---|
| 요소 | `<p>문장</p>` | 의미와 구조 |
| 속성 | `class="intro"` | 요소 정보 |
| 중첩 | `<p><em>강조</em></p>` | 부모·자식 관계 |
| 주석 | `<!-- 설명 -->` | 소스 설명 |

## 직접 확인하기

strong을 em으로 바꾸고 의미 차이를 설명하세요. 개발자 도구의 Elements에서 DOM을 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../00.%20DOCTYPE%20%26%20html%20%26%20head%20%26%20body/README.md) · [다음](../02.%20id%20%26%20class%20%26%20lang%20%26%20data/README.md)
