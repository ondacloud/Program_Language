# for

## 핵심 개념

초기식·조건식·갱신식을 한 문장에 지정하는 반복문입니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
let sum = 0;
for (let i = 1; i <= 3; i++) {
  sum += i;
}
console.log(sum);
```

## 예상 결과

```text
6
```

## 동작 원리와 주의사항

초기식은 한 번, 조건식은 각 반복 전, 갱신식은 각 본문 뒤에 실행됩니다. let으로 만든 i는 반복문 밖에서 접근할 수 없습니다.



## 직접 확인하기

조건을 i < 3으로 바꾸고 결과 차이를 확인하세요.

---

[전체 목차](../README.md) · [이전](../04.%20switch%20%26%20case/README.md) · [다음](../06.%20while/README.md)
