# if / else if / else

## 핵심 개념

조건이 참인 첫 번째 분기의 본문을 실행합니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
const score = 85;
if (score >= 90) { console.log("A"); }
else if (score >= 80) { console.log("B"); }
else { console.log("C"); }
```

## 예상 결과

```text
B
```

## 동작 원리와 주의사항

중괄호는 각 분기의 범위를 나타냅니다. else if는 앞 조건이 거짓일 때만 검사합니다. 숫자 0·빈 문자열·null 등은 조건에서 falsy이므로 존재 확인과 값 비교를 구분하세요.



## 직접 확인하기

79·80·89·90을 넣고 선택되는 분기를 예상하세요.

---

[전체 목차](../README.md) · [이전](../02.%20FormData%20%26%20input.value/README.md) · [다음](../04.%20switch%20%26%20case/README.md)
