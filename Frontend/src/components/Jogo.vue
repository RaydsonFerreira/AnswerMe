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
            <div>
                <b-form-group>
                <b-form-radio-group id="btnradios"
                                    buttons
                                    stacked
                                    v-model="selected"
                                    :options="options"
                                    name="radioBtnStacked" />
                </b-form-group>
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
            selected: 'radio1',
            options: [
                { text: 'a', value: 'a' },
                { text: 'b', value: 'b' },
                { text: 'c', value: 'c' },
                { text: 'd', value: 'd' }
            ]
      }
  },

  methods: {

  }
}
</script>

<style scoped lang='sass'>
/deep/ .btn 
    margin-top: 20px !important
    border-radius: 5px !important

</style>
