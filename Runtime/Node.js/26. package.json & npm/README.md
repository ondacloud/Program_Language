# package.json, npm, 잠금 파일

## 핵심 개념

package.json은 패키지 메타데이터·모듈 해석·실행 스크립트·의존성을 기록합니다. lockfile은 의존성 해석 결과 재현에 사용합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
import { readFile } from "node:fs/promises";
const pkg = JSON.parse(await readFile(new URL("./package.json", import.meta.url), "utf8"));
console.log(pkg.type);
console.log(pkg.scripts.start);
```

## 예상 결과

```text
module
node example.mjs
```

## 동작 원리와 주의사항

이 장은 외부 의존성이 없는 package.json을 동봉했습니다. npm run start 또는 npm start로 실행합니다. 일반적인 패키지 프로젝트는 package.json과 package-lock.json을 함께 관리하고 잠금 파일이 준비된 환경에서 npm ci로 설치합니다. npm ci는 lockfile과 manifest 불일치를 오류로 처리하며 node_modules를 재구성합니다. 버전 범위와 정확한 고정 버전을 구별하세요.



## 직접 확인하기

새 스크립트 check: node --check example.mjs를 추가하고 npm run check를 실행하세요.

---

---

---

[전체 목차](../README.md) · [이전](../25.%20execFile%20%26%20Worker/README.md) · [다음](../27.%20node.test%20%26%20assert/README.md)
