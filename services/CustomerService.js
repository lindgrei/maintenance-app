import axios from "axios"

const CUSTOMER_BASE_URL = 'http://localhost:8080/v1/customers/list';

class CustomerService
{
    getCustomers()
    {
        return axios.get(CUSTOMER_BASE_URL);
    }
}

export default new CustomerService();