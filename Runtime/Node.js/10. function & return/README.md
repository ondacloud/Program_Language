# 조건문·반복문·함수로 계산하기

## 핵심 개념

입력 검증과 계산을 함수로 분리하면 I/O 없이 기본 로직을 이해하고 테스트하기 쉽습니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
function total(values) {
  let result = 0;
  for (const value of values) {
    if (!Number.isFinite(value)) throw new TypeError("finite number required");
    if (value < 0) continue;
    result += value;
  }
  return result;
}
console.log(total([10, -2, 20]));
console.log(total([]));
try { total([NaN]); } catch (error) { console.log(error.message); }
```

## 예상 결과

```text
30
0
finite number required
```

## 동작 원리와 주의사항

return은 호출자에게 값을 전달하고 console.log는 출력합니다. continue는 해당 값만 건너뜁니다. 이 함수는 인수 배열을 수정하지 않습니다. 외부 데이터가 배열인지와 허용 숫자 범위까지 다뤄야 한다면 함수 경계에서 검증을 추가하세요.



## 직접 확인하기

음수만 있는 배열과 0을 시험하세요. 조건을 바꿔 음수를 오류로 처리하는 버전을 작성하세요.

---

---

---

[전체 목차](../README.md) · [이전](../09.%20continue/README.md) · [다음](../11.%20Array%20%26%20Object%20%26%20JSON/README.md)
