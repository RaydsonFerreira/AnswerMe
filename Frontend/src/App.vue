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
     font-family: 'BD_Cartoon_Shout';
     src: url('assets/fonts/BD_Cartoon_Shout.ttf') format('ttf');
  }
  font-family: 'BD_Cartoon_Shout', 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
  background-color: #feffff;
}
</style>
