<script setup>
import { ref } from "vue";
const active = ref(false);
</script>
<template>
<button @click="active = !active" :class="{ active }" :style="{ color: active ? 'green' : 'gray' }" :aria-pressed="active">{{ active ? "on" : "off" }}</button>
</template>
