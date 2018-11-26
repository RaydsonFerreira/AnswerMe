<template lang='pug'>
#main-wrapper
  el-container
    Filmes

    .Footer
    | © 2018 - Answer Me

</template>

<script>
import Filmes from './Filmes'
export default {
  name: 'MainWrapper',
  components: { Filmes },

  methods: {
  }
}
</script>

<style lang='sass' scoped>

  #main-wrapper, .el-container
    height: 100vh

  .Footer
    text-align: center
    justify-content: center
    padding: 35px
    padding-bottom: 0px

  /deep/ .el-header
    padding: 0
    z-index: 1000
    overflow-x: auto

</style>
