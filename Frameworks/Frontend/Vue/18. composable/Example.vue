<script setup>
import { useCounter } from "./useCounter.js";
const { count, increase } = useCounter();
</script>
<template>
<button @click="increase">{{ count }}</button>
</template>
