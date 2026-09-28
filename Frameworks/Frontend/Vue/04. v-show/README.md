# v-show

## 개념과 사용 시점

v-show는 요소를 DOM에 유지하면서 display 스타일로 표시 여부를 바꿉니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 04번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import { ref } from "vue";
const visible = ref(true);
</script>
<template>
<button @click="visible = !visible">Toggle</button><p v-show="visible">Still in DOM</p>
</template>
```

[실행 파일](Example.vue)

## 예상 결과

버튼을 누르면 문구가 숨겨지거나 표시됩니다.

## 주의사항

초기 렌더링 비용은 남습니다. DOM 개발 도구에서 요소가 유지되는지 확인하세요.

## 연습

v-if로 바꾸고 DOM 차이를 비교하세요.

[과정 목차](../README.md)
