<template>
    <div id='dashboard' class='container' align="middle">
        <h1 class='titulo'>ANSWER ME</h1>
        <h2 class='subtitulo'>Adicionar Amigo:</h2>

        <!--Formulário Adicionar Amigo-->
        <form class="form-horizontal">
            <div class="form-group">
                <label for="inputUsername" class="col-sm-2 control-label">Username</label>
                <div class="col-sm-10">
                    <input type="username" class="form-control" id="inputUsername" placeholder="Username">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-1 col-sm-10">
                    <button type="submit" class="btn btn-lg btn-outline-warning btn-default">Procurar</button>
                </div>
            </div>
        </form>
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
    .btn-lg{
        font-family: 'BD_Cartoon_Shout' !important;
        margin-top: 15px;
    }
    .titulo{
        margin-bottom: 50px;
    }
    form{
        margin-top: 30px;
        width: 700px;
        border: black;
    }
    .subtitulo{
        margin-top: 40px;
        margin-bottom: 50px;
    }
</style>