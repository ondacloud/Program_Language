# 명령줄 인수와 프로세스

## 핵심 개념

process.argv는 실행 인수를, process.env는 환경 변수를 제공합니다. 종료 상태로 호출자에게 성공·실패를 알릴 수 있습니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
import { parseArgs } from "node:util";
const { values } = parseArgs({
  options: { name: { type: "string", default: "guest" } },
  allowPositionals: false
});
console.log(`Hello ${values.name}`);
```

## 예상 결과

```text
인수 없음: Hello guest
--name Alice: Hello Alice
```

## 동작 원리와 주의사항

process.argv의 앞 두 원소는 보통 실행 파일과 스크립트 경로입니다. parseArgs는 옵션 형식을 파싱하지만 업무 규칙까지 검증하지는 않습니다. 오류 메시지는 console.error, 실패 종료는 process.exitCode=1 등으로 표현합니다. process.exit()는 대기 중인 출력·정리를 중단할 수 있어 종료 흐름을 설계하세요.



## 직접 확인하기

알 수 없는 옵션, 값 없는 --name, 공백 포함 이름을 시험하세요.

---

---

---

[전체 목차](../README.md) · [이전](../12.%20Number%20%26%20isInteger/README.md) · [다음](../14.%20callback%20%26%20async%20%26%20await/README.md)
