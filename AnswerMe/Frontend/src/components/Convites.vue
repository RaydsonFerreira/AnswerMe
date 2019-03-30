<template>
    <div id="convites">
        <div id='dashboard' class='container' align="middle">
            <h1 class='titulo'>ANSWER ME</h1>
            <h2 class='subtitulo'>Convites Pendentes:</h2>
            <!-- Tabela Convites Pendentes -->
            <table class="table table-sm">
                <thead class="thead">
                  <tr>
                    <th scope="col">Username</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Ação</th>
                  </tr>
                </thead>
                <tbody>
                  <tr v-for="(convite, index) in convites" :key="index">
                    <th scope="row">{{convite.usuarioEnvio.username}}</th>
                    <td>{{convite.usuarioEnvio.nome}}</td>
                    <td><button @click="aceitar(convite.usuarioEnvio.id)" type="submit" class="btn btn-outline-warning btn-default">Jogar</button></td>
                  </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
import ConviteService from '@/services/conviteService'
import JogoService from '@/services/jogoService'
import RouterMixin from '@/utils/mixins/RouterMixin'

export default {
    name: 'Convites',
    mixins: [RouterMixin],

    data () {
        return{
            convites: []
        }
    },

    methods: {
        aceitar (id) {
            localStorage.id_amigo = id
            ConviteService.aceitar(`convite/aceitar/${id}/${localStorage.id_usuario}`).then((result) => {
                JogoService.novoJogo(`jogo/${id}/${localStorage.id_usuario}`).then((result) => {
                    this.goTo('jogo')
                })
            })
        }
    },

    mounted () {
        ConviteService.getConvites(`convite/${localStorage.id_usuario}`).then((result) => {
            this.convites = result.data  
        })
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
        font-weight: 600;
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
