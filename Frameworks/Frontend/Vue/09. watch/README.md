# watch

## 개념과 사용 시점

watch는 특정 상태 변경에 대응해 부수 효과를 실행할 때 사용합니다. 단순 값 계산에는 computed가 적합합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 09번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import { ref, watch } from "vue";
const name = ref("");
const message = ref("waiting");
watch(name, (value, old) => { message.value = `${old} -> ${value}`; });
</script>
<template>
<input aria-label="Name" v-model="name" /><p>{{ message }}</p>
</template>
```

[실행 파일](Example.vue)

## 예상 결과

입력 변경 전·후 값이 표시됩니다.

## 주의사항

비동기 요청은 오래된 응답이 최신 상태를 덮지 않도록 취소·정리 처리가 필요합니다.

## 연습

immediate: true 옵션으로 초기 실행 차이를 확인하세요.

[과정 목차](../README.md)
