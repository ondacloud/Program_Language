# continue

## 핵심 개념

현재 반복의 나머지 본문을 건너뛰고 다음 반복으로 진행합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

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
