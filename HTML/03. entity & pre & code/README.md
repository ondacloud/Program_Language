# 문자 참조·공백·코드 표시

## 핵심 개념

소스에서 태그로 해석될 수 있는 문자는 문자 참조로 표현합니다. 일반 텍스트의 연속 공백과 줄바꿈은 보통 합쳐집니다.

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
<h1>문자와 공백</h1>
<p id="escaped">&lt;button&gt; &amp; &quot;text&quot;</p>
<p>여러     공백은 일반 문장에서 합쳐집니다.</p>
<pre><code>if (ready) {
  run();
}</code></pre>

</body>
</html>
```

## 예상 결과

```text
<button> & "text"가 문자로 표시되고 pre 안에서는 들여쓰기와 줄바꿈이 보존됩니다.
```

## 동작 원리와 주의사항

HTML 소스에서 &lt;·&gt;·&amp;는 각각 <·>·&를 표시합니다. pre는 공백을 보존하고 code는 코드라는 의미를 부여합니다. 들여쓰기를 위해 &nbsp;를 반복하기보다 CSS 여백을 사용하세요. 사용자 입력을 HTML 문자열에 그대로 삽입하면 안 되며 동적 텍스트는 textContent 등을 사용합니다.



## 직접 확인하기

실제 <button> 태그와 &lt;button&gt; 문자열 표시를 비교하세요. 일반 p와 pre에 같은 줄바꿈을 넣어 보세요.

---

---

---

[전체 목차](../README.md) · [이전](../02.%20id%20%26%20class%20%26%20lang%20%26%20data/README.md) · [다음](../04.%20h1%20%26%20p%20%26%20strong%20%26%20em/README.md)
