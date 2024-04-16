/*
 * @Date: 2024-04-16 10:05:48
 * @LastEditors: shubingsun 952217382@qq.com
 * @LastEditTime: 2024-04-16 13:12:30
 * @FilePath: \my_project_web\src\main.ts
 */
import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'

import router from './router'

const app = createApp(App)

app.use(createPinia())
app.use(router)

app.mount('#app')
