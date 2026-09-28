# composable

## 개념과 사용 시점

반응형 상태와 관련 동작을 함수로 추출하여 여러 컴포넌트에서 재사용합니다. 일반적으로 use 접두사를 사용합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 18번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import { useCounter } from "./useCounter.js";
const { count, increase } = useCounter();
</script>
<template>
<button @click="increase">{{ count }}</button>
</template>
```

[실행 파일](Example.vue)

## 예상 결과

클릭마다 count가 증가합니다.

## 주의사항

함수 안에서 만든 상태는 호출마다 독립적입니다. 모듈 최상위 상태는 공유될 수 있으므로 의도와 맞춰야 합니다.

## 연습

서로 독립적인 counter 두 개를 만드세요.

[과정 목차](../README.md)
