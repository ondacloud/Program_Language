# continue

## 핵심 개념

현재 반복의 나머지 본문을 건너뛰고 다음 반복으로 진행합니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
for (let n = 0; n < 4; n++) {
  if (n === 2) continue;
  console.log(n);
}
```

## 예상 결과

```text
0
1
3
```

## 동작 원리와 주의사항

for에서는 갱신식으로 이동합니다. while에서 갱신 전에 continue하면 조건이 변하지 않는 실수가 생길 수 있습니다.



## 직접 확인하기

짝수를 건너뛰도록 조건을 바꾸세요. break와 바꾸면 결과가 어떻게 달라지나요?

---

[전체 목차](../README.md) · [이전](../08.%20break/README.md) · [다음](../10.%20function%20%26%20return/README.md)
