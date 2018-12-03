<template>
    <div id='dashboard' class='container' align="middle">
            <h1 class='titulo'>ANSWER ME</h1>
            <h2 class='subtitulo'>Escolher Amigo:</h2>

            <!-- Tabela Escolher Amigo -->
            <table class="table table-sm">
                <thead class="thead">
                  <tr>
                    <th scope="col">Username</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Ação</th>
                  </tr>
                </thead>
                <tbody>
                  <tr v-for = "(amigo, index) in amigos" :key = "index">
                    <th scope="row">{{amigo.usuario2.username}}</th>
                    <td>{{amigo.usuario2.nome}}</td>
                    <td><button type="submit" class="btn btn-outline-warning btn-default" @click="jogar(amigo.usuario2.id)">Jogar</button></td>
                  </tr>
                </tbody>
            </table>
        </div> 
</template>

<script>
import RouterMixin from '@/utils/mixins/RouterMixin'
import AmigoService from '@/services/amigoService'
import ConviteService from '@/services/conviteService'
export default {
    name: 'escolherAmigo',
    mixins: [RouterMixin],
    methods: {
        jogar (id_user) {
            ConviteService.convidar('convite/1', id_user).then(result => {
                this.goTo('iniciarJogo')
            })
        }
    },
    mounted () {
        AmigoService.getAmigos('amigo', 1).then((result) => {
            console.log(result.data)
            this.amigos = result.data
        })
    },
    data () {
        return{
            amigos: []
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
    .titulo{
        margin-bottom: 50px;
    }
    .subtitulo{
        margin-top: 40px;
        margin-bottom: 50px;
    }
    .table{
        width: 700px;
    }
    .thead{
        background-color: #FFC107;
        color: black;
    }
    .subtitulo, th,td,button{
        font-family: Helvetica Neue, Helvetica, sans-serif !important;
    }
    button{
        font-weight: 600;
    }
</style>