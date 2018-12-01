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
  @font-face {
     font-family: 'Heroes Legend';
     src: url('assets/fonts/Heroes Legend.ttf') format('ttf');
  }
  font-family: 'Heroes Legend' !important;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
  background-color: #feffff;
}
*{
  font-family: 'Heroes Legend' !important;
}Heroes Legend

h2{
  margin-top: 40px !important;
}
</style>
