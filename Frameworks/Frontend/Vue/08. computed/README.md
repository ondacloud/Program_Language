# computed

## 개념과 사용 시점

computed는 다른 반응형 값에서 계산되는 파생 상태입니다. 의존성이 바뀔 때 갱신됩니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 08번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import { ref, computed } from "vue";
const price = ref(100);
const count = ref(2);
const total = computed(() => price.value * count.value);
</script>
<template>
<input aria-label="Count" type="number" v-model.number="count" /><p>Total: {{ total }}</p>
</template>
```

[실행 파일](Example.vue)

## 예상 결과

기본 합계 200, 수량 변경 시 새 합계를 표시합니다.

## 주의사항

getter 안에서 원본 상태를 변경하거나 네트워크 부수 효과를 실행하지 마세요.

## 연습

할인율을 적용한 computed 값을 추가하세요.

[과정 목차](../README.md)
