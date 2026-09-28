<script setup>
const emit = defineEmits(["increase"]);
</script>
<template><button @click="emit('increase', 1)">+1</button></template>
