<script setup>
import { RouterLink, RouterView } from "vue-router";
</script>
<template>
<nav><RouterLink to="/hello">Hello</RouterLink> | <RouterLink to="/about">About</RouterLink></nav><RouterView />
</template>
