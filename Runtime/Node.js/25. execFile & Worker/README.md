# 자식 프로세스와 Worker

## 핵심 개념

외부 실행 파일은 child_process로, JavaScript CPU 계산 분리는 worker_threads로 처리할 수 있습니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
import { execFile } from "node:child_process";
import { promisify } from "node:util";

const run = promisify(execFile);
const { stdout } = await run(process.execPath, ["-e", "console.log(2 + 3)"], {
  windowsHide: true,
  timeout: 5000
});
console.log(stdout.trim());
```

## 예상 결과

```text
5
```

## 동작 원리와 주의사항

execFile은 기본적으로 셸을 거치지 않고 인수 배열을 전달합니다. exec에 사용자 문자열을 연결하면 셸 해석 문제가 생길 수 있습니다. 긴 출력은 버퍼 제한이 있는 execFile보다 spawn의 스트림 처리가 적합할 수 있습니다. Worker는 CPU 작업에 유용하지만 I/O 요청마다 만드는 기본 해법은 아니며 시작 비용·오류·종료 대기를 관리해야 합니다.

## Worker의 역할

Worker는 별도의 JavaScript 실행 스레드와 메시지 전달을 제공합니다. postMessage의 구조화 복사·전송 가능한 버퍼·공유 메모리는 비용과 소유권 의미가 다릅니다. 실제 서비스는 제한된 Worker 풀을 두고 큐·취소·자원 상한을 설계하세요.

## 직접 확인하기

자식 프로그램이 exit 2를 실행할 때 거부된 Promise의 오류를 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../24.%20Error%20%26%20cause/README.md) · [다음](../26.%20package.json%20%26%20npm/README.md)
