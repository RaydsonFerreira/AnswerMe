<template>
<div id='jogo'>
    <div class='row'>
        <div class='col col-md-6'>
            <h1>ANSWER ME</h1>
        </div>
        <div class='col col-md-6'>
            <p class='placarTitulo'>PLACAR</p>
            <p class='placar'>Raydson 1 x 1 Rafaela</p>
        </div>
        <div class="perguntas" v-if="questao === 0">
            <h5>Pergunta 1</h5>
            <div class='pergunta'>
                <p>
                    {{jogo.perguntaResposta1.pergunta.questao}}
                </p>
            </div>
        </div>

        <template v-if="questao === 0">
            <div class='row'>
                <div class='col-1'>
                <b-form-group>
                <b-form-radio-group id="btnradios"
                                    buttons
                                        button-variant="outline-warning"
                                    stacked
                                    v-model="questoes.q1"
                                    :options="options"
                                    name="radioBtnStacked" />
                </b-form-group>
            </div>
                <div class='col-11 respostas'>
                    <p class='reposta1 resposta'>{{ jogo.perguntaResposta1.pergunta.alternativaA }}</p>
                    <p class='reposta2 resposta'>{{ jogo.perguntaResposta1.pergunta.alternativaB }}</p>
                    <p class='reposta3 resposta'>{{ jogo.perguntaResposta1.pergunta.alternativaC }}</p>
                    <p class='reposta4 resposta'>{{ jogo.perguntaResposta1.pergunta.alternativaD }}</p>
                </div>
            </div>
            <div class="align-left">
                <button class="btn btn-outline-warning" @click='responder(jogo.perguntaResposta1.id, questoes.q1)'>Responder</button>
            </div>
        </template>

        <div class="perguntas" v-if="questao === 1">
            <h5>Pergunta 1</h5>
            <div class='pergunta'>
                <p>
                    {{jogo.perguntaResposta2.pergunta.questao}}
                </p>
            </div>
        </div>
        
        <template v-if="questao === 1">
            <div class='row'>
                <div class='col-1'>
                <b-form-group>
                <b-form-radio-group id="btnradios"
                                    buttons
                                        button-variant="outline-warning"
                                    stacked
                                    v-model="questoes.q2"
                                    :options="options"
                                    name="radioBtnStacked" />
                </b-form-group>
            </div>
                <div class='col-11 respostas'>
                    <p class='reposta1 resposta'>{{jogo.perguntaResposta2.pergunta.alternativaA}}</p>
                    <p class='reposta2 resposta'>{{jogo.perguntaResposta2.pergunta.alternativaB}}</p>
                    <p class='reposta3 resposta'>{{jogo.perguntaResposta2.pergunta.alternativaC}}</p>
                    <p class='reposta4 resposta'>{{jogo.perguntaResposta2.pergunta.alternativaD}}</p>
                </div>
            </div>
            <div class="align-left">
                <button class="btn btn-outline-warning" @click='responder(jogo.perguntaResposta2.id, questoes.q2)'>Responder</button>
            </div>
        </template>

        <div class="perguntas" v-if="questao === 2">
            <h5>Pergunta 1</h5>
            <div class='pergunta'>
                <p>
                    {{jogo.perguntaResposta3.pergunta.questao}}
                </p>
            </div>
        </div>
        
        <template v-if="questao === 2">
            <div class='row'>
                <div class='col-1'>
                <b-form-group>
                <b-form-radio-group id="btnradios"
                                    buttons
                                        button-variant="outline-warning"
                                    stacked
                                    v-model="questoes.q3"
                                    :options="options"
                                    name="radioBtnStacked" />
                </b-form-group>
            </div>
                <div class='col-11 respostas'>
                    <p class='reposta1 resposta'>{{jogo.perguntaResposta3.pergunta.alternativaA}}</p>
                    <p class='reposta2 resposta'>{{jogo.perguntaResposta3.pergunta.alternativaB}}</p>
                    <p class='reposta3 resposta'>{{jogo.perguntaResposta3.pergunta.alternativaC}}</p>
                    <p class='reposta4 resposta'>{{jogo.perguntaResposta3.pergunta.alternativaD}}</p>
                </div>
            </div>
            <div class="align-left">
                <button class="btn btn-outline-warning" @click='responder(jogo.perguntaResposta3.id, questoes.q3)'>Responder</button>
            </div>
        </template>

        <div class="perguntas" v-if="questao === 3">
            <h5>Pergunta 1</h5>
            <div class='pergunta'>
                <p>
                    {{jogo.perguntaResposta4.pergunta.questao}}
                </p>
            </div>
        </div>
        
        <template v-if="questao === 3">
            <div class='row'>
                <div class='col-1'>
                <b-form-group>
                <b-form-radio-group id="btnradios"
                                    buttons
                                        button-variant="outline-warning"
                                    stacked
                                    v-model="questoes.q4"
                                    :options="options"
                                    name="radioBtnStacked" />
                </b-form-group>
            </div>
                <div class='col-11 respostas'>
                    <p class='reposta1 resposta'>{{jogo.perguntaResposta4.pergunta.alternativaA}}</p>
                    <p class='reposta2 resposta'>{{jogo.perguntaResposta4.pergunta.alternativaB}}</p>
                    <p class='reposta3 resposta'>{{jogo.perguntaResposta4.pergunta.alternativaC}}</p>
                    <p class='reposta4 resposta'>{{jogo.perguntaResposta4.pergunta.alternativaD}}</p>
                </div>
            </div>
            <div class="align-left">
                <button class="btn btn-outline-warning" @click='responder(jogo.perguntaResposta4.id, questoes.q4)'>Responder</button>
            </div>
        </template>

        <div class="perguntas" v-if="questao === 4">
            <h5>Pergunta 1</h5>
            <div class='pergunta'>
                <p>
                    {{jogo.perguntaResposta5.pergunta.questao}}
                </p>
            </div>
        </div>
        
        <template v-if="questao === 4">
            <div class='row'>
                <div class='col-1'>
                <b-form-group>
                <b-form-radio-group id="btnradios"
                                    buttons
                                        button-variant="outline-warning"
                                    stacked
                                    v-model="questoes.q5"
                                    :options="options"
                                    name="radioBtnStacked" />
                </b-form-group>
            </div>
                <div class='col-11 respostas'>
                    <p class='reposta1 resposta'>{{jogo.perguntaResposta5.pergunta.alternativaA}}</p>
                    <p class='reposta2 resposta'>{{jogo.perguntaResposta5.pergunta.alternativaB}}</p>
                    <p class='reposta3 resposta'>{{jogo.perguntaResposta5.pergunta.alternativaC}}</p>
                    <p class='reposta4 resposta'>{{jogo.perguntaResposta5.pergunta.alternativaD}}</p>
                </div>
            </div>
            <div class="align-left">
                <button class="btn btn-outline-warning" @click='finalizar(jogo.perguntaResposta5.id, questoes.q5)'>Responder</button>
            </div>
        </template>
    </div>
