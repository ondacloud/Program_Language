<script setup>
import { ref, computed } from "vue";
const price = ref(100);
const count = ref(2);
const total = computed(() => price.value * count.value);
</script>
<template>
<input aria-label="Count" type="number" v-model.number="count" /><p>Total: {{ total }}</p>
</template>
