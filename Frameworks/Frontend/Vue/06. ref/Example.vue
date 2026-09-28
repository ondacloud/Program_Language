<script setup>
import { ref } from "vue";
const count = ref(0);
function increase() { count.value++; }
</script>
<template>
<button @click="increase">Count: {{ count }}</button>
</template>
