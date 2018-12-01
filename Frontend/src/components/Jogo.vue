<template>
<div id='jogo'>
    <div class='row'>
        <div class='col col-md-6'>
            <h1>ANSWER ME</h1>
        </div>
        <div class='col col-md-6'>
            <p class='placarTitulo'>placar</p>
            <p class='placar'>Raydson 1 x 1 Rafaela</p>
        </div>

        <div>
            <h5>Pergunta 1</h5>
            <div class='pergunta'>
                <p>
                    Lorem ipsum is a pseudo-Latin text used in web design, typography, layout, and printing in place of English to emphasise design elements over content. It's also called placeholder (or filler) text. It's a convenient tool for mock-ups. It helps to outline the visual elements of a document or presentation, eg typography, font, or layout.
                </p>
            </div>
        </div>

        <template>
            <div class='row'>
                <div class='col-1'>
                <b-form-group>
                <b-form-radio-group id="btnradios"
                                    buttons
                                        button-variant="outline-warning"
                                    stacked
                                    v-model="selected"
                                    :options="options"
                                    name="radioBtnStacked" />
                </b-form-group>
            </div>
                <div class='col-11'>
                    <p class='reposta1 resposta'>Resposta 1</p>
                    <p class='reposta2 resposta'>Resposta 2</p>
                    <p class='reposta3 resposta'>Resposta 3web design, typography, layout, and printing in place of English</p>
                    <p class='reposta4 resposta'>Resposta 4</p>
                </div>
            </div>
            <div class="align-left">
                <button class="btn btn-outline-warning" @click='responder'>Responder</button>
            </div>
        </template>
    </div>
</div>
</template>

<script>
import RouterMixin from '@/utils/mixins/RouterMixin'
export default {
  name: 'Jogo',
  mixins: [RouterMixin],

  data () {
      return{
            selected: '',
            options: [
                { text: 'a', value: 'a' },
                { text: 'b', value: 'b' },
                { text: 'c', value: 'c' },
                { text: 'd', value: 'd' }
            ]
      }
  },

  methods: {
      responder () {

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

</style>
