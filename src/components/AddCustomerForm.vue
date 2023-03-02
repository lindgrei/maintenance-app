
<template>
  <div class="container">
    <form>
      <div class="form-group">
        <label for="name">Name:</label>
        <input type="text" class="form-control" id="name" v-model="name">
      </div>
      <div class="form-group">
        <label for="address">Address:</label>
        <input type="text" class="form-control" id="address" v-model="address">
      </div>
      <div class="form-group">
        <label for="phone">Phone Number:</label>
        <input type="text" class="form-control" id="phone" v-model="phone">
      </div>
      <button type="submit" class="btn btn-primary" @click.prevent="addCustomer">Submit</button>
    </form>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'AddCustomerForm',
  data() {
    return {
      name: '',
      address: '',
      phone: '',
    };
  },
  methods: {
    addCustomer() {
      const data = {
        name: this.name,
        address: this.address,
        phoneNumber: this.phone,
      };
      axios.post('http://localhost:8080/v1/customer/add', data)
          .then(response => {
            console.log(response);
          })
          .catch(error => {
            console.log(error);
          });
    },
  },
};
</script>
