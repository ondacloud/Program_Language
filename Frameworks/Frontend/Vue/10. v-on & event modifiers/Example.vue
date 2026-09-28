<script setup>
import { ref } from "vue";
const submitted = ref(false);
function submit() { submitted.value = true; }
</script>
<template>
<form @submit.prevent="submit"><button>Submit</button></form><p>{{ submitted ? "saved" : "ready" }}</p>
</template>
