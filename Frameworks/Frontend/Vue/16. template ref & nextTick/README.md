# template ref & nextTick

## 개념과 사용 시점

템플릿 ref로 실제 요소를 참조합니다. nextTick은 반응형 변경이 DOM에 반영된 다음 작업이 필요할 때 사용합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 16번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import { ref, nextTick } from "vue";
const shown = ref(false);
const field = ref(null);
async function open() { shown.value = true; await nextTick(); field.value?.focus(); }
</script>
<template>
<button @click="open">Open input</button><input v-if="shown" ref="field" aria-label="Focused field" />
</template>
```

[실행 파일](Example.vue)

## 예상 결과

버튼을 누르면 입력란이 생성되고 포커스가 이동합니다.

## 주의사항

DOM이 생기기 전에 ref는 null일 수 있습니다. 포커스 이동이 사용자 흐름에 맞는지 확인하세요.

## 연습

닫기 버튼을 만들고 포커스를 복원하세요.

[과정 목차](../README.md)
