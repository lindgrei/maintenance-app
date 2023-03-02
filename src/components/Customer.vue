<template>
  <div class="container">
    <div class="row">
      <div class="col-lg-8 offset-lg-2">
        <h1 class="text-center">Maintenance App</h1>
        <hr>
        <div class="card">
          <div class="card-header">
            <h3>Customers</h3>
            <input v-model="searchQuery" @keyup="getCustomers" placeholder="Search..." class="form-control">
          </div>

          <div class ="card-header">
            <router-link to="/add-customer">
              <button type="button" class="btn btn-primary" onclick="location.href = 'addCustomer.html'">Add Customer</button>
            </router-link>
          </div>

          <div class="card-body">
            <div class="table-responsive">
              <table class="table table-striped">
                <thead>
                <tr>
                  <th style="width: 10%">Customer Id</th>
                  <th style="width: 25%">Customer Name</th>
                  <th style="width: 20%">Customer Phone Number</th>
                  <th style="width: 30%">Customer Address</th>
                  <th style="width: 15%">Date</th>
                  <th style="width: 10%">Actions</th>
                </tr>
                </thead>
                <tbody>
                <tr v-for="customer in customers" :key="customer.id">
                  <td style="width: 10%">{{ customer.id }}</td>
                  <td style="width: 25%">{{ customer.name }}</td>
                  <td style="width: 20%">{{ customer.phoneNumber }}</td>
                  <td style="width: 30%">{{ customer.address }}</td>
                  <td style="width: 15%">{{ customer.date }}</td>
                  <td style="width: 10%">
                    <router-link :to="{ name: '/EditCustomer', params: { id: customer.id }}">
                      <button type="button" class="btn btn-primary btn-block">
                        <i class="bi bi-pencil"></i> Edit
                      </button>
                    </router-link>
                    <button type="button" class="btn btn-danger btn-block" @click="deleteCustomer(customer.id)">
                      <i class="bi bi-trash"></i> Delete
                    </button>
                  </td>
                </tr>
                </tbody>
              </table>

            </div>
          </div>
          <div class="card-footer text-right">

          </div>
        </div>
      </div>
    </div>
    <router-view></router-view>
  </div>
</template>


<script>
import CustomerService from '/Users/waougri/Desktop/maintenancevue/services/CustomerService.js'

export default {
  name: 'IndexPage',
  data() {
    return {
      customers: [],
      searchQuery : ""
    }
  },
  methods: {
    async getCustomers() {
      try {
        console.log(this.searchQuery)
        const response = await CustomerService.getCustomers()
        const allCustomers = response.data.data.Customers
        if (this.searchQuery.trim() === '' || this.searchQuery === undefined || this.searchQuery === null ) {
          this.customers = allCustomers
        } else {
          this.customers = allCustomers.filter(customer =>
              customer.name?.toLowerCase().includes(this.searchQuery.toLowerCase()) ||
              customer.address?.toLowerCase().includes(this.searchQuery.toLowerCase()) ||
              customer.phoneNumber?.toLowerCase().includes(this.searchQuery.toLowerCase())
          )
        }
      } catch (error) {
        console.error(error)
      }
    }



  },
  created() {
    this.getCustomers()
  }
}
</script>
