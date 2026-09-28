<script setup>
import { provide, ref, readonly } from "vue";
import Theme from "./Theme.vue";
const theme = ref("light");
provide("course-theme", readonly(theme));
</script>
<template>
<button @click="theme = theme === 'light' ? 'dark' : 'light'">Toggle</button><Theme />
</template>
