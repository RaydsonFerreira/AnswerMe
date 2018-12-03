<template>
    <div id='dashboard' class='container' align="middle">
        <h1 class='titulo'>ANSWER ME</h1>
        <h2 class='subtitulo'>Seu Desempenho:</h2>

        <!-- Dashboard contendo número total de questão acertadas, vitórias, derrotas e empates -->
        <table class="table table-sm table-bordered">
            <tbody>
                <tr>
                    <th scope="row">Nº de questões certas respondidas:</th>
                    <td>-</td>
                </tr>
                <tr>
                    <th scope="row">Nº de Vitórias:</th>
                    <td>-</td>
                </tr>
                <tr>
                    <th scope="row">Nº de Derrotas:</th>
                    <td>-</td>
                </tr>
                <tr>
                    <th scope="row">Nº de Empates:</th>
                    <td>-</td>
                </tr>
            </tbody>
        </table>
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
        width: 370px;
    }
    .thead{
        background-color: yellow;
        color: black;
    }
</style>