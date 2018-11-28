import Vue from 'vue'
import Router from 'vue-router'
import Dashboard from '@/components/views/Dashboard'
import Consulta from '@/components/views/Consulta'
import CadastrarProcesso from '@/components/views/CadastrarProcesso'
import VisualizarProcesso from '@/components/views/VisualizarProcesso'
import CaixaEntrada from '@/components/views/CaixaEntrada'
import Analise from '@/components/views/Analise'
import AnalisarProcesso from '@/components/views/AnalisarProcesso'
import Favoritos from '@/components/views/Favoritos'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'dashboard',
      component: Dashboard
    },
    {
      path: '/consulta',
      name: 'consulta',
      component: Consulta
    },
    {
      path: '/caixa-de-entrada',
      name: 'caixa-de-entrada',
      component: CaixaEntrada
    },
    {
      path: '/analise',
      name: 'analise',
      component: Analise
    },
    {
      path: '/favoritos',
      name: 'favoritos',
      component: Favoritos
    },
    {
      path: '/cadastrar-processo',
      name: 'cadastrar-processo',
      component: CadastrarProcesso
    },
    {
      path: '/editar-processo/:idProcesso',
      name: 'editar-processo',
      params: { 'idProcesso': -1 },
      component: CadastrarProcesso
    },
    {
      path: '/visualizar-processo/:idProcesso',
      name: 'visualizar-processo',
      params: { 'idProcesso': -1 },
      props: true,
      component: VisualizarProcesso
    },
    {
      path: '/analisar-processo/:idProcesso',
      name: 'analisar-processo',
      params: { 'idProcesso': -1 },
      component: AnalisarProcesso
    }
  ]
})
