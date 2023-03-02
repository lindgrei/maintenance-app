<template>
  <div id = "addCustomer">
    <AddCustomerForm/>
  </div>
</template>

<script>
import AddCustomerForm from './AddCustomerForm.vue'

export default
{
  name : 'AddCustomerForm',
  components :
      {
        AddCustomerForm,
      }
}
</script>
<style>
#addCustomer {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