</div>
</template>

<script>
import RouterMixin from '@/utils/mixins/RouterMixin'
import JogoService from '@/services/jogoService'
export default {
  name: 'Jogo',
  mixins: [RouterMixin],

  mounted () {
      JogoService.getJogo('jogo/getJogo/1', 3).then((result) => {
        this.jogo = result.data  
      })
  },

  data () {
      return{
            selected: '',
            options: [
                { text: 'a', value: 'a' },
                { text: 'b', value: 'b' },
                { text: 'c', value: 'c' },
                { text: 'd', value: 'd' }
            ],
            questoes: {
                q1: '',
                q2: '',
                q3: '',
                q4: '',
                q5: ''
            },
            jogo: {},
            questao: 0
      }
  },

  methods: {
      responder (pr_id, alternativa) {
          JogoService.responder(`jogo/responder/${this.jogo.id}/1/${pr_id}/${alternativa}`)
          this.questao = this.questao + 1
      },

      finalizar (pr_id, alternativa) {
        this.responder(pr_id, alternativa)
        this.goTo('resultado')
      }
  }
}
</script>

<style scoped lang='sass'>
    /deep/ .btn 
        margin-top: 20px !important
        border-radius: 5px !important

    .resposta
        margin-top: 40px
        text-align: left
        font-size: 0.8em

    .reposta1
        margin-top: 25px !important


    .align-left
        width: 100%
        text-align: right

    @font-face 
        font-family: 'BD_Cartoon_Shout';
        src: url('~@/assets/fonts/BD_Cartoon_Shout.ttf');
    
    h1 
        font-family: 'BD_Cartoon_Shout' !important;
        font-size: 3em;
        display: inline;
    
    h2 
        font-size: 40px;
        font-weight: 900;
        margin-top: 30px !important;
        margin-bottom: 25px;
        font-family: Helvetica Neue, Helvetica, sans-serif !important;

    .placarTitulo
        font-size: 20px;
        font-weight: 700;

    p,h5,button
        font-family: Helvetica Neue, Helvetica, sans-serif !important;
    
    button
        font-weight: 600
    
    .perguntas
        width: 100%
    
    .respostas
        margin-top: -240px
        margin-left: 55px

</style>
