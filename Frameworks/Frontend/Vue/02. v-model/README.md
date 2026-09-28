# v-model

## 개념과 사용 시점

v-model은 폼 값과 반응형 상태를 연결합니다. ref 값을 입력 필드와 함께 갱신합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 02번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import { ref } from "vue";
const name = ref("");
</script>
<template>
<label>Name <input v-model.trim="name" /></label>
<p>Hello, {{ name || "guest" }}</p>
</template>
```

[실행 파일](Example.vue)

## 예상 결과

이름 입력에 따라 인사말이 바뀝니다. 앞뒤 공백은 제거됩니다.

## 주의사항

입력값의 저장과 유효성 검사는 별개입니다. 숫자 입력은 빈 값과 잘못된 값을 처리하세요.

## 연습

최소 두 글자일 때만 인사말을 표시하세요.

[과정 목차](../README.md)
