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
            alert('Preencha os campos!')
        } else if(this.senha !== this.confirmacaoSenha) {
            alert('Senhas não conferem! Digite novamente!')
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
    @font-face {
        font-family: 'BD_Cartoon_Shout';
        src: url('~@/assets/fonts/BD_Cartoon_Shout.ttf');
    }
    h1 {
        font-family: 'BD_Cartoon_Shout' !important;
        font-size: 3em;
        display: inline;
    }
    h2 {
        font-size: 40px;
        font-weight: 900;
        margin-top: 30px !important;
        margin-bottom: 25px;
        font-family: Helvetica Neue, Helvetica, sans-serif !important;
    }

    .caixaRegistro{
        width: 50vw;
    }

    .btn{
        margin-right: 30px;
        font-size: 18px; 
    }
    
    input,button{
        font-family: Helvetica Neue, Helvetica, sans-serif !important;
        font-weight: 600;
    }
</style>
