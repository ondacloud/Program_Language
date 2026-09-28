<script setup>
import { computed, ref } from 'vue';
const modules = import.meta.glob('../*/Example.vue', { eager: true, import: 'default' });
const lessons = Object.keys(modules).sort();
const selected = ref(lessons[0]);
const current = computed(() => modules[selected.value]);
</script>
<template><main><h1>Vue 구문별 실습</h1><label>예제 선택 <select v-model="selected"><option v-for="path in lessons" :key="path" :value="path">{{ path.split('/')[1] }}</option></select></label><hr /><component :is="current" :key="selected" /></main></template>
