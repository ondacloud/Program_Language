# operator

## 개념과 사용 시점

템플릿의 {{ }} 안에는 JavaScript 식을 사용할 수 있습니다. 계산과 비교는 JavaScript 문법입니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 00번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
const score = 80;
</script>
<template>
<p>{{ score + 5 }} / {{ score >= 70 ? "pass" : "retry" }}</p>
</template>
```

[실행 파일](Example.vue)

## 예상 결과

85 / pass

## 주의사항

템플릿에는 값을 계산하는 식을 넣습니다. 복잡한 로직은 computed 또는 함수로 분리하세요.

## 연습

나머지 연산으로 짝수 여부를 표시하세요.

[과정 목차](../README.md)
