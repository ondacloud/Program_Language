<script setup>
import { ref } from "vue";
const visible = ref(true);
</script>
<template>
<button @click="visible = !visible">Toggle</button><p v-show="visible">Still in DOM</p>
</template>
