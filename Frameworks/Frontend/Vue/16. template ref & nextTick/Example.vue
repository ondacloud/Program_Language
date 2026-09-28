<script setup>
import { ref, nextTick } from "vue";
const shown = ref(false);
const field = ref(null);
async function open() { shown.value = true; await nextTick(); field.value?.focus(); }
</script>
<template>
<button @click="open">Open input</button><input v-if="shown" ref="field" aria-label="Focused field" />
</template>
