# v-bind & class & style

## 개념과 사용 시점

v-bind의 축약 :로 속성에 식을 연결합니다. class와 style은 객체·배열 형태도 지원합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 11번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import { ref } from "vue";
const active = ref(false);
</script>
<template>
<button @click="active = !active" :class="{ active }" :style="{ color: active ? 'green' : 'gray' }" :aria-pressed="active">{{ active ? "on" : "off" }}</button>
</template>
```

[실행 파일](Example.vue)

## 예상 결과

버튼을 누르면 색과 aria-pressed 상태가 바뀝니다.

## 주의사항

문자열 속성과 바인딩된 표현식은 다릅니다. 접근성 상태도 화면 상태와 맞추세요.

## 연습

disabled를 상태에 따라 바인딩하세요.

[과정 목차](../README.md)
