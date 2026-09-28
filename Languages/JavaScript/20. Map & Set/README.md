# Map과 Set

## 핵심 개념

Map은 키·값 저장소이고 Set은 중복 없는 값 집합입니다. 객체 키·원소는 참조 동일성을 기준으로 구별됩니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
const counts = new Map([["apple", 2]]);
counts.set("apple", counts.get("apple") + 1);
const unique = new Set([1, 1, 2]);
console.log(counts.get("apple"), counts.has("pear"));
console.log(JSON.stringify([...unique]));
console.log(new Set([{}, {}]).size);
```

## 예상 결과

```text
3 false
[1,2]
2
```

## 동작 원리와 주의사항

Map은 문자열 외의 키도 지원하며 size로 항목 수를 읽습니다. get 결과 undefined만으로 값 없음과 저장된 undefined를 구별할 수 없어 has를 사용합니다. Set은 객체 내용을 깊게 비교하지 않습니다. Map과 Set을 JSON.stringify만 하면 원소가 자동 직렬화되지 않습니다.

## 직접 확인하기

동일 객체를 두 번 Set에 넣으면 size가 1이 되는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../19.%20Object%20%26%20destructuring/README.md) · [다음](../21.%20String%20%26%20JSON/README.md)
