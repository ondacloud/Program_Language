<script setup>
import { ref, watch } from "vue";
const name = ref("");
const message = ref("waiting");
watch(name, (value, old) => { message.value = `${old} -> ${value}`; });
</script>
<template>
<input aria-label="Name" v-model="name" /><p>{{ message }}</p>
</template>
