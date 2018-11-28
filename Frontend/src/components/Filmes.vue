<template>
  <div id='filmes'>
    <h1>Busque os seus Filmes Favoritos</h1>
    <div class='container areaBusca'>
      <b-input-group>
        <b-form-input type="text" v-model='nomeDoFilme' placeholder='Digite o nome do Filme'></b-form-input>
        <b-btn variant="info" @click="buscarFilme" :disabled='!nomeDoFilme'>Buscar</b-btn>
      </b-input-group>
    </div>
    <div class='container areaTabela'>
      <template v-if="filmes">
        <b-table striped hover bordered :items="filmes" :fields="fields"></b-table>
      </template>
      <h2 v-if="msgFalha">{{msgFalha}}</h2>
    </div>
  </div>
</template>

<script>
import FilmesService from '@/services/filmesService'
export default {
  name: 'Filmes',

  data () {
    return {
      nomeDoFilme: '',
      filmes: '',
      fields: [
        {
           key: 'Title',
          label: 'Titulo',
        },
        { 
          key: 'Year',
          label: 'Ano',
          sortable: true
        }
      ],
      msgFalha: ''
    }
  },

  methods: {
    buscarFilme () {
      FilmesService.buscarPorNome(this.nomeDoFilme).then(result => {
        if (result.data.Response !== "False"){
          this.filmes = result.data.Search
          this.msgFalha = ''
        } else {
          this.filmes = ''
          this.msgFalha = 'Nenhum filme encontrado'
        }
      })
    }
  },

  mounted () {
    //this.buscarFilme('iron man')
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
.areaBusca {
  padding: 30px 15px 40px 15px;
}
</style>
