//package dev.waougri.maintenanceapp.Model;
//
//import dev.waougri.maintenanceapp.Enumerations.JobStatus;
//import jakarta.persistence.*;
//import lombok.*;
//
//
//@Entity
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//public class Job {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(unique = true, nullable = false)
//    private Long id;
//
//    private String jobTitle;
//    private String jobDescription;
//    private JobStatus jobStatus;
//
//
//    @ManyToOne
//    @JoinColumn(name = "customer")
//    private Customer customer;
//
//}
