<template>
  <div id='dashboard' class='container'>
    <h1 class='titulo'>ANSWER ME</h1>
    <h2>Boas-vindas!</h2>
    <div class='row justify-content-md-center botoes'>
        <div class='col col-lg-3'>
            <button type="button" class="btn btn-outline-warning buttonnew" @click="iniciarJogo">Novo Jogo</button>
        </div>
        <div class='col col-lg-3'>
            <button type="button" class="btn btn-outline-warning buutonadd" @click="adicionarAmigo">Adicionar Amigo</button>
        </div>
	<div class='col col-lg-3'>
            <button type="button" class="btn btn-outline-warning buttondes" @click="desempenho">Ver Desempenho</button>
        </div>
    </div>
  </div>
</template>
<script>
import RouterMixin from '@/utils/mixins/RouterMixin'
export default {
    name: 'dashboard',
    mixins: [RouterMixin],
    methods: {
        iniciarJogo () {
            this.goTo('escolherAmigo')
        },
	adicionarAmigo(){
            this.goTo('adicionarAmigo')
	},
	desempenho(){
            this.goTo('desempenho')
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
        font-size: 40px;
        font-weight: 900;
        margin-top: 100px !important;
        margin-bottom: 25px;
        font-family: Helvetica Neue, Helvetica, sans-serif !important;
    }

    .buttonnew, .buutonadd, .buttondes{
        width: 250px;
        font-family: Helvetica Neue, Helvetica, sans-serif !important;
        font-weight: 600;
    }

    .titulo{
        margin-bottom: 50px;
    }

    .botoes{
        margin-top: 15vh;
    }

</style>
