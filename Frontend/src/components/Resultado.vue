<template>
    <div id='dashboard' class='container' align="middle">
        <h1 class='titulo'>ANSWER ME</h1>

        <!-- Vitória, Derrota, Empate -->
        <h2 class='subtitulo'>Resultado</h2>
        <img src="coroa.png" alt="Coroa Dourada" width="200">

        <!-- Pegar do resultado da partida -->
        <p><b>Número de questões acertadas:</b> -</p>

        <!-- Botão Página Inicial -->
        <button type="submit" class="btn btn-lg btn-outline-warning btn-default">Página Inicial</button>
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
    p{
        font-size: 20px;
        margin-bottom: 30px;
    }
    img{
        margin-bottom: 20px;
    }
</style>