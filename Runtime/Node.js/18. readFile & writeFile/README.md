# Promise 기반 파일 입출력

## 핵심 개념

node:fs/promises는 파일 작업을 Promise로 제공합니다. 자원 수명과 오류를 명시적으로 다룹니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
import { mkdtemp, writeFile, readFile, unlink, rmdir } from "node:fs/promises";
import { join } from "node:path";
import { tmpdir } from "node:os";

const directory = await mkdtemp(join(tmpdir(), "node-study-"));
const file = join(directory, "sample.txt");
try {
  await writeFile(file, "Hello file", { encoding: "utf8", flag: "wx" });
  console.log(await readFile(file, "utf8"));
} finally {
  await unlink(file).catch(error => { if (error.code !== "ENOENT") throw error; });
  await rmdir(directory);
}
```

## 예상 결과

```text
Hello file
```

## 동작 원리와 주의사항

예제는 자신이 만든 임시 파일 하나와 빈 디렉터리만 정리합니다. 기본 writeFile은 덮어쓰므로 필요하면 wx로 기존 파일 존재를 오류로 만듭니다. 인코딩을 지정하지 않은 readFile은 Buffer를 반환합니다. 먼저 존재를 확인하고 나중에 읽기보다 실제 작업의 오류를 처리하면 검사·사용 사이의 상태 변경에 대응하기 쉽습니다. 같은 파일 동시 쓰기 순서도 직접 관리해야 합니다.



## 직접 확인하기

파일 내용을 한글로 바꾸어 UTF-8 왕복을 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../17.%20setTimeout%20%26%20Promise/README.md) · [다음](../19.%20path%20%26%20URL/README.md)
