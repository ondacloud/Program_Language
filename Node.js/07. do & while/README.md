# do / while

## 핵심 개념

본문 실행 후 조건을 검사하므로 최소 한 번 실행합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
let n = 3;
do {
  console.log(n);
  n++;
} while (n < 3);
```

## 예상 결과

```text
3
```

## 동작 원리와 주의사항

끝의 while 뒤에는 세미콜론을 붙입니다. 동일 조건의 while 문과 첫 실행 여부가 다릅니다.



## 직접 확인하기

초기값을 0으로 바꾸고 출력 횟수를 예측하세요.

---

[전체 목차](../README.md) · [이전](../06.%20while/README.md) · [다음](../08.%20break/README.md)
