<template>
    <div id='dashboard' class='container' align="middle">
        <h1 class='titulo'>ANSWER ME</h1>
        <h2 class='subtitulo'>Adicionar Amigo:</h2>

        <!--Formulário Adicionar Amigo-->
        <form class="form-horizontal">
            <div class="form-group">
                <label for="inputUsername" class="col-sm-2 control-label">Username</label>
                <div class="col-sm-10">
                    <input v-model="username" type="username" class="form-control" id="inputUsername" placeholder="Username">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-1 col-sm-10">
                    <button type="submit" class="btn btn-lg btn-outline-warning btn-default" @click="paginaInicial">Adicionar</button>
                </div>
            </div>
        </form>
    </div>
</template>

<script>
import AmigoService from '@/services/amigoService'
import RouterMixin from '@/utils/mixins/RouterMixin'
export default {
    name: 'adicionarAmigo',
    mixins: [RouterMixin],
    methods: {
        paginaInicial () {
            AmigoService.addAmigo(`amigo/${localStorage.id_usuario}/${this.username}`).then((result) => {
                alert(result.data)
            })
            this.goTo('dashboard')
        },
    },
    data () {
        return{
            username: ''
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
    .btn-lg{
        margin-top: 15px;
    }
    .titulo{
        margin-bottom: 50px;
    }
    form{
        margin-top: 30px;
        width: 700px;
        border: black;
    }
    .subtitulo{
        margin-top: 40px;
        margin-bottom: 50px;
    }
    input,button,label{
        font-family: Helvetica Neue, Helvetica, sans-serif !important;
        font-weight: 600;
    }
</style>
