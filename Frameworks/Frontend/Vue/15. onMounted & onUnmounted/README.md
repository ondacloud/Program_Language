# onMounted & onUnmounted

## 개념과 사용 시점

컴포넌트가 마운트된 뒤 자원을 만들고 해제될 때 정리합니다. 타이머·구독 같은 부수 효과에 사용합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 15번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import { ref, onMounted, onUnmounted } from "vue";
const seconds = ref(0);
let timer;
onMounted(() => { timer = setInterval(() => seconds.value++, 1000); });
onUnmounted(() => clearInterval(timer));
</script>
<template>
<p>{{ seconds }} seconds</p>
</template>
```

[실행 파일](Example.vue)

## 예상 결과

약 1초마다 숫자가 증가하고 다른 장으로 이동하면 타이머가 정리됩니다.

## 주의사항

해제 처리가 빠지면 보이지 않는 컴포넌트의 작업이 계속될 수 있습니다.

## 연습

타이머를 일시 정지하는 버튼을 추가하세요.

[과정 목차](../README.md)
