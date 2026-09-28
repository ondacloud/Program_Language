# v-if & v-else

## 개념과 사용 시점

v-if는 조건에 따라 요소를 생성하거나 제거합니다. v-else는 바로 앞 분기의 반대 경우를 처리합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 03번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import { ref } from "vue";
const passed = ref(true);
</script>
<template>
<label><input type="checkbox" v-model="passed" />Passed</label>
<p v-if="passed">pass</p><p v-else>retry</p>
</template>
```

[실행 파일](Example.vue)

## 예상 결과

체크 해제 시 retry로 바뀝니다.

## 주의사항

요소 제거 시 내부 컴포넌트도 해제됩니다. 단순 표시 전환인 v-show와 다릅니다.

## 연습

세 등급을 v-else-if로 표현하세요.

[과정 목차](../README.md)
