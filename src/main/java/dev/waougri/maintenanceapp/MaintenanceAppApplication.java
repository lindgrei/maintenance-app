package dev.waougri.maintenanceapp;

import dev.waougri.maintenanceapp.Model.Customer;
import dev.waougri.maintenanceapp.Repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@CrossOrigin({"http://localhost:8081/", "http://localhost:8081/addCustomer.html"})
public class MaintenanceAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaintenanceAppApplication.class, args);
    }

    @Bean
    CommandLineRunner run(CustomerRepository customerRepository)
    {
        return args ->
        {
            customerRepository.save(new Customer(null, "Harold Finch", "339-999-9999", "5218, Plum Ave",Utils.date()));
            customerRepository.save(new Customer(null, "Carter", "999-999-9992", "5218, Plum Ave",Utils.date()));
            customerRepository.save(new Customer(null, "John Reece", "813-848-8229", "5218, Plum Ave", Utils.date()));
            customerRepository.save(new Customer(null, "Lionel Fusco", "999-123-9999", "5218, Plum Ave",Utils.date()));
            customerRepository.save(new Customer(null, "Emily Watson", "745-693-8821", "288, Maple Street",Utils.date()));
            customerRepository.save(new Customer(null, "Fatima Zahra", "0661-123-456", "23, Rue Mohamed VI, Casablanca",Utils.date()));
            customerRepository.save(new Customer(null, "Youssef Amrani", "0522-987-654", "36, Rue El Amal, Rabat",Utils.date()));
            customerRepository.save(new Customer(null, "Amina Benali", "0673-456-789", "12, Avenue Hassan II, Marrakech",Utils.date()));
            customerRepository.save(new Customer(null, "Abdellah El Fassi", "0539-555-777", "9, Rue Ibn Toumart, Fes",Utils.date()));
            customerRepository.save(new Customer(null, "Meryem Ouazzani", "0622-333-444", "20, Rue El Bakri, Tangier",Utils.date()));
            customerRepository.save(new Customer(null, "Said El Hadi", "0644-666-888", "27, Rue des Ecoles, Agadir",Utils.date()));
            customerRepository.save(new Customer(null, "Naima El Moussaoui", "0612-123-456", "4, Rue Sidi Brahim, Oujda",Utils.date()));
            customerRepository.save(new Customer(null, "Karim Berrada", "0666-999-333", "8, Rue Abdelkader Amara, Casablanca",Utils.date()));
            customerRepository.save(new Customer(null, "Laila Benjelloun", "0528-444-777", "17, Rue Mohammed V, Rabat",Utils.date()));
            customerRepository.save(new Customer(null, "Mohamed Abbassi", "0665-777-222", "21, Rue de la Liberté, Marrakech",Utils.date()));
            customerRepository.save(new Customer(null, "Oliver James", "568-347-9038", "726, Oak Lane",Utils.date()));
            customerRepository.save(new Customer(null, "Mia Johnson", "202-897-7891", "17, Elmwood Avenue",Utils.date()));
            customerRepository.save(new Customer(null, "Jacob Davis", "456-789-1234", "542, Chestnut Street",Utils.date()));
            customerRepository.save(new Customer(null, "Sophia Thompson", "987-654-3210", "123, Main Street",Utils.date()));
            customerRepository.save(new Customer(null, "Ethan White", "555-555-5555", "789, Broad Avenue",Utils.date()));
            customerRepository.save(new Customer(null, "Emma Green", "111-222-3333", "456, Pine Road",Utils.date()));
            customerRepository.save(new Customer(null, "William Brown", "444-555-6666", "678, Cedar Drive",Utils.date()));
            customerRepository.save(new Customer(null, "Ava Taylor", "777-888-9999", "901, Maplewood Lane",Utils.date()));
            customerRepository.save(new Customer(null, "James Wilson", "321-654-9870", "543, Oakwood Drive",Utils.date()));
            customerRepository.save(new Customer(null, "Mohammed Khan", "813-848-8229", "14, Jinnah Road, Lahore",Utils.date()));
            customerRepository.save(new Customer(null, "Jasmine Lee", "339-999-9999", "10, Flower Avenue, Tokyo",Utils.date()));
            customerRepository.save(new Customer(null, "Ethan Cohen", "999-999-9992", "45, David Street, Jerusalem",Utils.date()));
            customerRepository.save(new Customer(null, "Sofia Hernandez", "999-123-9999", "22, Plaza Mayor, Madrid",Utils.date()));
            customerRepository.save(new Customer(null, "Aiden Patel", "745-693-8821", "18, Malabar Hill, Mumbai",Utils.date()));
            customerRepository.save(new Customer(null, "Charlotte Kim", "568-347-9038", "33, Dongjak-ro, Seoul",Utils.date()));
            customerRepository.save(new Customer(null, "Lucas Garcia", "202-897-7891", "27, Plaza de Cibeles, Madrid",Utils.date()));
            customerRepository.save(new Customer(null, "Zoe Nguyen", "456-789-1234", "25, Lê Duẩn, Ho Chi Minh City",Utils.date()));
            customerRepository.save(new Customer(null, "Jackson Kim", "987-654-3210", "11, Gangnam-daero, Seoul",Utils.date()));
            customerRepository.save(new Customer(null, "Emma Wong", "555-555-5555", "8, Central, Hong Kong",Utils.date()));
            customerRepository.save(new Customer(null, "Evelyn Chen", "212-555-1212", "123 Main St.",Utils.date()));
            customerRepository.save(new Customer(null, "Nathan Kim", "718-555-1212", "456 Broadway",Utils.date()));
            customerRepository.save(new Customer(null, "Maria Rodriguez", "305-555-1212", "789 Ocean Dr.",Utils.date()));
            customerRepository.save(new Customer(null, "William Wong", "415-555-1212", "1111 California St.",Utils.date()));
            customerRepository.save(new Customer(null, "Sophia Patel", "650-555-1212", "1234 Main St.",Utils.date()));
            customerRepository.save(new Customer(null, "Jacob Singh", "408-555-1212", "5678 Elm St.",Utils.date()));
            customerRepository.save(new Customer(null, "Emily Chen", "312-555-1212", "910 Lake Shore Dr.",Utils.date()));
            customerRepository.save(new Customer(null, "Joshua Lee", "202-555-1212", "1600 Pennsylvania Ave.",Utils.date()));
            customerRepository.save(new Customer(null, "Ava Johnson", "214-555-1212", "777 Main St.",Utils.date()));
            customerRepository.save(new Customer(null, "Ethan Garcia", "713-555-1212", "321 Maple St.",Utils.date()));
        };
    }

}
