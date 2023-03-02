import Vue from 'vue'
import App from './App.vue'
import AddCustomerForm from "@/components/AddCustomerForm.vue";
Vue.config.productionTip = false

new Vue({
  render: h => h(App),
}).$mount('#app')


new Vue({
  el: '#addCustomer',
  components: { AddCustomerForm },
  template: '<AddCustomerForm/>'
});
