import Vue from 'vue'
import Router from 'vue-router'
import Dashboard from '@/components/Dashboard'
import Login from '@/components/Login'
import Registro from '@/components/Registro'
import Jogo from '@/components/Jogo'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/dashboard',
      name: 'dashboard',
      component: Dashboard
    },
    {
      path: '/registro',
      name: 'registro',
      component: Registro
    },
    {
      path: '/jogo',
      name: 'jogo',
      component: Jogo
    },
    {
      path: '/',
      name: 'login',
      component: Login
    }
  ]
})
