# 배열과 불변 갱신

## 핵심 개념

배열 메서드에는 원본 변경 메서드와 새 결과 생성 메서드가 섞여 있습니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
const original = [3, 1, 2];
const sorted = [...original].sort((a, b) => a - b);
const doubled = original.map(value => value * 2);
console.log(JSON.stringify(original));
console.log(JSON.stringify(sorted));
console.log(JSON.stringify(doubled.filter(value => value >= 4)));
```

## 예상 결과

```text
[3,1,2]
[1,2,3]
[6,4]
```

## 동작 원리와 주의사항

sort, reverse, push, splice는 원본을 바꿉니다. map, filter, slice는 새 배열을 만들지만 중첩 객체까지 깊게 복제하지는 않습니다. 숫자 정렬에 비교 함수를 생략하면 문자열 기준 정렬이 됩니다. reduce는 빈 입력을 고려해 초기값을 제공하세요.

## 직접 확인하기

[10,2,1]의 기본 sort와 수치 sort를 비교하세요.

---

---

---

[전체 목차](../README.md) · [이전](../10.%20function%20%26%20return/README.md) · [다음](../12.%20let%20%26%20const/README.md)
