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
            <button class="btn btn-outline-warning btn-entrar" @click='logar'>Entrar</button>
            <button class="btn btn-outline-warning" @click='registrar'>Registrar-se</button>
        </form>
    </div>
</div>
</template>

<script>
import RouterMixin from '@/utils/mixins/RouterMixin'
// import LoginService from '@/services/loginService'
import UsuarioService from '@/services/usuarioService'
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
            alert('Preencha seu username!')
        } else if (this.senha === '') {
            alert('Preencha a senha!')
        } else {
            // let usuario = {
            //     username: this.username,
            //     senha: this.senha
            // }
            // LoginService.login('loginUsuario', 'usuario').then((result) => {
            //     alert(result.data)
            console.log("SUPIMPA")
            UsuarioService.getUsuarios("usuarios").then((result) => {
                console.log(result.data)
              let usuarios = result.data
              let auxbool = false
              usuarios.forEach(element => {
                if(element.username === this.username) {
                    localStorage.id_usuario = element.id
                    localStorage.nome_usuario = element.nome
                    localStorage.username_usuario = element.username
                    auxbool = true
                    this.goTo('dashboard')
                }                  
              });
              if(!auxbool){
                  alert("usuario não cadastrado")
              }  
            })
            // this.goTo('dashboard')
            // }).catch(() => {
            //     alert('usuario não encontrado! Cadastre-se')
            // });
        }
    },
    registrar () {
        this.goTo('registro')
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
        font-size: 4em;
        display: inline;
    }

    h2 {
        font-family: Helvetica Neue, Helvetica, sans-serif !important;
        font-size: 40px;
        font-weight: 900;
        margin-top: 20px !important;
        margin-bottom: 25px;
    }

    .caixaLogin{
        width: 50vw;
    }

    .btn-entrar{
        margin-right: 30px 
    }

    input,button{
        font-family: Helvetica Neue, Helvetica, sans-serif !important;
        font-weight: 600;
    }

</style>
