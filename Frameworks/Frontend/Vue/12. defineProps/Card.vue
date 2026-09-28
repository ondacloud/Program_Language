<script setup>
defineProps({ name: { type: String, required: true }, score: { type: Number, default: 0 } });
</script>
<template><p>{{ name }}: {{ score }}</p></template>
