/*
 * @Date: 2024-04-16 10:05:48
 * @LastEditors: shubingsun 952217382@qq.com
 * @LastEditTime: 2024-04-16 13:27:43
 * @FilePath: \my_project_web\vite.config.ts
 */
import { fileURLToPath, URL } from 'node:url'

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import vueJsx from '@vitejs/plugin-vue-jsx'
import nightwatchPlugin from 'vite-plugin-nightwatch'
import VueDevTools from 'vite-plugin-vue-devtools'
import vitePluginCompression from 'vite-plugin-compression'

// https://vitejs.dev/config/
export default defineConfig({
  base:'/',
  plugins: [vue(), vueJsx(), nightwatchPlugin(), VueDevTools(),vitePluginCompression({
    verbose:true,
    disable:false,
    deleteOriginFile:false,
    threshold:5120,
    algorithm:'gzip',
    ext:'.gz',
  })],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url))
    }
  },
  build: {
    outDir: 'dist',
    minify:'terser',
    terserOptions:{
      compress:{
        drop_console:true,
        drop_debugger:true
      }
    },
    rollupOptions: {
      output: {
        chunkFileNames:'js/[name]-[hash].js',
        entryFileNames:'js/[name]-[hash].js',
        assetFileNames:'[ext]/[name]-[hash].[ext]',
        manualChunks(id: string) {
          if (id.includes('node_modules')) {
            return 'vendor'
          }
        }
      },
    },
  }
})
