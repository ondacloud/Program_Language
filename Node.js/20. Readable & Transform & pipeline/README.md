# 스트림과 역압

## 핵심 개념

스트림은 데이터를 작은 조각으로 처리합니다. 생산 속도가 소비 속도보다 빠르면 역압으로 메모리 증가를 조절합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
import { Readable, Transform, Writable } from "node:stream";
import { pipeline } from "node:stream/promises";

let output = "";
const upper = new Transform({
  transform(chunk, encoding, callback) {
    callback(null, chunk.toString("utf8").toUpperCase());
  }
});
const sink = new Writable({
  write(chunk, encoding, callback) { output += chunk.toString(); callback(); }
});
await pipeline(Readable.from(["hello ", "node"]), upper, sink);
console.log(output);
```

## 예상 결과

```text
HELLO NODE
```

## 동작 원리와 주의사항

pipeline은 역압과 오류 전파·정리에 도움을 줍니다. 예제의 ASCII 청크는 단순 변환용이며 임의의 UTF-8 파일 처리에는 경계를 보존하는 디코딩이 필요합니다. 수동 write()가 false를 반환하면 drain을 기다리는 흐름이 필요할 수 있습니다. 예제의 output 누적은 결과 확인용이므로 대용량 처리는 파일·네트워크 스트림으로 흘려 보내세요.



## 직접 확인하기

Transform 콜백에 Error를 전달하고 await pipeline의 실패를 처리하세요.

---

---

---

[전체 목차](../README.md) · [이전](../19.%20path%20%26%20URL/README.md) · [다음](../21.%20EventEmitter/README.md)
