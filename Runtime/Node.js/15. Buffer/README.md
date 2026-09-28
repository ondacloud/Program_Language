# Buffer와 인코딩

## 핵심 개념

Buffer는 바이트열입니다. 문자열의 문자 수·UTF-16 코드 단위 수·UTF-8 바이트 수는 다를 수 있습니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
const text = "가A";
const data = Buffer.from(text, "utf8");
console.log(text.length, data.length);
console.log(data.toString("utf8"));
const view = data.subarray(0, 3);
console.log(view.toString("utf8"));
```

## 예상 결과

```text
2 4
가A
가
```

## 동작 원리와 주의사항

Buffer.subarray는 메모리를 공유합니다. 독립 복사는 Buffer.from(buffer)를 검토하세요. Buffer.alloc은 초기화하며 allocUnsafe는 사용 전 덮어쓰지 않으면 이전 메모리 내용 노출 위험이 있습니다. 스트림 청크가 UTF-8 문자 중간에서 나뉠 수 있어 청크마다 무조건 toString으로 연결하지 말고 디코더 또는 스트림 인코딩 기능을 사용합니다.



## 직접 확인하기

이모지를 추가하고 문자열 length와 바이트 길이를 비교하세요.

---

---

---

[전체 목차](../README.md) · [이전](../14.%20callback%20%26%20async%20%26%20await/README.md) · [다음](../16.%20import%20%26%20export%20%26%20require/README.md)
