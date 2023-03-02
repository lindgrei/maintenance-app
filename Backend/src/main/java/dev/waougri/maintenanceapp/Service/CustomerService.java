package dev.waougri.maintenanceapp.Service;

import dev.waougri.maintenanceapp.Model.Customer;

import java.util.Collection;

public interface CustomerService {
    Customer create(Customer customer);
    Collection<Customer> list(int limit);
    Customer get(Long id);
    Customer update(Customer customer);
    Boolean delete(Long id);
}
