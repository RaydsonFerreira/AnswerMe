<template>
<div id='login'>
    <div class='container'>
        <h1 class='titulo'>ANSWER ME</h1>
        <h2>Registre-se</h2>
        <form class='container caixaRegistro'>
            <div class="form-group">
                <input v-model="nome" type="text" class="form-control" id="InputName" aria-describedby="emailHelp" placeholder="NOME">
            </div>
            <div class="form-group">
                <input v-model="username" type="text" class="form-control" id="InputUsername" aria-describedby="emailHelp" placeholder="USERNAME">
            </div>
            <div class="form-group">
                <input v-model="senha" type="password" class="form-control" id="InputPassword" placeholder="SENHA">
            </div>
            <div class="form-group">
                <input v-model="confirmacaoSenha" type="password" class="form-control" id="InputPasswordConfirm" placeholder="CONFIRME A SENHA">
            </div>
            <button type="submit" class="btn btn-outline-warning" @click='registrar'>Registrar</button>
        </form>

        
    </div>
</div>
</template>

<script>
import RouterMixin from '@/utils/mixins/RouterMixin'
export default {
  name: 'Registro',
  mixins: [RouterMixin],

  data () {
      return{
          nome: '',
          username: '',
          senha: '',
          confirmacaoSenha: ''
      }
  },

  methods: {
    registrar () {
        if (!this.nome && !this.username && !this.senha && !this.confirmacaoSenha) {
            alert('preencha os campos')
        } else if(this.senha !== this.confirmacaoSenha) {
            alert('senhas não conferem! digite novamente')
        } else {
            //chamr servico de registro
            alert('Registro feito com sucesso!')
            this.goToLogin()
        }
    }
  }
}
</script>

<style scoped>
h1 {
    font-family: 'Heroes Legend' !important;
    font-size: 3em;
    display: inline;
}

.caixaRegistro{
    width: 50vw;
}

.btn-entrar{
    margin-right: 30px 
}
</style>
