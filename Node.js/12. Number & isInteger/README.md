# 명령줄 입력·문자열 변환·검증

## 핵심 개념

명령줄 인수는 문자열로 들어옵니다. 기본값 설정, 숫자 변환, 범위 검사를 나누어 처리합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
const raw = process.argv[2] ?? "3";
const quantity = Number(raw);
if (raw.trim() === "" || !Number.isInteger(quantity) || quantity < 0) {
  console.error("quantity must be a non-negative integer");
  process.exitCode = 1;
} else {
  console.log(quantity * 1000);
}
```

## 예상 결과

```text
3000
```

## 동작 원리와 주의사항

기본 실행 결과는 3000입니다. node example.mjs 4는 4000이며 bad는 오류 메시지와 종료 코드 1입니다. Number("")는 0이므로 빈 입력을 먼저 구분합니다. process.exitCode는 종료 상태를 지정하고 강제 즉시 종료를 피할 수 있습니다.



## 직접 확인하기

0·-1·1.5·bad를 전달하고 표준 출력·표준 오류·종료 코드를 각각 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../11.%20Array%20%26%20Object%20%26%20JSON/README.md) · [다음](../13.%20process.argv%20%26%20parseArgs/README.md)
