import Vue from 'vue'
import App from './App'
import ApiService from '@/services/api/apiService.js'
import BootstrapVue from 'bootstrap-vue'
import router from './router'


import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

Vue.config.productionTip = false
Vue.use(BootstrapVue)

ApiService.init()

new Vue({
  render: h => h(App),
  router,
}).$mount('#app')
