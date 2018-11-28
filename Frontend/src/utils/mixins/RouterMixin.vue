<script>
/**
 * Mixin para gerenciar e organizar
 * métodos de rotas
 */

import ProcessoService from '@/services/ProcessoService.js'
import UserService from '@/services/UsuarioService.js'

export default {
  data () {
    return {
      numeroProcesso: '',
      usuario: ''
    }
  },
  created () {
    this.getNomeUsuario()
  },
  name: 'RouterMixin',
  methods: {
    /**
     * Método para voltar à rota anterior
     */
    goBack () {
      this.$router.back()
    },

    /**
     * Método para ir à página Dashboard
     */
    goToDashboard () {
      this.$router.push('/')
    },

    /**
     * Método para navegar para a página '/produtividade/regiao-analise'
     */
    goToConsulta () {
      this.$router.push({ name: 'consulta' })
    },

    /**
     * Método para navegar para a página '/caixa-de-entrada'
     */
    goToInbox () {
      this.$router.push({ name: 'caixa-de-entrada' })
    },

    /**
     * Método para navegar para a página '/analise'
     */
    goToAnalise () {
      this.$router.push({ name: 'analise' })
    },

    /**
     * Método para navegar para a página '/produtividade/tecnico'
     */
    goToFavoritos () {
      this.$router.push({ name: 'favoritos' })
    },

    /**
     * Método para navegar para a página '/consultar'
     */
    goToConsultarProcessos () {
      this.$router.push({ name: 'consultar-processos' })
    },

    /**
     * Método para navegar para a página '/consultar'
     */
    goToCadastrarEditarProcesso (idProcesso) {
      if (idProcesso) {
        this.$router.push({ name: 'editar-processo', params: { 'idProcesso': idProcesso } })
      } else {
        this.$router.push({ name: 'cadastrar-processo' })
      }
    },
    /**
     * Método para navegar para a página '/visualizar-processo'
     */
    goToVisualizarProcesso (idProcesso, numeroProcesso, verificarPermissao) {
      this.$router.push({ name: 'visualizar-processo', params: { 'idProcesso': idProcesso, 'numeroProcesso': numeroProcesso, 'verificarPermissao': verificarPermissao } })
    },

    /**
     * Método para navegar para a página '/continuar análise.'
     */
    goToAnalisarProcesso (idProcesso, numeroProcesso) {
      this.$router.push({ name: 'analisar-processo', params: { 'idProcesso': idProcesso, 'numeroProcesso': numeroProcesso } })
    },

    /**
     * Método para navegar para a página '/produtividade/gerente-operacional/{id}/detalhes'
     *
     * @param id - Código do Gerente Operacional
     */

    /**
     * Método para deslogar do sistema
     */
    logout () {
      window.location.href = `${process.env.VUE_APP_HOME_ENTRADA_UNICA}`
    },

    /**
     * Retorna se a rota passada esta ativa
     *
     * @param rota - nome da rota a se checar
     * @returns {Boolean}
     */
    activeRouter (rota) {
      return rota === this.$route.name
    },
    /**
     * Retorna se ao menos uma das rotas enviadas está ativa
     *
     * @param rotas - Lista de  nome de rotas
     * @returns {Boolean} - Verdadeiro se uma das rotas enviadas estiver ativa
     */
    activeRoutes (rotas) {
      let active = false
      rotas.forEach(rota => {
        active = active || this.activeRouter(rota)
      })
      return active
    },

    /**
     * Método que recebe o nome da rota,
     * e redireciona para mesma
     *
     * @param route
     */
    goTo (route) {
      this.$router.push({ name: route })
    },

    buscarprocesso () {
      ProcessoService.buscarPorId(this.$route.params.idProcesso).then(resultado => {
        this.numeroProcesso = resultado.data.numero
      })
    },

    getNomeUsuario () {
      UserService.get().then(result => {
        this.usuario = result.data.nome
      })
    },

    getRotaAtual () {
      if (this.$route.name === 'caixa-de-entrada') {
        return 'Caixa de Entrada'
      } else if (this.$route.name === 'dashboard') {
        return 'Início'
      } else if (this.$route.name === 'consulta') {
        return 'Consulta'
      } else if (this.$route.name === 'analise') {
        return 'Analise'
      } else if (this.$route.name === 'favoritos') {
        return 'Favoritos'
      } else if (this.$route.name === 'consultar-processos') {
        return 'Consultar Processos'
      } else if (this.$route.name === 'cadastrar-processo') {
        return 'Cadastrar Processo'
      } else if (this.$route.name === 'editar-processo') {
        return 'Editar Processo'
      } else if (this.$route.name === 'visualizar-processo') {
        return 'Visualizar Processo'
      } else if (this.$route.name === 'analisar-processo') {
        return 'Analisar Processo'
      } else if (this.$route.name === 'nome-da-rota') {
        return 'Nome da rota'
      }

      return this.$route.name
    },

    getDescricaoRotaAtual () {
      if (this.$route.name === 'caixa-de-entrada') {
        return 'Caixa de Entrada'
      } else if (this.$route.name === 'dashboard') {
        return 'Bem vindo, ' + this.usuario
      } else if (this.$route.name === 'consulta') {
        return 'Consulta'
      } else if (this.$route.name === 'analise') {
        return 'Analise'
      } else if (this.$route.name === 'favoritos') {
        return 'Favoritos'
      } else if (this.$route.name === 'consultar-processos') {
        return 'Consultar Processos'
      } else if (this.$route.name === 'cadastrar-processo') {
        return 'Cadastrar Processo'
      } else if (this.$route.name === 'editar-processo') {
        return 'Editar Processo'
      } else if (this.$route.name === 'visualizar-processo') {
        this.buscarprocesso()
        return this.numeroProcesso
      } else if (this.$route.name === 'analisar-processo') {
        return 'Analisar Processo'
      } else if (this.$route.name === 'nome-da-rota') {
        return 'Nome da rota'
      }

      return this.$route.name
    }
  }
}
</script>
