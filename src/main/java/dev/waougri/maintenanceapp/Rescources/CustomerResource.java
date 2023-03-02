package dev.waougri.maintenanceapp.Rescources;

import dev.waougri.maintenanceapp.Model.Customer;
import dev.waougri.maintenanceapp.Model.Response;
import dev.waougri.maintenanceapp.Service.CustomerServiceImplementation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static java.time.LocalDateTime.now;
import static java.util.Map.of;
import static org.springframework.http.HttpStatus.OK;
@RestController
@RequestMapping("/v1/customers")
@RequiredArgsConstructor
@CrossOrigin({"http://localhost:8081/", "http://localhost:8081/addCustomer.html"})
public class CustomerResource {

    private final CustomerServiceImplementation customerService;
    @GetMapping("/list")
    public ResponseEntity<Response> getCustomers()
    {
        return ResponseEntity
                .ok(
                        Response.builder()
                                .timeStamp(now())
                                .data(of("Customers", customerService.list(30)))
                                .message("Customers Retrieved")
                                .status(OK)
                                .statusCode(OK.value())
                                .build()
                );

    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Response> getCustomerById(@PathVariable("id") Long id)
    {
        Customer customer = customerService.get(id);
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("Customer", customerService.get(id)))
                        .message("Customer Retrieved " + customer.getName())
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody @Valid Customer updatedCustomer) {
        Customer existingCustomer = customerService.get(id);
        if (existingCustomer == null) {
            return ResponseEntity.notFound().build();
        }

        // Set the ID of the updated customer to match the ID of the existing customer
        updatedCustomer.setId(id);

        Customer savedCustomer = customerService.update(updatedCustomer);
        return ResponseEntity.ok(savedCustomer);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Response> deleteById(@PathVariable("id") Long id)
    {
        customerService.delete(id);
        return ResponseEntity.ok(
                Response.builder()
                        .status(HttpStatus.OK)
                        .statusCode(OK.value())
                        .build()
        );
    }


    @CrossOrigin({"http://localhost:8081/", "http://localhost:8081/addCustomer.html"})
    @PostMapping("/add")
    public ResponseEntity<Response> addCustomer(@RequestBody @Valid Customer newCustomer)
    {

        Customer savedCustomer = customerService.create(newCustomer);
        System.out.println("Added new Customer =>" +  newCustomer.getName());
        return ResponseEntity.ok(
                Response.builder()
                        .status(HttpStatus.OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
    @PostMapping("/send-email")
    public ResponseEntity<Map<String, Object>> sendEmail(
            @RequestParam String recipientEmail,
            @RequestParam String subject,
            @RequestParam String text) {

        Map<String, Object> response = new HashMap<>();
        try {
            customerService.sendEmail(recipientEmail, subject, text);
            response.put("success", true);
            response.put("message", "Email sent successfully");
        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Failed to send email");
            response.put("error", e.getMessage());
        }
        response.put("to", recipientEmail);
        response.put("subject", subject);
        response.put("text", text);
        response.put("sentAt", new Date());

        return ResponseEntity.ok(response);
    }



}
