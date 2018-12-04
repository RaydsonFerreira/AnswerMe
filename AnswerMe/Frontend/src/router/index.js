import Vue from 'vue'
import Router from 'vue-router'
import Dashboard from '@/components/Dashboard'
import Login from '@/components/Login'
import Registro from '@/components/Registro'
import Jogo from '@/components/Jogo'
import Convites from '@/components/Convites'
import AdicionarAmigo from '@/components/AdicionarAmigo'
import EscolherAmigo from '@/components/EscolherAmigo'
import Desempenho from '@/components/Desempenho'
import IniciarJogo from '@/components/IniciarJogo'
import Resultado from '@/components/Resultado'
import SolicitacaoAmizade from '@/components/SolicitacaoAmizade'

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
    },
    {
      path: '/convitesPendentes',
      name: 'convites',
      component: Convites
    },
    {
      path: '/adicionarAmigo',
      name: 'adicionarAmigo',
      component: AdicionarAmigo
    },
    {
      path: '/escolherAmigo',
      name: 'escolherAmigo',
      component: EscolherAmigo
    },
    {
      path: '/desempenho',
      name: 'desempenho',
      component: Desempenho
    },
    {
      path: '/iniciarJogo',
      name: 'iniciarJogo',
      component: IniciarJogo
    },
    {
      path: '/resultado',
      name: 'resultado',
      component: Resultado
    },
    {
      path: '/solicitacaoAmizade',
      name: 'solicitacaoAmizade',
      component: SolicitacaoAmizade
    }
  ]
})
