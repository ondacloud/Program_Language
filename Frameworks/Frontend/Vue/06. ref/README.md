# ref

## 개념과 사용 시점

ref는 반응형 값을 감쌉니다. 스크립트에서는 .value로 접근하고 템플릿에서는 일반적으로 자동으로 풀립니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 06번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import { ref } from "vue";
const count = ref(0);
function increase() { count.value++; }
</script>
<template>
<button @click="increase">Count: {{ count }}</button>
</template>
```

[실행 파일](Example.vue)

## 예상 결과

클릭할 때마다 0에서 1씩 증가합니다.

## 주의사항

일반 지역 변수 변경만으로 화면 반응성을 기대하지 마세요. ref 객체와 .value의 차이를 구분하세요.

## 연습

감소 버튼과 초기화 버튼을 추가하세요.

[과정 목차](../README.md)
