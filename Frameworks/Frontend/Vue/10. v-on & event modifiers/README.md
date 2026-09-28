# v-on & event modifiers

## 개념과 사용 시점

@click은 v-on:click의 축약입니다. .prevent는 기본 동작을 막는 이벤트 수식어입니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 10번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import { ref } from "vue";
const submitted = ref(false);
function submit() { submitted.value = true; }
</script>
<template>
<form @submit.prevent="submit"><button>Submit</button></form><p>{{ submitted ? "saved" : "ready" }}</p>
</template>
```

[실행 파일](Example.vue)

## 예상 결과

페이지 새로고침 없이 saved로 바뀝니다.

## 주의사항

화면의 saved는 이 예제의 로컬 상태이며 서버 저장을 뜻하지 않습니다.

## 연습

클릭 횟수를 기록하고 .once를 비교하세요.

[과정 목차](../README.md)
