# import & export

## 개념과 사용 시점

ES 모듈은 파일별 공개 값과 타입을 구분합니다. 타입만 가져오면 import type을 사용할 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "20. import & export/main.ts"
```

## 코드 읽기

```typescript
import { sum } from "./math.js";
import type { Pair } from "./math.js";
const values: Pair = [2, 3];
console.log(sum(...values));
export {};
```

[실행 파일](main.ts)

## 예상 결과

5

## 주의사항

NodeNext 프로젝트의 상대 import에는 출력 JS 확장자를 사용합니다. 실행기는 tsx로 원본 TS를 해석합니다.

## 연습

곱셈 함수를 export하고 가져오세요.

[과정 목차](../README.md)
