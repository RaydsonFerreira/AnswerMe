<script>
/**
 * Mixin para gerenciar e organizar
 * métodos de rotas
 */

export default {
  data () {
    return {
    }
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
     * Método para ir à página de Login
     */
    goToLogin () {
      this.$router.push('/')
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
  }
}
</script>
