<template>
  <div id="app">
    <!-- <img alt="Vue logo" src="./assets/logo.png"> -->
    <main-wrapper/>
  </div>
</template>

<script>
import MainWrapper from './components/MainWrapper.vue'

export default {
  name: 'app',
  components: {
    MainWrapper
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
  background-color: #feffff;
}
</style>
