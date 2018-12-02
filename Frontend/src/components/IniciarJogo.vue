<template>
    <div id='dashboard' class='container' align="middle">
        <h1 class='titulo'>ANSWER ME</h1>

        <!-- Pegar do BD -->
        <h2 class='subtitulo'>Usuário 1 x Usuário 2</h2>

        <!-- Botão Iniciar Partida -->
        <!-- Quando clicado aparecer mensagem: "Esperando outro jogador..." -->
        <button type="submit" class="btn btn-lg btn-outline-warning btn-default">Iniciar Partida</button>
    </div>
</template>

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
        background-color: yellow;
        color: black;
    }
    button{
        font-family: 'BD_Cartoon_Shout' !important;
    }
</style>