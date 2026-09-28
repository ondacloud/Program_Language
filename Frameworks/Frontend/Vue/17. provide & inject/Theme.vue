<script setup>
import { inject } from "vue";
const theme = inject("course-theme", "unknown");
</script>
<template><p>Theme: {{ theme }}</p></template>
