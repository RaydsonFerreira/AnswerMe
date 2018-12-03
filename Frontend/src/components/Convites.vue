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
                  <tr>
                    <th scope="row">-</th>
                    <td>-</td>
                    <td><button type="submit" class="btn btn-outline-warning btn-default">Jogar</button></td>
                  </tr>
                </tbody>
            </table>
        </div>
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
</style>
