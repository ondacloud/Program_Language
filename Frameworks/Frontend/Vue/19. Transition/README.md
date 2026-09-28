# Transition

## 개념과 사용 시점

Transition은 요소가 들어오고 나갈 때 CSS 전환 클래스를 적용합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 19번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import { ref } from "vue";
const visible = ref(true);
</script>
<template>
<button @click="visible = !visible">Toggle</button><Transition name="fade"><p v-if="visible">Hello</p></Transition>
</template>
```

[실행 파일](Example.vue)

## 예상 결과

문구가 나타나고 사라질 때 불투명도가 전환됩니다.

## 주의사항

애니메이션을 줄이는 사용자 환경을 존중하세요. 전환은 상태 변경 로직을 대신하지 않습니다.

## 연습

전환 시간을 0.3초로 바꾸세요.

[과정 목차](../README.md)
