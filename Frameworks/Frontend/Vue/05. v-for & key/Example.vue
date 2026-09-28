<script setup>
import { ref } from "vue";
const students = ref([{ id: 1, name: "Mina" }, { id: 2, name: "Jin" }]);
</script>
<template>
<button @click="students.reverse()">Reverse</button>
<ul><li v-for="student in students" :key="student.id">{{ student.name }}</li></ul>
</template>
