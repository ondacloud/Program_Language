<script setup>
import { ref, onMounted, onUnmounted } from "vue";
const seconds = ref(0);
let timer;
onMounted(() => { timer = setInterval(() => seconds.value++, 1000); });
onUnmounted(() => clearInterval(timer));
</script>
<template>
<p>{{ seconds }} seconds</p>
</template>
