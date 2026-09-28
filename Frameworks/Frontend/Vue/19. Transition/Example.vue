<script setup>
import { ref } from "vue";
const visible = ref(true);
</script>
<template>
<button @click="visible = !visible">Toggle</button><Transition name="fade"><p v-if="visible">Hello</p></Transition>
</template>
