# 설정, 관측, 종료 흐름

## 핵심 개념

환경 변수는 문자열 입력이므로 시작 시 검증해야 합니다. 운영에서는 로그·메모리·종료 시간을 관찰할 수 있어야 합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
function loadConfig(env) {
  const port = Number(env.PORT ?? "3000");
  if (!Number.isInteger(port) || port < 1 || port > 65535) throw new Error("invalid PORT");
  return { port, mode: env.APP_MODE ?? "development" };
}
const config = loadConfig({ PORT: "4000", APP_MODE: "test" });
console.log(JSON.stringify(config));
```

## 예상 결과

```text
{"port":4000,"mode":"test"}
```

## 동작 원리와 주의사항

실제 앱에서는 loadConfig(process.env)로 호출하되 테스트는 명시적인 객체를 주입합니다. 로그에 비밀·전체 사용자 데이터를 넣지 마세요. heapUsed, RSS, 외부 Buffer 메모리는 서로 다른 지표입니다. 서버 종료는 새 요청 중단 → 진행 중 요청·작업 정리 → 제한 시간 후 종료처럼 설계하고 SIGTERM의 OS별 차이도 확인합니다.



## 직접 확인하기

PORT에 abc, 빈 값, 65536이 들어왔을 때 시작 단계에서 실패하도록 시험하세요.

---

---

---

[전체 목차](../README.md) · [이전](../27.%20node.test%20%26%20assert/README.md) · [다음](../29.%20node%20%26%20process.versions/README.md)
