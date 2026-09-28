# interpolation & v-text

## 개념과 사용 시점

{{ }} 보간과 v-text는 값을 텍스트로 화면에 출력합니다. HTML 문자열을 마크업으로 실행하지 않습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Vue 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run dev
# 브라우저 목차에서 01번을 선택합니다.
```

## 코드 읽기

```vue
<script setup>
const name = "<Mina>";
</script>
<template>
<p>{{ name }}</p>
<p v-text="name"></p>
</template>
```

[실행 파일](Example.vue)

## 예상 결과

두 줄 모두 <Mina>라는 글자를 표시합니다.

## 주의사항

v-html은 HTML을 삽입하므로 외부 입력을 그대로 전달하면 안 됩니다. 일반 텍스트에는 보간을 사용하세요.

## 연습

이름과 점수를 한 문장으로 표시하세요.

[과정 목차](../README.md)
