# Node.js 학습 가이드

분류용 상위 폴더 없이 실제 문법·함수 이름을 번호순으로 배치했습니다. 폴더에서 README와 실행 파일을 바로 확인하세요.

JavaScript 공통 문법은 [JavaScript 목차](../../Languages/JavaScript/README.md)와 함께 학습합니다.

## 실행 환경

Node.js 24.x에서 각 예제 폴더로 이동해 `node example.mjs`를 실행합니다. 표준 입력 장에서는 실행 후 값을 입력하고 Enter를 누릅니다.

## 목차

| 번호 | 문법·함수 | 설명 |
|---|---|---|
| 00 | [operator & const & let](00.%20operator%20%26%20const%20%26%20let/README.md) | Node에서 변수·자료형·연산자 시작 |
| 01 | [console.log & stdout.write](01.%20console.log%20%26%20stdout.write/README.md) | 출력 — console과 stdout |
| 02 | [readline.createInterface](02.%20readline.createInterface/README.md) | 입력 — readline과 표준 입력 |
| 03 | [if & else](03.%20if%20%26%20else/README.md) | if / else if / else |
| 04 | [switch & case](04.%20switch%20%26%20case/README.md) | switch / case / default |
| 05 | [for](05.%20for/README.md) | for |
| 06 | [while](06.%20while/README.md) | while |
| 07 | [do & while](07.%20do%20%26%20while/README.md) | do / while |
| 08 | [break](08.%20break/README.md) | break |
| 09 | [continue](09.%20continue/README.md) | continue |
| 10 | [function & return](10.%20function%20%26%20return/README.md) | 조건문·반복문·함수로 계산하기 |
| 11 | [Array & Object & JSON](11.%20Array%20%26%20Object%20%26%20JSON/README.md) | 배열·객체·구조 분해·JSON |
| 12 | [Number & isInteger](12.%20Number%20%26%20isInteger/README.md) | 명령줄 입력·문자열 변환·검증 |
| 13 | [process.argv & parseArgs](13.%20process.argv%20%26%20parseArgs/README.md) | 명령줄 인수와 프로세스 |
| 14 | [callback & async & await](14.%20callback%20%26%20async%20%26%20await/README.md) | 콜백·Promise·async의 기본 흐름 |
| 15 | [Buffer](15.%20Buffer/README.md) | Buffer와 인코딩 |
| 16 | [import & export & require](16.%20import%20%26%20export%20%26%20require/README.md) | ESM과 CommonJS |
| 17 | [setTimeout & Promise](17.%20setTimeout%20%26%20Promise/README.md) | 이벤트 루프와 비동기 I/O |
| 18 | [readFile & writeFile](18.%20readFile%20%26%20writeFile/README.md) | Promise 기반 파일 입출력 |
| 19 | [path & URL](19.%20path%20%26%20URL/README.md) | 파일 경로와 URL |
| 20 | [Readable & Transform & pipeline](20.%20Readable%20%26%20Transform%20%26%20pipeline/README.md) | 스트림과 역압 |
| 21 | [EventEmitter](21.%20EventEmitter/README.md) | EventEmitter와 리스너 수명 |
| 22 | [http.createServer](22.%20http.createServer/README.md) | 표준 HTTP 서버와 상태 코드 |
| 23 | [fetch & AbortController](23.%20fetch%20%26%20AbortController/README.md) | HTTP 클라이언트와 취소 |
| 24 | [Error & cause](24.%20Error%20%26%20cause/README.md) | 오류 경계와 자원 정리 |
| 25 | [execFile & Worker](25.%20execFile%20%26%20Worker/README.md) | 자식 프로세스와 Worker |
| 26 | [package.json & npm](26.%20package.json%20%26%20npm/README.md) | package.json, npm, 잠금 파일 |
| 27 | [node.test & assert](27.%20node.test%20%26%20assert/README.md) | 내장 테스트 runner와 비동기 검증 |
| 28 | [process.env](28.%20process.env/README.md) | 설정, 관측, 종료 흐름 |
| 29 | [node & process.versions](29.%20node%20%26%20process.versions/README.md) | Node.js 런타임과 표준 모듈 |

## 공식 참고 자료

- [Node 24 API](https://nodejs.org/docs/latest-v24.x/api/)
- [테스트 runner](https://nodejs.org/docs/latest-v24.x/api/test.html)
- [Worker threads](https://nodejs.org/docs/latest-v24.x/api/worker_threads.html)

[전체 과정](../../README.md)
