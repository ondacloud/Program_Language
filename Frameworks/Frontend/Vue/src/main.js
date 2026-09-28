import { createApp, h } from 'vue';
import { createRouter, createWebHashHistory } from 'vue-router';
import App from './App.vue';
import './style.css';
const router = createRouter({ history: createWebHashHistory(), routes: [{ path: '/', redirect: '/hello' }, { path: '/hello', component: { render: () => h('p', 'Hello page') } }, { path: '/about', component: { render: () => h('p', 'About page') } }] });
createApp(App).use(router).mount('#app');
