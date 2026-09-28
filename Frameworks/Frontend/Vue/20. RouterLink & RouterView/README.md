# RouterLink & RouterView

## 개념과 사용 시점

Vue Router는 주소에 따라 컴포넌트를 선택합니다. RouterLink는 탐색, RouterView는 현재 경로의 화면을 표시합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 20번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import { RouterLink, RouterView } from "vue-router";
</script>
<template>
<nav><RouterLink to="/hello">Hello</RouterLink> | <RouterLink to="/about">About</RouterLink></nav><RouterView />
</template>
```

[실행 파일](Example.vue)

## 예상 결과

링크를 누르면 아래 화면이 Hello page 또는 About page로 바뀝니다.

## 주의사항

실습은 hash history를 사용해 정적 호스팅 경로 재작성 없이 동작합니다. 실제 앱의 HTML5 history는 서버 fallback 설정이 필요합니다.

## 연습

세 번째 경로를 공통 router 설정에 추가하세요.

[과정 목차](../README.md)
