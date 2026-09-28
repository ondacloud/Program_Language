# 출력 — console과 stdout

## 핵심 개념

console.log는 줄바꿈을 붙이고 process.stdout.write는 제공한 문자열을 그대로 출력합니다.

## 실행 방법

Node.js 24.x 환경에서 이 폴더의 `node example.mjs`를 실행합니다. 표준 모듈만 사용하는 예제는 npm install이 필요 없습니다.

[실습 파일](example.mjs)

## 실행 예제

```javascript
console.log("Hello Node.js");
process.stdout.write("one ");
process.stdout.write("two\n");
console.log(`sum=${2 + 3}`);
```

## 예상 결과

```text
Hello Node.js
one two
sum=5
```

## 동작 원리와 주의사항

stdout.write에는 문자열 또는 바이트 데이터를 전달합니다. 진단 오류는 console.error로 stderr에 보낼 수 있습니다. 큰 데이터의 스트림 쓰기는 backpressure 처리까지 고려해야 하지만 이 예제는 짧은 출력만 다룹니다.



## 직접 확인하기

마지막 줄바꿈을 제거해 프롬프트 위치를 확인하세요. console.error를 추가해 stdout 리디렉션과 구분하세요.

---

---

[전체 목차](../README.md) · [이전](../00.%20operator%20%26%20const%20%26%20let/README.md) · [다음](../02.%20readline.createInterface/README.md)
