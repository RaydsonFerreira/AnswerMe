<template>
<div id='login'>
    <div class=''>
        <h1 class='titulo'>ANSWER ME</h1>
        <h2>Login</h2>
        <form class='container caixaLogin'>
            <div class="form-group">
                <input v-model='username' type="text" class="form-control" id="InputUsername" aria-describedby="emailHelp" placeholder="USERNAME" required>
            </div>
            <div class="form-group">
                <input v-model="senha" type="password" class="form-control" id="InputPassword" placeholder="SENHA" required>
            </div>
            <button type="submit" class="btn btn-outline-warning btn-entrar" @click='logar'>Entrar</button>
            <button type="button" class="btn btn-outline-warning" @click='registrar'>Registrar-se</button>
        </form>

        
    </div>
</div>
</template>

<script>
import RouterMixin from '@/utils/mixins/RouterMixin'
export default {
  name: 'MainWrapper',
  mixins: [RouterMixin],

  data () {
    return{
        username: '',
        senha: ''
    }
  },

  methods: {
    logar () {
        if (this.username === '') {
            alert('preencha seu username')
        } else if (this.senha === '') {
            alert('preencha a senha')
        } else {
            //servico de validar o usuario
            // if serviço ok
            this.goTo('dashboard')
            //else usuario inexistente
        }
    },
    registrar () {
        this.goTo('registro')
    }
  }
}
</script>

<style scoped>
h1 {
    font-family: 'BD_Cartoon_Shout' !important;
    font-size: 3em;
    display: inline;
}

.caixaLogin{
    width: 50vw;
}

.btn-entrar{
    margin-right: 30px 
}
</style>
