<script setup>
import { ref } from "vue";
const name = ref("");
</script>
<template>
<label>Name <input v-model.trim="name" /></label>
<p>Hello, {{ name || "guest" }}</p>
</template>
