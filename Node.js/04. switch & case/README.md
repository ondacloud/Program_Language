# switch / case / default

## 핵심 개념

한 값을 여러 case와 비교해 실행할 분기를 선택합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
const command = "save";
switch (command) {
  case "save": console.log("saved"); break;
  case "open": console.log("opened"); break;
  default: console.log("unknown");
}
```

## 예상 결과

```text
saved
```

## 동작 원리와 주의사항

case 비교는 엄격한 동등 비교입니다. break를 생략하면 뒤 분기까지 실행할 수 있습니다. default는 일치하는 case가 없을 때의 동작입니다.



## 직접 확인하기

명령을 open과 알 수 없는 문자열로 바꿔 보세요. break가 필요한 이유를 설명하세요.

---

[전체 목차](../README.md) · [이전](../03.%20if%20%26%20else/README.md) · [다음](../05.%20for/README.md)
