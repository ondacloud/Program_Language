# break

## 핵심 개념

가장 가까운 반복문 또는 switch를 종료합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
for (let n = 0; n < 5; n++) {
  if (n === 2) break;
  console.log(n);
}
```

## 예상 결과

```text
0
1
```

## 동작 원리와 주의사항

break는 함수 전체를 끝내는 return과 다릅니다. 중첩 반복에서는 기본적으로 안쪽 반복만 종료합니다.



## 직접 확인하기

중첩 for를 추가하고 break가 어느 반복을 종료하는지 확인하세요.

---

[전체 목차](../README.md) · [이전](../07.%20do%20%26%20while/README.md) · [다음](../09.%20continue/README.md)
