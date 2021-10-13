<template>
  <TickerInput/>
  <IndexTable/>
</template>

<script>
import TickerInput from './components/TickerInput.vue'
import IndexTable from './components/IndexTable.vue'

export default {
  name: 'App',
  components: {
    TickerInput,
    IndexTable,
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #ffffff;
  margin-top: 60px;
}
html {
  height: 100%;
  background: -webkit-linear-gradient(
      45deg, #49a09d, #5f2c82);
  background: linear-gradient(
      45deg, #49a09d, #5f2c82);
}
</style>
