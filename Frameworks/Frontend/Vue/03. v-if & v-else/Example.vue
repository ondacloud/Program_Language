<script setup>
import { ref } from "vue";
const passed = ref(true);
</script>
<template>
<label><input type="checkbox" v-model="passed" />Passed</label>
<p v-if="passed">pass</p><p v-else>retry</p>
</template>
