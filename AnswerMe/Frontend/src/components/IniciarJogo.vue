<template>
    <div id='dashboard' class='container' align="middle">
        <h1 class='titulo'>ANSWER ME</h1>

        <!-- Pegar do BD -->
        <h2 class='subtitulo'>Aguardando Seu amigo aceitar o convite</h2>

        <!-- Botão Iniciar Partida -->
        <!-- Quando clicado aparecer mensagem: "Esperando outro jogador..." -->
        <!-- <button type="submit" class="btn btn-lg btn-outline-warning btn-default" @click="iniciarJogo">Iniciar Partida</button> -->
    </div>
</template>

<script>
import RouterMixin from '@/utils/mixins/RouterMixin'
import ConviteService from '@/services/conviteService'
import JogoService from '@/services/jogoService'
export default {
    name: 'iniciarJogo',
    mixins: [RouterMixin],
    props: ["id_user"],
    data () {
        return {
            status: ''
        }
    },
    methods: {
        iniciarJogo () {
            // JogoService.novoJogo('jogo/1', 3).then(() => {
            this.goTo('jogo')
            // }).catch(() => {
            //     alert("ERRO")
            // });
        },
        getStatus () {
            ConviteService.verificarStatus(`/convite/status/${localStorage.id_usuario}/${this.id_user}`).then((result) => {
                this.status = result.data.status
            })
        }
    },
    mounted: {
        verificarStatus () {
            getStatus()
            while(this.status === 'aguardando') {
                window.setTimeout(getStatus(), 5000)
                console.log('TESTEEE')
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
        font-size: 4em;
        display: inline;
    }
    .titulo{
        margin-bottom: 50px;
    }
    .subtitulo{
        margin-top: 40px;
        margin-bottom: 50px;
        font-family: Helvetica Neue, Helvetica, sans-serif !important;
    }
    .thead{
        background-color: yellow;
        color: black;
    }
    button{
        font-family: Helvetica Neue, Helvetica, sans-serif !important;
        font-weight: 600;
    }
</style>