<script setup>
import { reactive } from "vue";
const student = reactive({ name: "Mina", score: 80 });
</script>
<template>
<button @click="student.score++">{{ student.name }}: {{ student.score }}</button>
</template>
