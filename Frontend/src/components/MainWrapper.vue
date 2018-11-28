<template>
<div id='main-wrapper'>
    <div class='container'>
        <dashboard></dashboard>

        <div class='Footer'>© 2018 - Answer Me</div>
    </div>
</div>
</template>

<script>
import Dashboard from './Dashboard'
export default {
  name: 'MainWrapper',
  components: { Dashboard },

  methods: {
  }
}
</script>

<style scoped>

#main-wrapper, .container{
    height: 80vh;
}

.Footer{
    text-align: center;
    justify-content: center;
    padding: 35px;
    padding-bottom: 0px;
}

</style>
