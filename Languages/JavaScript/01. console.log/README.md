# 출력 — console.log와 문자열 형식

## 핵심 개념

console.log는 값을 출력하고 템플릿 문자열은 값을 문장 안에 삽입합니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
const name = "Alice";
const score = 90;
console.log("Hello", name);
console.log(`score=${score}`);
console.log(JSON.stringify({ name, score }));
```

## 예상 결과

```text
Hello Alice
score=90
{"name":"Alice","score":90}
```

## 동작 원리와 주의사항

브라우저에서는 개발자 도구 콘솔에, Node에서는 터미널에 표시됩니다. 화면 문서에 표시하려면 DOM의 textContent 또는 React 렌더링을 사용합니다. 객체를 console.log로 출력한 모습은 실행 환경에 따라 달라질 수 있으므로 데이터 형식을 비교할 때 JSON.stringify를 사용합니다.



## 직접 확인하기

변수 값을 바꾸어 문자열과 숫자 출력 차이를 확인하세요. 콘솔 출력과 함수 return의 차이를 설명하세요.

---

---

[전체 목차](../README.md) · [이전](../00.%20operator/README.md) · [다음](../02.%20FormData%20%26%20input.value/README.md)
