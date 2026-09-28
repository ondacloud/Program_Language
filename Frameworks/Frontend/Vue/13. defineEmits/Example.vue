<script setup>
import { ref } from "vue";
import Increase from "./Increase.vue";
const count = ref(0);
</script>
<template>
<Increase @increase="count += $event" /><p>{{ count }}</p>
</template>
