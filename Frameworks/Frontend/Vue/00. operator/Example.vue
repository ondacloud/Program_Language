<script setup>
const score = 80;
</script>
<template>
<p>{{ score + 5 }} / {{ score >= 70 ? "pass" : "retry" }}</p>
</template>
