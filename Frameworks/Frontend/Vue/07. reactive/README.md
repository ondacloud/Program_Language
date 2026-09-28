# reactive

## 개념과 사용 시점

reactive는 객체를 반응형 Proxy로 만듭니다. 여러 관련 속성을 함께 관리할 때 사용합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 07번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import { reactive } from "vue";
const student = reactive({ name: "Mina", score: 80 });
</script>
<template>
<button @click="student.score++">{{ student.name }}: {{ student.score }}</button>
</template>
```

[실행 파일](Example.vue)

## 예상 결과

버튼을 누르면 score가 증가합니다.

## 주의사항

반응형 객체 속성을 단순 구조 분해하면 연결이 끊길 수 있습니다. toRefs 사용이나 원본 속성 접근을 검토하세요.

## 연습

이름 편집 필드를 추가하세요.

[과정 목차](../README.md)
