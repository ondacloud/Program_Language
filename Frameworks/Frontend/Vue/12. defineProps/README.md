# defineProps

## 개념과 사용 시점

부모가 자식에게 전달하는 입력 계약을 props로 정의합니다. 단방향 데이터 흐름을 유지합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 12번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
import Card from "./Card.vue";
</script>
<template>
<Card name="Mina" :score="80" />
</template>
```

[실행 파일](Example.vue)

## 예상 결과

Mina: 80

## 주의사항

자식에서 prop 자체를 변경하지 마세요. 변경 요청은 이벤트로 부모에 전달합니다.

## 연습

기본값이 있는 team prop을 추가하세요.

[과정 목차](../README.md)
