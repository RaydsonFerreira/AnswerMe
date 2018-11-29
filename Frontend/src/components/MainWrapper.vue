<template>
<div id='main-wrapper'>
    <div class='container'>
        <router-view></router-view>

    </div>
    <div class='Footer'>© 2018 - Answer Me</div>
</div>
</template>

<script>
export default {
  name: 'MainWrapper',

  methods: {
  }
}
</script>

<style scoped>

#main-wrapper, .container{
    height: 80vh !important;
}

.Footer{
    text-align: center;
    justify-content: center;
    padding: 35px;
    padding-bottom: 0px;
}

</style>
