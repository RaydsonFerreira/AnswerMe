<template>
<div id='dashboard' class='container'>
    <h1 class='titulo'>ANSWER ME</h1>
    <h2>bem-vindo</h2>
    <div class='row justify-content-md-center botoes'>
        <div class='col col-lg-3'>
            <button type="button" class="btn btn-outline-warning buttonnew" @click="iniciarJogo">Novo Jogo</button>
        </div>
        <div class='col col-lg-3'>
            <button type="button" class="btn btn-outline-warning buutonadd">Adicionar Amigo</button>
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
        }
    }
    
}
</script>
<style>

@font-face {
    font-family: 'BD_Cartoon_Shout';
    src: url('~@/assets/fonts/BD_Cartoon_Shout.ttf');
}

h1 {
    font-family: 'BD_Cartoon_Shout' !important;
    font-size: 3em;
    display: inline;
}

.buttonnew, .buutonadd{
    width: 250px;
    font-family: 'BD_Cartoon_Shout' !important;
}

.titulo{
    margin-bottom: 50px;
}

.botoes{
    margin-top: 15vh;
}

</style>
