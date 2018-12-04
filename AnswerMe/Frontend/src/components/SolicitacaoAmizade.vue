<template>
    <div id='dashboard' class='container' align="middle">
        <h1 class='titulo'>ANSWER ME</h1>
        <h2 class='subtitulo'>Solicitação de Amizade:</h2>

        <!-- Tabela Solicitação de Amizade -->
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
                    <td><button type="submit" class="btn btn-outline-warning btn-default">Aceitar Solicitação</button></td>
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
