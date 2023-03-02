package dev.waougri.maintenanceapp.Repository;

import dev.waougri.maintenanceapp.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer, Long> {

}
