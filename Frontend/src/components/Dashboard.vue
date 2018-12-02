<template>
<div id='dashboard' class='container'>
    <h1 class='titulo'>ANSWER ME</h1>
    <h2>bem-vindo</h2>
    <div class='row justify-content-md-center botoes'>
        <div class='col col-lg-3'>
            <button type="button" class="btn btn-outline-warning buttonnew" @click="iniciarJogo">Novo Jogo</button>
        </div>
        <div class='col col-lg-3'>
            <button type="button" class="btn btn-outline-warning buutonadd" @click="adicionarAmigo">Adicionar Amigo</button>
        </div>
	<div class='col col-lg-3'>
            <button type="button" class="btn btn-outline-warning buutondes" @click="desempenho">Ver Desempenho</button>
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
            this.goTo('jogo')
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
<style>

h1 {
    font-family: 'Heroes Legend' !important;
    font-size: 3em;
    display: inline;
}

h2 {
    font-size: 40px;
    font-weight: 900;
    margin-top: 100px !important;
    margin-bottom: 25px;
}

.buttonnew, .buutonadd{
    width: 250px;
    font-family: Helvetica Neue, Helvetica, sans-serif !important;
}

.titulo{
    margin-bottom: 50px;
}

.botoes{
    margin-top: 15vh;
}

button{
    font-family: Helvetica Neue, Helvetica, sans-serif !important;
    font-weight: 600;
}

</style>
