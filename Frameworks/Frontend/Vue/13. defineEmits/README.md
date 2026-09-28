# defineEmits

## 개념과 사용 시점

자식은 emit으로 사용자 동작을 부모에 알립니다. 상태를 소유한 부모가 변경을 결정합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 13번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import { ref } from "vue";
import Increase from "./Increase.vue";
const count = ref(0);
</script>
<template>
<Increase @increase="count += $event" /><p>{{ count }}</p>
</template>
```

[실행 파일](Example.vue)

## 예상 결과

자식 버튼 클릭마다 부모 count가 1씩 증가합니다.

## 주의사항

이벤트 payload 형태를 명확히 정하세요. 컴포넌트 이벤트는 DOM 이벤트처럼 모든 조상으로 자동 버블링하지 않습니다.

## 연습

증가량을 5로 바꿔 전달하세요.

[과정 목차](../README.md)
