# v-for & key

## 개념과 사용 시점

v-for는 배열로 반복 요소를 만듭니다. key는 항목의 동일성을 알려 주는 안정된 식별자입니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 05번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import { ref } from "vue";
const students = ref([{ id: 1, name: "Mina" }, { id: 2, name: "Jin" }]);
</script>
<template>
<button @click="students.reverse()">Reverse</button>
<ul><li v-for="student in students" :key="student.id">{{ student.name }}</li></ul>
</template>
```

[실행 파일](Example.vue)

## 예상 결과

Mina·Jin 목록이 표시되며 Reverse로 순서가 바뀝니다.

## 주의사항

재정렬되는 항목의 key로 배열 인덱스를 사용하지 마세요. v-if와 v-for는 같은 요소에서 섞기보다 계산된 목록을 사용하세요.

## 연습

새 고유 id 항목을 추가하세요.

[과정 목차](../README.md)
