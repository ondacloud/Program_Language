# TypeScript

실제 문법·함수·파일 규칙 이름을 번호순으로 배치했습니다. 기초 연산 → 출력 → 입력 → 조건 → 반복 → 함수·자료구조 → 해당 기술의 주요 기능 순서로 학습합니다. 프레임워크에서는 언어 문법과 UI·라우팅 API의 역할을 구분합니다.

## 준비와 실행

학습 기준: TypeScript 5.9, strict 타입 검사, Node.js 22.12 이상. JavaScript 실행 규칙 위에 정적 타입을 추가합니다. 타입은 외부 입력을 런타임에 자동 검증하지 않습니다.

```powershell
npm ci
npm run check
npm run example -- "00. operator/main.ts"
```

`tsx`가 지정 파일을 실행합니다. 입력 예제는 질문에 이름을 입력하고 Enter를 누르세요. 각 파일은 독립 모듈입니다.

## 구문별 목차

| 번호 | 문법·함수 |
|---|---|
| 00 | [operator](00.%20operator/README.md) |
| 01 | [console.log](01.%20console.log/README.md) |
| 02 | [readline & question](02.%20readline%20%26%20question/README.md) |
| 03 | [if & else](03.%20if%20%26%20else/README.md) |
| 04 | [switch & case](04.%20switch%20%26%20case/README.md) |
| 05 | [for](05.%20for/README.md) |
| 06 | [while & do while](06.%20while%20%26%20do%20while/README.md) |
| 07 | [break & continue](07.%20break%20%26%20continue/README.md) |
| 08 | [const & let](08.%20const%20%26%20let/README.md) |
| 09 | [function & return](09.%20function%20%26%20return/README.md) |
| 10 | [Array & map & filter](10.%20Array%20%26%20map%20%26%20filter/README.md) |
| 11 | [type & interface](11.%20type%20%26%20interface/README.md) |
| 12 | [union & typeof](12.%20union%20%26%20typeof/README.md) |
| 13 | [null & undefined & optional chaining](13.%20null%20%26%20undefined%20%26%20optional%20chaining/README.md) |
| 14 | [generic](14.%20generic/README.md) |
| 15 | [keyof & indexed access](15.%20keyof%20%26%20indexed%20access/README.md) |
| 16 | [Record & Pick & Partial](16.%20Record%20%26%20Pick%20%26%20Partial/README.md) |
| 17 | [class & implements](17.%20class%20%26%20implements/README.md) |
| 18 | [Promise & async & await](18.%20Promise%20%26%20async%20%26%20await/README.md) |
| 19 | [try & catch & unknown](19.%20try%20%26%20catch%20%26%20unknown/README.md) |
| 20 | [import & export](20.%20import%20%26%20export/README.md) |
| 21 | [satisfies & as const](21.%20satisfies%20%26%20as%20const/README.md) |

## 종합 연습

학생 이름과 점수를 입력받아 70점 이상만 표시하는 성적 목록을 만들어 보세요. 빈 이름·숫자가 아닌 값·경계값 70을 확인하고, 각 항목 삭제와 합계 계산을 추가하세요. UI 과정에서는 목록 항목의 안정된 key와 상태 소유 위치도 설명하세요.

[공식 문서](https://www.typescriptlang.org/docs/handbook/) · [전체 목차](../../README.md)
