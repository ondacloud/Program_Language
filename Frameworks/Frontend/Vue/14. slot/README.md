# slot

## 개념과 사용 시점

slot은 부모가 자식의 특정 위치에 UI 내용을 전달하는 기능입니다. named slot으로 위치를 구분합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 14번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import Panel from "./Panel.vue";
</script>
<template>
<Panel><template #title>Scores</template><p>Mina: 80</p></Panel>
</template>
```

[실행 파일](Example.vue)

## 예상 결과

Scores 제목 아래 Mina: 80이 표시됩니다.

## 주의사항

slot 내용은 보통 작성된 부모 스코프의 값을 사용합니다. 자식 값을 전달하려면 scoped slot을 사용하세요.

## 연습

footer named slot을 추가하세요.

[과정 목차](../README.md)
