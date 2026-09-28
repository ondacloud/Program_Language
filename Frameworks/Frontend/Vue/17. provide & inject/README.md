# provide & inject

## 개념과 사용 시점

여러 단계 아래로 값을 전달할 때 provide/inject를 사용할 수 있습니다. 변경 책임도 명확하게 전달하세요.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 17번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import { provide, ref, readonly } from "vue";
import Theme from "./Theme.vue";
const theme = ref("light");
provide("course-theme", readonly(theme));
</script>
<template>
<button @click="theme = theme === 'light' ? 'dark' : 'light'">Toggle</button><Theme />
</template>
```

[실행 파일](Example.vue)

## 예상 결과

자식에 표시되는 theme가 light·dark로 전환됩니다.

## 주의사항

작은 관계는 props가 더 명시적입니다. 큰 앱에서는 키 충돌을 피하도록 Symbol 키를 공유할 수 있습니다.

## 연습

형제 컴포넌트에서도 같은 값을 읽으세요.

[과정 목차](../README.md)
