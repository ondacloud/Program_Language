# 파일 경로와 URL

## 핵심 개념

운영체제 경로와 URL은 다른 형식입니다. path 유틸리티와 URL API를 용도에 맞게 사용합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
import { basename, extname } from "node:path";
import { fileURLToPath } from "node:url";

const file = fileURLToPath(new URL("./sample.txt", import.meta.url));
console.log(basename(file), extname(file));
const url = new URL("/search", "https://example.com");
url.searchParams.set("q", "hello world");
console.log(url.pathname, url.searchParams.get("q"));
```

## 예상 결과

```text
sample.txt .txt
/search hello world
```

## 동작 원리와 주의사항

상대 fs 경로는 process.cwd() 기준이고 import.meta.url 기반 URL은 모듈 파일 위치 기준입니다. URL.pathname을 Windows 경로로 바로 사용하지 말고 fileURLToPath로 변환하세요. join·resolve만으로 외부 입력 경로가 안전해지는 것은 아니며 허용 루트·심볼릭 링크·권한을 함께 고려합니다.



## 직접 확인하기

실행 디렉터리를 바꿔도 import.meta.url 기반 파일 위치는 같은지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../18.%20readFile%20%26%20writeFile/README.md) · [다음](../20.%20Readable%20%26%20Transform%20%26%20pipeline/README.md)
