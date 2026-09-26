# 객체, 구조 분해, spread

## 핵심 개념

객체는 이름 있는 속성을 묶습니다. 구조 분해는 필요한 값을 꺼내고 spread는 속성을 복사합니다.

## 실행 방법

`node example.mjs`로 실행합니다. 브라우저 API를 사용하지 않는 ES 모듈 예제입니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
const user = { name: "Alice", settings: { theme: "light" } };
const { name, age = 20 } = user;
const copy = { ...user, name: "Bob" };
copy.settings.theme = "dark";
console.log(name, age, copy.name);
console.log(user.settings.theme);
```

## 예상 결과

```text
Alice 20 Bob
dark
```

## 동작 원리와 주의사항

spread는 얕은 복사입니다. 중첩 settings는 공유하므로 독립 갱신하려면 해당 수준도 복사합니다. 구조 분해 기본값은 undefined일 때만 적용되고 null에는 적용되지 않습니다. 속성 존재 확인에는 Object.hasOwn을 사용할 수 있습니다. JSON 왕복은 모든 타입의 일반 복사 수단이 아닙니다.

## 직접 확인하기

settings도 spread로 복사해 원본 theme가 light로 유지되게 바꾸세요.

---

---

---

[전체 목차](../README.md) · [이전](../18.%20function%20%26%20closure/README.md) · [다음](../20.%20Map%20%26%20Set/README.md)
