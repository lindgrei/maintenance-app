package dev.waougri.maintenanceapp.Service;

import dev.waougri.maintenanceapp.Model.Customer;
import dev.waougri.maintenanceapp.Repository.CustomerRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class CustomerServiceImplementation implements CustomerService
{

    private final CustomerRepository customerRepository;
    private final JavaMailSender emailSender;



    @Override
    public Customer create(Customer customer) {
        log.info("Saving new Customer {}", customer.getName());
        return customerRepository.save(customer);
    }

    @Override
    public Collection<Customer> list(int limit) {
        log.info("Fetching all Customers...");
        return customerRepository.findAll().stream().toList();
    }

    @Override
    public Customer get(Long id) {
        log.info("Fetching Customer by Id: {}", id);
        return customerRepository.findById(id).get();
    }

    @Override
    public Customer update(Customer customer) {
        log.info("Updating Customer : {}", customer.getName());
        return customerRepository.save(customer);
    }

    @Override
    public Boolean delete(Long id) {
        log.info("Updating server by ID: {}", id);
        customerRepository.deleteById(id);
        return Boolean.TRUE;
    }

    public void sendEmail(String recipientEmail, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(recipientEmail);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }
}
